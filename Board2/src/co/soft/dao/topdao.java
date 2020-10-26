package co.soft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soft.beans.BoardInfo;
import co.soft.mapper.topmapper;

@Repository
public class topdao {
	
	@Autowired
	private topmapper top; //인터페이스
	
	public List<BoardInfo> get_toplist() {
		
		List<BoardInfo> topmenu = top.get_toplist();
		return topmenu;
	}
}
