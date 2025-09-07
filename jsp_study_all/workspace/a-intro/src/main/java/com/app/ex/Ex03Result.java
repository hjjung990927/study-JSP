package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex03Result extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("fruitName", req.getParameter("fruitName"));
		req.setAttribute("fruitPrice", req.getParameter("fruitPrice"));
		req.getRequestDispatcher("/ex03-result.jsp").forward(req, resp);
	}
}
