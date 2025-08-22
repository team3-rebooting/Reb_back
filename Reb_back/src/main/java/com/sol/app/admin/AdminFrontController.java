package com.sol.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.app.Result;

/**
 * Servlet implementation class AdminFrontController
 */
public class AdminFrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doProcess(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doProcess(request, response);
   }
     protected void doProcess(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");

            String target = request.getRequestURI().substring(request.getContextPath().length());
            Result result = new Result();
            
            switch(target) {
               case "/admin/login.ad" :
                  System.out.println("login으로 가야됨");
                  request.getRequestDispatcher("/app/admin/login/admin-login.jsp").forward(request, response);
                  System.out.println("login에서 돌아옴");
                  break;
               case "/admin/loginOk.ad" :
                  System.out.println("로그인오케이 가야됨");
                  result = new LoginOkController().execute(request, response);
                  System.out.println("로그인오케이 돌아옴");
                  break;
               case "/admin/noticeListOk.ad" :
                  System.out.println("공지사항 리스트");
                  result = new NoticeListOkController().execute(request, response);
                  break;
               case "/admin/noticeCreate.ad" :
            	  System.out.println("공지사항 생성");
            	  request.getRequestDispatcher("/app/admin/notice/admin-notice-create.jsp").forward(request, response);
            	  break;
               case "/admin/routineListOk.ad" :
            	  System.out.println("루틴목록 리스트");
            	  result = new RoutineListOkController().execute(request, response); 
            	  break;
               case "/admin/memberListOk.ad" :
            	  System.out.println("회원목록 리스트");
//            	  result = new MemberListOkController().execute(request,response);
            	  break;
            }
            
            if (result != null && result.getPath() != null) {
            if (result.isRedirect()) {
               response.sendRedirect(result.getPath());
            } else {
               request.getRequestDispatcher(result.getPath()).forward(request, response);
            }
         }
            
            
     }
}
