package co.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.beans.BoardInfo;
import co.soft.dao.topdao;

@Service
public class topservice {
	
	@Autowired
	public topdao tdao;
	
	public List<BoardInfo> get_toplist() {
		List<BoardInfo> topmenu = tdao.get_toplist();
		return topmenu;
	}
}
