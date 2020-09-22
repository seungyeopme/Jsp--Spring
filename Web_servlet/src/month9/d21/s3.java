package month9.d21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 선택 하나도 안했으면 "선택할 항목 없다"
 */
/**
 * Servlet implementation class s3
 */
@WebServlet("/s3")
public class s3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ary[] = request.getParameterValues("ch");
		
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
	
		if(ary==null) {
			out.print("선택한 항목이 없다");
		}
		else {
			for(String i:ary) {
				out.print(i);
			}	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
