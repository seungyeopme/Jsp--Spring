package month9.d22;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s13
 */
@WebServlet("/s13")
public class s13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public s13() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");

		String name=request.getParameter("name");
		int jumin=Integer.parseInt(request.getParameter("ju"));
		String id=request.getParameter("id");
		String pw=request.getParameter("pass");
		String email=request.getParameter("email");
		String post=request.getParameter("post");
		String addr=request.getParameter("addr");
		String pnum=request.getParameter("tel");
		String job=request.getParameter("job");
		String yn=request.getParameter("yesno");

		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.print("이름:"+name+"<br>");
		out.print("주민번호:"+jumin+"<br>");
		out.print("id:"+id+"<br>");
		out.print("pw:"+pw+"<br>");
		out.print("이메일:"+email+"<br>");
		out.print("우편 번호:"+post+"<br>");
		out.print("주소:"+addr+"<br>");
		out.print("폰 번호:"+pnum+"<br>");
		out.print("직업:"+job+"<br>");
		out.print("수신 동의/비동의:"+yn+"<br>");
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
