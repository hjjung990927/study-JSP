package com.app.member;

import java.io.IOException;

import com.app.Result;
import com.app.member.controller.JoinOkController;
import com.app.member.controller.LoginOkController;
import com.app.member.controller.LogoutController;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		사용자가 보낸 URL에 필요한 경로만 잘라낸다.
		String uri = req.getRequestURI();
		String target = uri.substring(0, uri.lastIndexOf(".")).replace(req.getContextPath(), "");
		Result result = null;
		
		if(target.equals("/login")) {
			result = new Result();
			result.setPath("/member/login.jsp");
//			로그인 화면(login.jsp)으로 이동
			
		}else if (target.equals("/login-ok")) {
			result = new LoginOkController().execute(req, resp);

			
		}else if (target.equals("/join")) {
			result = new Result();
			result.setPath("/member/join.jsp");
//			회원가입 화면(join.jsp)으로 이동
			
		}else if (target.equals("/join-ok")) {
			result = new JoinOkController().execute(req, resp);
			
		}else if (target.equals("/my-page")) {
			result = new Result();
			result.setPath("/member/my-page.jsp");
			
		}else if (target.equals("/logout")) {
			result = new LogoutController().execute(req, resp);
		}

//		사용자가 /join-ok 경로로 요청을 보냄 
//		FrontController가 JoinOkController 객체를 생성 후
//		execute() 메서드를 호출해서 회원가입 처리
//		처리 결과를 담은 result 를 돌려 받고
//		FrontController가 그 result 를 보고 어디로 보낼 지 밑에서 정한다.
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
//		isRedirect()가 true -> sendRedirect로 응답(URL 새로고침)
//		isRedirect()가 false -> forward로 요청을 JSP로 넘긴다.
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
//	POST 요청도 doGet으로 처리
}












