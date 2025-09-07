package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex02Result extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		ex02-result.jsp로 이동
		req.setAttribute("number01", req.getParameter("number01"));
		req.setAttribute("number02", req.getParameter("number02"));
		req.setAttribute("result", req.getParameter("result"));
		
		req.getRequestDispatcher("/ex02-result.jsp").forward(req, resp);
	}
}
