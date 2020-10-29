package com.springbook.view.board;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	// 글 등록
	@RequestMapping(value = "/insertBoard.do")
	public String insertBoard(BoardVO vo) throws IOException{
		// 파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()){
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("D:/" + fileName));
		}
		
		boardService.insertBoard(vo);
		return "getBoardList.do";
	}

	// 글 수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
		return "getBoard.jsp"; // View 이름 리턴
	}
	
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap(){
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		// Null Check
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		// Model 정보 저장
		model.addAttribute("boardList", boardService.getBoardList(vo));																
		return "getBoardList.jsp"; // View 이름 리턴
	}
}
//package com.springbook.view.board;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.springbook.biz.board.BoardService;
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//@SessionAttributes("board")
//public class BoardController {
//	@Autowired
//	private BoardService boardService;
//	
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo) {
//		boardService.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
//		boardService.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo) {
//		boardService.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, Model model) {
//		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
//		return "getBoard.jsp"; // View 이름 리턴
//	}
//	
//	// 검색 조건 목록 설정
//	@ModelAttribute("conditionMap")
//	public Map<String, String> searchConditionMap(){
//		Map<String, String> conditionMap = new HashMap<String, String>();
//		conditionMap.put("제목", "TITLE");
//		conditionMap.put("내용", "CONTENT");
//		return conditionMap;
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(BoardVO vo, Model model) {
//		// Null Check
//		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
//		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
//		// Model 정보 저장
//		model.addAttribute("boardList", boardService.getBoardList(vo));																
//		return "getBoardList.jsp"; // View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.springbook.biz.board.BoardService;
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//@SessionAttributes("board")
//public class BoardController {
//	@Autowired
//	private BoardService boardService;
//	
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo) {
//		boardService.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(@ModelAttribute("board") BoardVO vo) {			
//		boardService.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo) {
//		boardService.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, Model model) {
//		model.addAttribute("board", boardService.getBoard(vo)); // Model 정보 저장
//		return "getBoard.jsp"; // View 이름 리턴
//	}
//	
//	// 검색 조건 목록 설정
//	@ModelAttribute("conditionMap")
//	public Map<String, String> searchConditionMap(){
//		Map<String, String> conditionMap = new HashMap<String, String>();
//		conditionMap.put("제목", "TITLE");
//		conditionMap.put("내용", "CONTENT");
//		return conditionMap;
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(BoardVO vo, Model model) {		
//		// Model 정보 저장
//		model.addAttribute("boardList", boardService.getBoardList(vo));																
//		return "getBoardList.jsp"; // View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//@SessionAttributes("board")
//public class BoardController {
//	
//	// 검색 조건 목록 설정
//	@ModelAttribute("conditionMap")
//	public Map<String, String> searchConditionMap(){
//		Map<String, String> conditionMap = new HashMap<String, String>();
//		conditionMap.put("제목", "TITLE");
//		conditionMap.put("내용", "CONTENT");
//		return conditionMap;
//	}
//	
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
//		System.out.println("번호 : " + vo.getSeq());
//		System.out.println("제목 : " + vo.getTitle());
//		System.out.println("작성자 : " + vo.getWriter());
//		System.out.println("내용 : " + vo.getContent());
//		System.out.println("등록일 : " + vo.getRegDate());
//		System.out.println("조회수 : " + vo.getCnt());
//		
//		boardDAO.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
//		model.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		return "getBoard.jsp"; // View 이름 리턴
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {		
//		// Model 정보 저장
//		model.addAttribute("boardList", boardDAO.getBoardList(vo));																
//		return "getBoardList.jsp"; // View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class BoardController {
//	
//	// 검색 조건 목록 설정
//	@ModelAttribute("conditionMap")
//	public Map<String, String> searchConditionMap(){
//		Map<String, String> conditionMap = new HashMap<String, String>();
//		conditionMap.put("제목", "TITLE");
//		conditionMap.put("내용", "CONTENT");
//		return conditionMap;
//	}
//	
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//		System.out.println("작성자 이름 : " + vo.getWriter());
//		boardDAO.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
//		model.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		return "getBoard.jsp"; // View 이름 리턴
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {		
//		// Model 정보 저장
//		model.addAttribute("boardList", boardDAO.getBoardList(vo));																
//		return "getBoardList.jsp"; // View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class BoardController {
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
//		model.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		return "getBoard.jsp"; // View 이름 리턴
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(
//			@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String condition,
//			@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
//			BoardDAO boardDAO, Model model) {
//		System.out.println("검색 조건 : " + condition);
//		System.out.println("검색 단어 : " + keyword);
//		// Model 정보 저장
////		model.addAttribute("boardList", boardDAO.getBoardList(vo));																
//		return "getBoardList.jsp"; // View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class BoardController {
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
//		model.addAttribute("board", boardDAO.getBoard(vo));	// Model 정보 저장 
//		return "getBoard.jsp"; 	//View 이름 리턴
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
//		model.addAttribute("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
//		return "getBoardList.jsp";  //View 이름 리턴
//	}
//}
//package com.springbook.view.board;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.springbook.biz.board.BoardVO;
//import com.springbook.biz.board.impl.BoardDAO;
//
//@Controller
//public class BoardController {
//	// 글 등록
//	@RequestMapping(value = "/insertBoard.do")
//	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.insertBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 수정
//	@RequestMapping("/updateBoard.do")
//	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.updateBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 삭제
//	@RequestMapping("/deleteBoard.do")
//	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
//		boardDAO.deleteBoard(vo);
//		return "getBoardList.do";
//	}
//
//	// 글 상세 조회
//	@RequestMapping("/getBoard.do")
//	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//		mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
//		mav.setViewName("getBoard.jsp"); // View 정보 저장
//		return mav;
//	}
//
//	// 글 목록 검색
//	@RequestMapping("/getBoardList.do")
//	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
//		mav.addObject("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
//		mav.setViewName("getBoardList.jsp"); // View 정보 저장
//		return mav;
//	}
//}