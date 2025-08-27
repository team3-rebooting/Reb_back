package com.sol.app.donation;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.google.gson.Gson;

/**
 * KakaoPayController
 * - 후원 금액 받아서 카카오페이 ready API 호출
 * - next_redirect_pc_url 포함 JSON 반환
 * - 성공/실패 status 포함
 */
public class DonationReadyOkController implements Execute {


    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson(); // JSON 변환용
        Map<String, Object> resultMap = new HashMap<>(); // 결과 담을 Map

        try {
            // 1. 클라이언트에서 전달한 후원 금액 읽기
            int amount = Integer.parseInt(request.getParameter("amount"));

            // 2. 가맹점 주문번호 생성 (UUID로 고유값)
            String partnerOrderId = UUID.randomUUID().toString();

            // 3. 결제자 식별 ID (로그인 시스템 있으면 회원ID)
            String partnerUserId = "guest";

            // 4. 카카오페이 ready API 요청용 Map 구성
            Map<String, String> requestMap = new HashMap<>();
            requestMap.put("partner_order_id", partnerOrderId);
            requestMap.put("partner_user_id", partnerUserId);
            requestMap.put("item_name", "후원하기");
            requestMap.put("total_amount", String.valueOf(amount));

            // 5. 결제 성공/취소/실패 URL 구성
            String baseUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();
            requestMap.put("approval_url", baseUrl + "/donation/donationResponse.do?amount=" + amount);
            requestMap.put("cancel_url", baseUrl + "/sponsorship-input.jsp");
            requestMap.put("fail_url", baseUrl + "/sponsorship-input.jsp");

            // 6. 카카오페이 API 호출
            KakaoPayService kakaoPayService = new KakaoPayService();
            Map<String, Object> kakaoResp = kakaoPayService.readySimple(requestMap);

            // 7. API 호출 성공 시 resultMap에 값 저장
            resultMap.put("status", "success");
            resultMap.put("next_redirect_pc_url", kakaoResp.get("next_redirect_pc_url"));

        } catch (Exception e) {
            // 8. 예외 발생 시 resultMap에 fail status 저장
            e.printStackTrace();
            resultMap.put("status", "fail");
        }

        // 9. JSON 형태로 클라이언트에 응답
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(gson.toJson(resultMap));
        out.close();

        // 10. Front Controller에서 포워드/리다이렉트 처리 필요 없음
        return null;
    }
}
