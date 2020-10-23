package co.soft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.dao.Dao;

@Service
public class service {
	@Autowired
	private Dao d;
	
	public String se() {
		String a =  d.ddb();
		return a;
	}
}