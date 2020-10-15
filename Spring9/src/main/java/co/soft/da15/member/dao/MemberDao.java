package co.soft.da15.member.dao;
//삽입
//검색
//수정
//삭제	
public interface MemberDao {
	
	void memInsert(String id, String pw, String email);
	void memUpdate();
	void memDelete();
	Member memSelect(String id, String pw);
	
	//MemberDaoA

}