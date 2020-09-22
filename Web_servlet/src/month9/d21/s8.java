package month9.d21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s8
 */
@WebServlet("/s8")
public class s8 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc=kr");
        
        String []mail=request.getParameterValues("mail");
        String hi=request.getParameter("hi");
        
        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        for(int i=0;i<mail.length;i++) {
           out.print(mail[i]+"<br>");
           
        }
        out.print(hi+"<br>");
        out.print("</body></html>");
        out.close();


	}

}
