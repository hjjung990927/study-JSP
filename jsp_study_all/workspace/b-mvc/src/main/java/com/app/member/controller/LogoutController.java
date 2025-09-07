package com.app.member.controller;

import java.io.IOException;

import com.app.Action;
import com.app.Result;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Result result = new Result();
//		session.removeAttribute("member");
		session.invalidate();
		
		result.setPath(req.getContextPath() + "/login.member");
		result.setRedirect(true);
		return result;
	}
}











