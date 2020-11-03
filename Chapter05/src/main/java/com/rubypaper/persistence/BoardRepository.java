/*페이징과 정렬 처리하기*/
/*페이징 처리*/
package com.rubypaper.persistence;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.rubypaper.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {
	List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
}


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