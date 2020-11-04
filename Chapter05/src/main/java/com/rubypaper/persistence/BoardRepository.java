/*@Query 어노테이션 사용하기*/
/*/src/test/java/com/rubypaper/QueryAnnotationTest에서 실행*/
/*페이징 및 정렬 처리하기*/
package com.rubypaper.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	@Query("SELECT b FROM Board b ORDER BY b.seq DESC")
	List<Board> queryAnnotationTest4(Pageable paging);
}

/*@Query 어노테이션 사용하기*/
/*/src/test/java/com/rubypaper/QueryAnnotationTest에서 실행*/
/*네이티브 쿼리 사용하기*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	@Query(value="select seq, title, writer, create_date "
//          + "from board where title like '%'||?1||'%' "
//		  + "order by seq desc", nativeQuery=true)
//	List<Object[]> queryAnnotationTest3(String searchKeyword);
//}

/*@Query 어노테이션 사용하기*/
/*/src/test/java/com/rubypaper/QueryAnnotationTest에서 실행*/
/*특정 변수만 조회하기*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	
//	@Query("SELECT b.seq, b.title, b.writer, b.createDate "
//			+ "FROM Board b "
//			+ "WHERE b.title like %?1% "
//			+ "ORDER BY b.seq DESC")
//	List<Object[]> queryAnnotationTest2(@Param("searchKeyword") String searchKeyword);
//}

/*@Query 어노테이션 사용하기*/
/*/src/test/java/com/rubypaper/QueryAnnotationTest에서 실행*/
/*Query 어노테이션*/
/*이름 기반 파라미터 사용하기*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	
//	@Query("SELECT b FROM Board b WHERE b.title like %:searchKeyword% ORDER BY b.seq DESC")
//	List<Board> queryAnnotationTest1(@Param("searchKeyword") String searchKeyword);
//}

/*@Query 어노테이션 사용하기*/
/*/src/test/java/com/rubypaper/QueryAnnotationTest에서 실행*/
/*Query 어노테이션*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	
//	@Query("SELECT b FROM Board b WHERE b.title like %?1% ORDER BY b.seq DESC")
//	List<Board> queryAnnotationTest1(String searchKeyword);
//}

/*Page<T>타입 사용하기*/
//package com.rubypaper.persistence;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	Page<Board> findByTitleContaining(String searchKeyword, Pageable paging);
//}

/*페이징과 정렬 처리하기*/
/*페이징 처리*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
//}


/*데이터 정렬하기*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitleContainingOrderBySeqDesc(String searchKeyword);
//}

/*여러 조건 사용하기*/
//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitleContainingOrContentContaining(String title, String content);
//}

//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByContentContaining(String searchKeyword);
//}

//package com.rubypaper.persistence;
//
//import java.util.List;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	List<Board> findByTitle(String searchKeyword);
//}

//package com.rubypaper.persistence;
//
//import org.springframework.data.repository.CrudRepository;
//
//import com.rubypaper.domain.Board;
//
//public interface BoardRepository extends CrudRepository<Board, Long> {
//	
//}