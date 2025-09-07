package com.app.ex;

import java.io.IOException;
import java.net.URLEncoder;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ex04.jsp로 이동
		req.getRequestDispatcher("/ex04.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ex04-result로 이동
		String placeName = req.getParameter("placeName");
		
		resp.sendRedirect(req.getContextPath() + "/ex04-result?placeName=" + URLEncoder.encode(placeName, "UTF-8"));
	}
}
