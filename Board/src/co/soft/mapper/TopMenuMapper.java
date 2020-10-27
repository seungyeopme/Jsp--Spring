package co.soft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import co.soft.beans.BoardInfoBean;

public interface TopMenuMapper {
	
	@Select("select board_info_idx, board_info_name " +
			"from board_info_table " + 
			"order by board_info_idx")
	List<BoardInfoBean> getTopMenuList();
}
