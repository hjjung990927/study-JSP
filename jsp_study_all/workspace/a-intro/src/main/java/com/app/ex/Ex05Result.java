package com.app.ex;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Ex05Result extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String checkId = req.getParameter("checkId");
		String checkPassword = req.getParameter("checkPassword");
		
		if(checkId.equals("test") && checkPassword.equals("1234")) {
			req.setAttribute("checkId", checkId);
			req.getRequestDispatcher("/ex05-result.jsp").forward(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath() + "/ex05");
		}
	}
}
