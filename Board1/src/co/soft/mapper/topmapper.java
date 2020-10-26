package co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import co.soft.beans.BoardInfo;

public interface topmapper {

	@Select("select board_idx, board_name" 
			+"from board_info_table" + 
			"order by board_idx")
	
	List<BoardInfo> get_toplist(); //추상메소드
	
}
