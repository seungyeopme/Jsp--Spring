package org.comstudy21.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String command = req.getParameter("command");
		ActionForward forward = null;
		
		if(command.equals("member_form")) {
			forward = new ActionForward(false, "member/member_form.jsp");
		} else if(command.equals("confirm")) {
			forward = new ActionForward(false, "member/confirm.jsp");
		} else if(command.equals("regist")) {
			String id = req.getParameter("id");
			String pass = req.getParameter("pass");
			String email = req.getParameter("email");
			
			System.out.println(id+" / "+pass+" / "+email );
			
			forward = new ActionForward(true, "index.jsp");
		}
		
		
		forward.execute(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
