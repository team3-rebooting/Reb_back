package com.sol.app.donation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sol.app.Execute;
import com.sol.app.Result;

public class DonationResponseOkController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Result result = new Result();
        HttpSession session = request.getSession();
        Integer memberNumber = (Integer) session.getAttribute("memberNumber");

        if (memberNumber == null) {
            result.setPath("/app/auth/login.jsp");
            return result;
        }

        try {
            String pgToken = request.getParameter("pg_token");
            int amount = Integer.parseInt(request.getParameter("amount"));

            DonationService donationService = new DonationService();
            donationService.approve(pgToken, amount, session);

            request.setAttribute("amount", amount);
            result.setPath("/app/donation/sponsorship-complete.jsp");
            result.setRedirect(false);

        } catch (Exception e) {
            e.printStackTrace();
            result.setPath("/app/donation/sponsorship-fail.jsp");
            result.setRedirect(false);
        }

        return result;
    }
}
