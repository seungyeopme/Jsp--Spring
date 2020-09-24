package month9.d24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class s20_MemberDAO {
	String id="sys as sysdba";
	String pass="1234";
	String url="jdbc:oracle:thin:@192.168.0.14:1521/orcl";

	//데이터베이스에 접근할 수 있도록
	Connection con;
	
	//쿼리실행(조작)시키는 객체
	PreparedStatement pstmt;
	
	//결과리턴받아 자바에 저장하는 객체
	ResultSet rs;
	
	//db 접속
	public void getCon() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,id,pass);
		}catch(Exception e) {}
	}

	public void insertMember(s20_MemberBean mbean) {
		//삽입
		try {
			getCon(); //위 함수 호출(db접속함수)
			
			String sql="insert into Mem values(?,?,?,?,?,?,?,?)";
			
			//바인드 변수에 맞게 데이터 맵핑
			//바인드 변수 => ? ? ? ? ? ? ? ?
			//테이블에 저장
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			//setString(get)
			//1 => 테이블 인덱스, db테이블에 넣겠다
			pstmt.setString(1,mbean.getId()); 
			pstmt.setString(2,mbean.getPw1());
			pstmt.setString(3,mbean.getEmail());
			pstmt.setString(4,mbean.getTel());
			pstmt.setString(5,mbean.getHobby());
			pstmt.setString(6,mbean.getJob());
			pstmt.setString(7,mbean.getAge());
			pstmt.setString(8,mbean.getInfo());
			
			//insert, update, delete 사용 시 쓰는 메소드
			pstmt.executeUpdate();
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();		
		}
		}
	public Vector<s20_MemberBean>allMember() {
		//입력한 데이터들 전부 조회 => 반환형: 벡터
		Vector<s20_MemberBean> v= new Vector<>();
		try {
			//db 연결
			getCon();
			
			String sql="select * from mem";
			pstmt=con.prepareStatement(sql);
			
			//빈 클래스에 저장
			rs=pstmt.executeQuery();
			
			//저장된 값이 여러 개이기 때문에 반복문으로
			while(rs.next()) {
				s20_MemberBean bean=new s20_MemberBean();
				
				//s20_memberbean 클래스가 패키징됨
				//컬럼으로 나눠진 데이터들을 빈 클래스에 저장
				bean.setId(rs.getString(1));
				bean.setPw1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
				v.add(bean);//반환형 벡터
			}
		}catch(Exception e) {}
		return v;
	}
	
	public s20_MemberBean oneMember(String id) {
		//한 회원 정보 조회
		s20_MemberBean bean=new s20_MemberBean();
		try {
			//db 연결
			getCon();
			String sql="select * from mem where id=?";
			
			//?에 값을 매핑
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				//데이터가 있다면
				//값 가져와서 빈 클래스에 저장
				bean.setId(rs.getString(1));
				bean.setPw1(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setJob(rs.getString(6));
				bean.setAge(rs.getString(7));
				bean.setInfo(rs.getString(8));
			}
			con.close();
		}catch(Exception e) {}
		return bean;
	}
}