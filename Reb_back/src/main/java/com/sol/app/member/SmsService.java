package com.sol.app.member;

import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SmsService {
   private static final String API_KEY = "";
   private static final String API_SECRET = "";
   private static final String FROM_NUMBER = "";

   public String sendVerificationSms(String to) throws CoolsmsException {
      Message coolsms = new Message(API_KEY, API_SECRET);
      String verificationCode = generateVerificationCode();
      System.out.println("인증코드 전송 진입 완료");
//      to = to.replaceAll("[^0-9]", "");
      System.out.println("수신번호(to): " + to);

      // 누가, 누구에게, 어떤 방식으로, 어떤 내용을
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", to);
      params.put("from", FROM_NUMBER);
      params.put("type", "SMS");
      params.put("text", "[ 틈새빛 본인인증 ] 인증번호는 [" + verificationCode + "] 입니다.");

      JSONObject obj = (JSONObject) coolsms.send(params);
      System.out.println(obj.toString());
      System.out.println("인증코드 전송 작업");

      return verificationCode;
   }

   private String generateVerificationCode() {
      Random random = new Random();
      StringBuilder code = new StringBuilder();
      for (int i = 0; i < 6; i++) {
         code.append(random.nextInt(10));
      }
      return code.toString();
   }
}