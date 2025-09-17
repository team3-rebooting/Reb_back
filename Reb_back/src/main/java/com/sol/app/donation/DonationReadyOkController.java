package com.sol.app.donation;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;
import com.google.gson.Gson;


public class DonationReadyOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();
        Map<String, Object> resultMap = new HashMap<>();

        try {
            int amount = Integer.parseInt(request.getParameter("amount"));
            HttpSession session = request.getSession();
            String baseUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort();

            DonationService donationService = new DonationService();
            Map<String, Object> kakaoResp = donationService.ready(amount, session, baseUrl);

            resultMap.put("status", "success");
            resultMap.put("next_redirect_pc_url", kakaoResp.get("next_redirect_pc_url"));
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("status", "fail");
        }

        response.setContentType("application/json;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print(gson.toJson(resultMap));
        out.close();

        return null;
    }

}
