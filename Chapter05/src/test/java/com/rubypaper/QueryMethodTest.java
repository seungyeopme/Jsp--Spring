/*Page<T>타입 사용하기*/
//package com.rubypaper;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//
//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//		
//		Page<Board> pageInfo = boardRepo.findByTitleContaining("제목", paging);
//		
//		System.out.println("PAGE SIZE : " + pageInfo.getSize());
//		System.out.println("TOTAL PAGES : " + pageInfo.getTotalPages());
//		System.out.println("TOTAL COUNT : " + pageInfo.getTotalElements());
//		System.out.println("NEXT : " + pageInfo.nextPageable());
//		
//		List<Board> boardList = pageInfo.getContent();
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*페이징과 정렬 처리하기*/
/*정렬 처리*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//		
//		List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*페이징과 정렬 처리하기*/
/*페이징 처리*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5);
//		
//		List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*쿼리 메소드 활용하기*/
/*데이터 정렬하기*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitleContainingOrderBySeqDesc() {
//		List<Board> boardList = 
//			boardRepo.findByTitleContainingOrderBySeqDesc("17");
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*쿼리 메소드 활용하기*/
/*여러 조건 사용하기*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitleContainingOrContentContaining() {
//		List<Board> boardList = 
//			boardRepo.findByTitleContainingOrContentContaining("17", "17");
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*쿼리 메소드 활용하기*/
/*LIKE 연산자 사용하기*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testByContentContaining() {
//		List<Board> boardList = boardRepo.findByContentContaining("17");
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}

/*쿼리 메소드 사용하기*/
//package com.rubypaper;
//
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.rubypaper.domain.Board;
//import com.rubypaper.persistence.BoardRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class QueryMethodTest {
//	@Autowired
//	private BoardRepository boardRepo;
//	
//	@Before
//	public void dataPrepare() {
//		for (int i = 1; i <= 200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 " + i);			
//			board.setCreateDate(new Date());	
//			board.setCnt(0L);
//			boardRepo.save(board);
//		}
//	}
//	
//	@Test
//	public void testFindByTitle() {
//		List<Board> boardList = boardRepo.findByTitle("테스트 제목 10");
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
//}
	
	




	


	

//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
//		
//		Page<Board> pageInfo = boardRepo.findByTitleContaining("제목", paging);
//		
//		System.out.println("PAGE SIZE : " + pageInfo.getSize());
//		System.out.println("TOTAL PAGES : " + pageInfo.getTotalPages());
//		System.out.println("TOTAL COUNT : " + pageInfo.getTotalElements());
//		System.out.println("NEXT : " + pageInfo.nextPageable());
//		
//		List<Board> boardList = pageInfo.getContent();
//		
//		System.out.println("검색 결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}