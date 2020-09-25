package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberDAO { 
	
 	String id="sys as sysdba";
	String pw="1234";
	String url="jdbc:oracle:thin:@localhost:1521/orcl";
	
	Connection con; // 디비에 접근하는 객체
	PreparedStatement pstm; // 쿼리실행(조작)하는 객체
	ResultSet rs; // 결과 리턴받아 자바에 저장하는 객체
	
	public void getCon() { // 디비 연결함수
		try{
			
			
			// 오라클 jdbc 이용하겠다고 선언. 로딩하는 작업
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 드라이버 연결 -> db 접속
			con=DriverManager.getConnection(url,id,pw);
			
			System.out.println("디비접속 성공");
		}catch(Exception e){
			System.out.println("디비접속에러");
		}
	}
	
	public void insertMember(Memberbean mbean) { // insert into 삽입
		getCon(); // 디비 접속 함수호출
		try {
			
			String sql="insert into Mem values(?,?,?,?,?,?,?,?)";
			pstm=con.prepareStatement(sql);
			pstm.setString(1,mbean.getId());
			pstm.setString(2,mbean.getPw1());
			pstm.setString(3,mbean.getEmail());
			pstm.setString(4,mbean.getTel());
			pstm.setString(5,mbean.getHobby());
			pstm.setString(6,mbean.getJob());
			pstm.setString(7,mbean.getAge());
			pstm.setString(8,mbean.getInfo());
			
			pstm.executeUpdate(); // 데이터갱신
			
			pstm.close();
			con.close();

		}catch (Exception e) {
			System.out.println("insert 오류");
		}
		
	}
	
	public Vector<Memberbean> allMember() {
		Vector<Memberbean> v=new Vector<Memberbean>();
		getCon();
		try {
			
			String sql="select * from mem";
			pstm=con.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				Memberbean bean=new Memberbean();
				bean.setId(rs.getString(1));
				bean.setPw1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
				//memberbean클래스가 패키징됨
				v.addElement(bean);
			}
			pstm.close();
			rs.close();
			con.close();
			
		}catch (Exception e) {
			System.out.println("allMember 오류");
		}
		
		return v;
	}
	public Memberbean oneMember(String id) {
		
		Memberbean bean=new Memberbean();
		getCon();
		try {
			
			String sql="select * from mem where id=?";
			pstm=con.prepareStatement(sql);
			
			pstm.setString(1,id);
			rs=pstm.executeQuery();
			
			if(rs.next()) { // 값이 있다면
				bean.setId(rs.getString(1));
				bean.setPw1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
			}
			pstm.close();
			rs.close();
			con.close();
			
		}catch (Exception e) {
			System.out.println("oneMember 오류");
		}
		
		return bean;
	}
	
	public String getPass(String id) {
		String pass="";
		getCon();
		String sql="select pw1 from mem where id=?";
		
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1,id);
			rs=pstm.executeQuery();
			if(rs.next()) {
				pass=rs.getString(1);
			}
			rs.close();
			pstm.close();
			con.close();
		}catch(Exception e) {
			System.out.println("겟패스 오류");
		}
	return pass;
	}
	
	public void update(Memberbean bean) {
		getCon();
		String sql="update mem set email=?, tel=? where id=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1, bean.getEmail());
			pstm.setString(2, bean.getTel());
			pstm.setString(3, bean.getId());
			pstm.executeUpdate();
			pstm.close();
			con.close();
		}catch(Exception e) {
			System.out.println("업데이트 오류");
		}
	}
	public void delete(String id) {
		getCon();
		String sql="delete from mem where id=?";
		try {
			pstm=con.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
			pstm.close();
			con.close();
		}catch(Exception e) {
			System.out.println("삭제 오류");
		}
	}
}
