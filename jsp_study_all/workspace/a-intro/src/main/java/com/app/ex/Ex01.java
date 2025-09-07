//package com.app.ex;
//
//import java.io.IOException;
//import java.net.URLEncoder;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class Ex01 extends HttpServlet{
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.getRequestDispatcher("/ex01.jsp").forward(req, resp);
//	}
//	
////	다른 서블릿으로 요청할 때 redirect
//	
////	redirect 쓰면 request 정보가 다 날라감
////	그래서 쿼리스트링으로 객체를 담아서 가라
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.sendRedirect(req.getContextPath() + "/ex01-result?userName=" + URLEncoder.encode(req.getParameter("userName"), "UTF-8"));
////		System.out.println(req.getParameter("userName"));
//	}
//}

package com.app.ex;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex01 extends HttpServlet{
   
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.getRequestDispatcher("/ex01.jsp").forward(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String memberName = req.getParameter("memberName");
      
      resp.sendRedirect(req.getContextPath() + "/ex01-result?memberName=" + URLEncoder.encode(memberName, "UTF-8"));
   }
}







