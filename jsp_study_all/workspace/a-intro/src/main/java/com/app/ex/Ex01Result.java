//package com.app.ex;
//
//import java.io.IOException;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//public class Ex01Result extends HttpServlet{
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		forward 로 보낼 때
//		req.setAttribute("userName", req.getParameter("userName") + "님");
//		req.getRequestDispatcher("/ex01-result.jsp").forward(req, resp);
//	}
//}

package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex01Result extends HttpServlet{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String memberName = req.getParameter("memberName") + "님";
      req.setAttribute("memberName", memberName);
      req.getRequestDispatcher("/ex01-result.jsp").forward(req, resp);
   }
}

