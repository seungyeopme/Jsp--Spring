package Filetrans;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/upload.do")
public class UpServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public UpServlet() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      response.getWriter().append("Served at: ").append(request.getContextPath());
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter pw = response.getWriter();
      String save = "upload";
      int maxSize = 2 * 1024 * 1024 * 5;
      String envType = "UTF-8";

      ServletContext con = getServletContext();
      String fol = con.getRealPath(save);
      System.out.println(fol);
      try {
      MultipartRequest multi = new MultipartRequest(request, fol, maxSize, envType, new DefaultFileRenamePolicy());
      String name = multi.getFilesystemName("upload");
      if (name == null) {
         System.out.println("파일이 업로드 안됨");
      } else {
         // name,title,file 출력
         pw.println(multi.getParameter("name"));
         pw.print("<br>");
         pw.println(multi.getParameter("title"));
         pw.print("<br>");
         pw.println(name);
      }
      }catch(Exception e) {
         e.printStackTrace();
      }
   }

}