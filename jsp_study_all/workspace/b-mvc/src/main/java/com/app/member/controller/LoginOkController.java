package com.app.member.controller;

import java.io.IOException;

import com.app.Action;
import com.app.Result;
import com.app.domain.member.vo.MemberVO;
import com.app.repository.member.dao.MemberDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginOkController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		Result result = new Result();
		HttpSession session = req.getSession();
		
		memberVO.setMemberEmail(req.getParameter("memberEmail"));
		memberVO.setMemberPassword(req.getParameter("memberPassword"));
		
		MemberVO member = memberDAO.selectForLogin(memberVO);
		if(member != null) {
			session.setAttribute("member", member);
			result.setPath(req.getContextPath() + "/my-page.member");
			
		}else {
			result.setPath(req.getContextPath() + "/login.member");
		}
		
		result.setRedirect(true);
		return result;
	}
}













