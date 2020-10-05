package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void getCon() {
		try {
			Context initctx=new InitialContext();
			Context envctx=(Context)initctx.lookup("java:comp/env");
			DataSource ds=(DataSource)envctx.lookup("jdbc/pool");
			
			con=ds.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//새로운 게시글이 넘어와서 저장되는 메소드
	public void insertBoard(BoardBean bean) {
		getCon();
		
		int ref=0; //글 그룹 
		int re_step=1; //새글이므로 = 부모글이므로
		int re_level=1;
		
		try {
			//가장 큰 ref값을 읽어온다.
			String refsql="select max(ref) from board";
			pstmt=con.prepareStatement(refsql);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				ref=rs.getInt(1)+1; //최대값에 1을더해 글그룹설정
			}
			//실제로 전체값을 테이블에 삽입
			String sql="insert into board values(board_seq.NEXTVAL,?,?,?,?,sysdate,?,?,?,0,?)";
			
			pstmt=con.prepareStatement(sql);
			//?에 값 맵핑
			pstmt.setString(1, bean.getWriter());
			pstmt.setString(2, bean.getEmail());
			pstmt.setString(3, bean.getSubject());
			pstmt.setString(4, bean.getPassword());
			pstmt.setInt(5, ref);
			pstmt.setInt(6, re_step);
			pstmt.setInt(7, re_level);
			pstmt.setString(8, bean.getContent());
			
			pstmt.executeUpdate();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//모든 게시글들을 리턴해주는 메소드
	public Vector<BoardBean> getAllBoard() {
		Vector<BoardBean> v=new Vector<>();
		getCon();
		try {
			String sql="select * from board order by ref desc, re_step asc";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//데이터를 패키징
				BoardBean bean=new BoardBean();
				bean.setNum(rs.getInt(1));
				bean.setWriter(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setSubject(rs.getString(4));
				bean.setPassword(rs.getNString(5));
				bean.setReg_date(rs.getDate(6).toString());
				bean.setRef(rs.getInt(7));
				bean.setRe_step(rs.getInt(8));
				bean.setRe_level(rs.getInt(9));
				bean.setRe_readcount(rs.getInt(10));
				bean.setContent(rs.getString(11));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	public BoardBean getOneBoard(int num) {
		BoardBean bean=new BoardBean();
		getCon();
		
		try {
			//조회수 증가
			String readsql="update board set readcount=readcount+1 where num=?";
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			String sql="select * from board where num=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,  num);
			pstmt.e
					//num을 기준으로 readcount를 1씩 증가
		}
	}
}