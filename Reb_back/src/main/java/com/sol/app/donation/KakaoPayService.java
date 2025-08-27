package com.sol.app.donation;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.Gson;

/**
 * KakaoPayService
 * - 카카오페이 /v1/payment/ready 호출 담당
 * - Map<String,String> 요청 → Map<String,Object> 응답 반환
 */
public class KakaoPayService {

    private final String ADMIN_KEY = "ff912d39bd11f4701e8e58e910ea13b9";

    public Map<String, Object> readySimple(Map<String, String> requestMap) throws IOException {

        // 1. 카카오페이 ready API URL
        String apiUrl = "https://kapi.kakao.com/v1/payment/ready";
        URL url = new URL(apiUrl);

        // 2. HttpURLConnection 생성
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST"); // POST 요청
        conn.setRequestProperty("Authorization", "KakaoAK " + ADMIN_KEY); // Admin Key
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        conn.setDoOutput(true); // OutputStream 사용 허용

        // 3. 요청 바디 구성
        StringBuilder body = new StringBuilder();
        body.append("cid=").append(URLEncoder.encode("TC0ONETIME", "UTF-8")); // 가맹점 코드

        for (Map.Entry<String, String> entry : requestMap.entrySet()) {
            body.append("&").append(entry.getKey())
                .append("=").append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }

        body.append("&quantity=1&tax_free_amount=0"); // 고정값

        // 4. 요청 전송
        try (OutputStream os = conn.getOutputStream()) {
            os.write(body.toString().getBytes("UTF-8"));
        }

        // 5. 응답 읽기
        BufferedReader br = new BufferedReader(new InputStreamReader(
            conn.getResponseCode() == 200 ? conn.getInputStream() : conn.getErrorStream(), "UTF-8"
        ));
        StringBuilder responseStr = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            responseStr.append(line);
        }
        br.close();

        // 6. JSON → Map 변환
        Gson gson = new Gson();
        return gson.fromJson(responseStr.toString(), HashMap.class);
    }
}
