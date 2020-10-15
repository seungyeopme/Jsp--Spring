package co.soft.da15.member.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import co.soft.da15.member.Member;

@Repository
public class MemberDaoA implements MemberDao {
	
	private HashMap<String, Member> db;
	
	public MemberDaoA() {
		db = new HashMap<String, Member>();
	}
	
	public void memInsert(String id, String pw, String email) {
	
		Member member = new Member();
		
		
	}
}
