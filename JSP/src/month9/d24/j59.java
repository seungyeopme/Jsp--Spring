package month9.d24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class j59
 */
@WebServlet("/j59")
public class j59 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public j59() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pr = response.getWriter();
		pr.print("<html><body>");
		String []str =  request.getParameterValues("season");
		for(int i = 0 ; i<str.length;i++){
		switch (str[i]){
		case "1":
			pr.print("<div>봄</div>");
			break;
		case "2":
			pr.print("<div>여름</div>");
			break;
		case "3":
			pr.print("<div>가을</div>");
			break;
		case "4":
			pr.print("<div>겨울</div>");
			
			break;
		}

		}
	
		pr.print("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
