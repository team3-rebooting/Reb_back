package com.sol.app.donation;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import com.sol.app.dao.SponsorDAO;
import com.sol.app.dto.SponsorDTO;
import com.sol.app.member.dao.MemberDAO;

public class DonationService {

    private KakaoPayService kakaoPayService = new KakaoPayService();
    private MemberDAO memberDAO = new MemberDAO();
    private SponsorDAO sponsorDAO = new SponsorDAO();

    // 세션에 tid 저장용 키
    public static final String KAKAO_TID_SESSION_KEY = "kakao_tid";
    public static final String KAKAO_ORDER_ID_SESSION_KEY = "kakao_order_id";

    public Map<String, Object> ready(int amount, HttpSession session, String baseUrl) throws Exception {

        // 주문번호
        String partnerOrderId = UUID.randomUUID().toString();
        Integer memberNumber = (Integer) session.getAttribute("memberNumber");
        String memberName = memberDAO.findName(memberNumber);

        // 요청 파라미터
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("partner_order_id", partnerOrderId);
        requestMap.put("partner_user_id", memberName);
        requestMap.put("item_name", "틈새빛 후원");
        requestMap.put("quantity", "1");
        requestMap.put("total_amount", String.valueOf(amount));
        requestMap.put("vat_amount", "0");
        requestMap.put("tax_free_amount", "0");
        requestMap.put("approval_url", baseUrl + "/donation/donationResponse.do?amount=" + amount);
        requestMap.put("cancel_url", baseUrl + "/sponsorship-input.jsp");
        requestMap.put("fail_url", baseUrl + "/sponsorship-input.jsp");

        // 카카오페이 호출
        Map<String, Object> kakaoResp = kakaoPayService.readySimple(requestMap);

        // TID와 주문번호 세션 저장
        session.setAttribute(KAKAO_TID_SESSION_KEY, kakaoResp.get("tid"));
        session.setAttribute(KAKAO_ORDER_ID_SESSION_KEY, partnerOrderId);

        return kakaoResp;
    }

    public Map<String, Object> approve(String pgToken, int amount, HttpSession session) throws Exception {
        Integer memberNumber = (Integer) session.getAttribute("memberNumber");
        String memberName = memberDAO.findName(memberNumber);

        // ready 단계에서 저장한 tid와 주문번호 꺼내기
        String tid = (String) session.getAttribute(KAKAO_TID_SESSION_KEY);
        String partnerOrderId = (String) session.getAttribute(KAKAO_ORDER_ID_SESSION_KEY);

        // approve 파라미터
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("tid", tid);
        requestMap.put("partner_order_id", partnerOrderId);
        requestMap.put("partner_user_id", memberName);
        requestMap.put("pg_token", pgToken);

        // 카카오페이 approve 호출
        Map<String, Object> kakaoResp = kakaoPayService.approveSimple(requestMap);

        // DB 저장
        SponsorDTO sponsorDTO = new SponsorDTO();
        sponsorDTO.setSponsorAmount(amount);
        sponsorDTO.setMemberNumber(memberNumber);
        sponsorDAO.spon(sponsorDTO);

        return kakaoResp;
    }
}
