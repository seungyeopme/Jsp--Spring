package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
	
	
			if (command.equals("/BoardListAction.do")) {			//등록된 글 목록 페이지 출력하기
				requestBoardList(request);
				RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp");
				rd.forward(request, response);
				
			} 
			else if (command.equals("/BoardWriteForm.do")) {		//글 등록 페이지 출력
					requestLoginName(request);
					RequestDispatcher rd = request.getRequestDispatcher("./board/writeForm.jsp");
					rd.forward(request, response);				

			} else if (command.equals("/BoardWriteAction.do")) {	//새로운 글 등록
					requestBoardWrite(request);
					RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
					rd.forward(request, response);						
					
			} 
			else if (command.equals("/BoardViewAction.do")) {	//선택된 글 상자 페이지 가져오기
					requestBoardView(request);
					RequestDispatcher rd = request.getRequestDispatcher("/BoardView.do");
					rd.forward(request, response);						
					
			} else if (command.equals("/BoardView.do")) {	//글 상세 페이지 출력하기
				RequestDispatcher rd = request.getRequestDispatcher("./board/view.jsp");
				rd.forward(request, response);	
			
			} 
			else if (command.equals("/BoardUpdateAction.do")) {	//선택된 글 내용 수정하기
				requestBoardUpdate(request);
				RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
				rd.forward(request, response);
			}		
			else if (command.equals("/BoardDeleteAction.do")) {	//선택된 글 삭제하기

				requestBoardDelete(request);
				RequestDispatcher rd = request.getRequestDispatcher("/BoardListAction.do");
				rd.forward(request, response);				
				
			} 
			
	}
		
	public void requestBoardList(HttpServletRequest request)	//등록된 글목록	가져오기
	{
			
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
	  	int pageNum=1;
		int limit=4;
		
		if(request.getParameter("pageNum")!=null){
			pageNum=Integer.parseInt(request.getParameter("pageNum"));
		}		
		
		String items = request.getParameter("items");
		String text = request.getParameter("text");
		
		int total_record=dao.getListCount();
		boardlist = dao.getBoardList(pageNum,limit, items, text); 
		
		int total_page;
		
		if (total_record % limit == 0){     
	     	total_page =total_record/limit;
	     	Math.floor(total_page);  
		}
		else{
		   total_page =total_record/limit;
		   Math.floor(total_page); 
		   total_page =  total_page + 1; 
		}		
   
   		request.setAttribute("pageNum", pageNum);		  
   		request.setAttribute("total_page", total_page);   
		request.setAttribute("total_record",total_record); 
		request.setAttribute("boardlist", boardlist);			
		
							
	}
	public void requestLoginName(HttpServletRequest request)		//인증된 사용자명 가져오기
	{
					
		String id = request.getParameter("id");
		
		BoardDAO  dao = BoardDAO.getInstance();
		
		String name = dao.getLoginNameById(id);		
		
		request.setAttribute("name", name);		  
							
	}
	public void requestBoardWrite(HttpServletRequest request)		//새로운 글 등록하기
	{
					
		BoardDAO dao = BoardDAO.getInstance();		
		
		BoardDTO board = new BoardDTO();
		board.setId(request.getParameter("id"));
		board.setName(request.getParameter("name"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));	
		
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("subject"));
		System.out.println(request.getParameter("content"));
		java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd(HH:mm:ss)");
		String regist_day = formatter.format(new java.util.Date()); 
		
		board.setHit(0);
		board.setRegist_day(regist_day);
		board.setIp(request.getRemoteAddr());			
		
		dao.insertBoard(board);			
							
	}
	public void requestBoardView(HttpServletRequest request)	//선택된 글 상세	페이지 가져오기
	{
					
		BoardDAO dao = BoardDAO.getInstance();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDTO board = new BoardDTO();
		board = dao.getBoardByNum(num, pageNum);		
		
		request.setAttribute("num", num);		 
   		request.setAttribute("page", pageNum); 
   		request.setAttribute("board", board);   		
		
							
	}
	public void requestBoardUpdate(HttpServletRequest request)	//선택된 글 내용 수정하기
	{
					
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDAO dao = BoardDAO.getInstance();		
		
		BoardDTO board = new BoardDTO();		
		board.setNum(num);
		board.setName(request.getParameter("name"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));		
		
		 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy/MM/dd(HH:mm:ss)");
		 String regist_day = formatter.format(new java.util.Date()); 
		 
		 board.setHit(0);
		 board.setRegist_day(regist_day);
		 board.setIp(request.getRemoteAddr());			
		
		 dao.updateBoard(board);		
		
							
	}
	public void requestBoardDelete(HttpServletRequest request) //선택된 글 삭제하기
	{
					
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));	
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.deleteBoard(num);		  	
							
	}
	
	
}
