package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex02 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ex02.jsp로 이동
		req.getRequestDispatcher("/ex02.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ex02-result로 이동
		int number01 = Integer.parseInt(req.getParameter("number01"));
		int number02 = Integer.parseInt(req.getParameter("number02"));
		int result = number01 + number02;
		resp.sendRedirect(req.getContextPath() + "/ex02-result?number01=" + number01 + "&number02=" + number02 + "&result=" + result);
	}
}









