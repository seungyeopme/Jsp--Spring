package co.soft.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.soft.model.Service;

/**
 * Servlet implementation class HController
 */
@WebServlet("*.mvc")
public class HController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//요청한 주소를 갖고 오겠다.
		String url = request.getRequestURI();
		String viewName = null;
		
		if(url.contains("main.mvc")) {	
			viewName = "main.jsp";
		}
		else if(url.contains("test1.mvc")) {
			String str1 = request.getParameter("data1");
			String str2 = request.getParameter("data2");
			
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			
			int result=n1*n2;
			
			request.setAttribute("result", result);
			viewName = "test1.jsp";
		} else if(url.contains("test2.mvc")) {
			//service에 있는 add 함수 호출
			int result = Service.add(request);
			
			request.setAttribute("result", result);
			viewName = "test2.jsp";
		}
		  RequestDispatcher r = request.getRequestDispatcher(viewName); 
          r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}