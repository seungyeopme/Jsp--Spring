package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mvc.database.DBConnection;

public class BoardDAO {

	private static BoardDAO instance;
	
	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		if (instance == null)
			instance = new BoardDAO();
		return instance;
	}	
	
	public int getListCount() {		//board 테이블의 레코드 개수
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x = 0;

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement("select count(*) from board");
			rs = pstmt.executeQuery();

			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception ex) {
			System.out.println("getListCount() 에러: " + ex);
		} finally {			
			try {				
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}				
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
		
		return x;
	}

	public ArrayList<BoardDTO> getBoardList(int page, int limit, String items, String text) {		//board 테이블의 레코드 가져오기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int total_record = getListCount();
		int start = (page - 1) * limit;
		int index = start + 1;

		String sql;

		if (items == null && text == null)
			sql = "select * from board ORDER BY num DESC";
		else
			sql = "SELECT  * FROM board where " + items + " like '%" + text + "%' ORDER BY num DESC ";

		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.absolute(index)) {

				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setId(rs.getString("id"));
				board.setName(rs.getString("name"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setRegist_day(rs.getString("regist_day"));
				board.setHit(rs.getInt("hit"));
				board.setIp(rs.getString("ip"));
				list.add(board);

				if (index < (start + limit) && index <= total_record)
					index++;
				else
					break;
			}

			return list;
		} catch (Exception ex) {
			System.out.println("getBoardList() 에러 : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
			
			
		}
		return null;
	}
	public String getLoginNameById(String id) {	//member 테이블에서 인증된 id의	사용자명 가져오기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;	

		String name=null;
		String sql = "select * from member where id = ? ";

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				name = rs.getString("name");				
			}

			return name;
		} catch (Exception ex) {
			System.out.println("getBoardByNum() 에러 : " + ex);
		} finally {
			try {				
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
		return null;
	}


	public void insertBoard(BoardDTO board)  {	//board 테이블에 새로운 글 삽입하기

		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {

			conn = DBConnection.getConnection();

			//conn.setAutoCommit(false);

			String sql = "insert into board values(?, ?, ?, ?, ?, ?, ?, ?)";
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getNum());
			pstmt.setString(2, board.getId());
			pstmt.setString(3, board.getName());
			pstmt.setString(4, board.getSubject());
			pstmt.setString(5, board.getContent());
			pstmt.setString(6, board.getRegist_day());
			pstmt.setInt(7, board.getHit());
			pstmt.setString(8, board.getIp());

			pstmt.executeUpdate();

			//conn.commit();

		} catch (Exception ex) {
			System.out.println("insertBoard() 에러 : " + ex);
		} finally {
			try {								
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
		
	} 

	public void updateHit(int num) {	//선택된 글의 조회 수 증가시키기

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();

			String sql = "select hit from board where num = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			int hit = 0;

			if (rs.next()) {
				hit = rs.getInt("hit") + 1;
			}

			sql = "update board set hit=? where num=?";
			pstmt = conn.prepareStatement(sql);

			// 자동 커밋을 false로 한다.
			//conn.setAutoCommit(false);

			pstmt.setInt(1, hit);
			pstmt.setInt(2, num);

			pstmt.executeUpdate();
			// 완료시 커밋
			//conn.commit();

		} catch (Exception ex) {
			System.out.println("updateHit() 에러 : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
			
		}

	}

	public BoardDTO getBoardByNum(int num, int page) {	//선택된 글 상세 내용 가져오기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardDTO board = null;

		updateHit(num);
		String sql = "select * from board where num = ? ";

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setId(rs.getString("id"));
				board.setName(rs.getString("name"));
				board.setSubject(rs.getString("subject"));
				board.setContent(rs.getString("content"));
				board.setRegist_day(rs.getString("regist_day"));
				board.setHit(rs.getInt("hit"));
				board.setIp(rs.getString("ip"));
			}

			return board;
		} catch (Exception ex) {
			System.out.println("getBoardByNum() 에러 : " + ex);
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
		return null;
	}

	
	public void updateBoard(BoardDTO board) {	//선택된 글 내용 수정하기

		Connection conn = null;
		PreparedStatement pstmt = null;
	
		try {

			String sql = "update board set name=?, subject=?, content=? where num=?";

			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);

			// 자동 커밋을 false로 한다.
			conn.setAutoCommit(false);

			pstmt.setString(1, board.getName());
			pstmt.setString(2, board.getSubject());
			pstmt.setString(3, board.getContent());
			pstmt.setInt(4, board.getNum());

			pstmt.executeUpdate();
			// 완료시 커밋
			conn.commit();

		} catch (Exception ex) {
			System.out.println("updateBoard() 에러 : " + ex);
		} finally {
			try {			
				
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}
	} 
	public void deleteBoard(int num) {	//선택된 글 삭제하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		

		String sql = "delete from board where num=?";
	

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out.println("deleteBoard() 에러 : " + ex);
		} finally {
			try {				
				if (pstmt != null) {
					pstmt.close();
					pstmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (Exception ex) {
				throw new RuntimeException(ex.getMessage());
			}		
		}

	}

	
}
