package month9.d23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import month9.d23.s21_RegisterBean;

public class s21_RegisterM {
	private final String JDBC_DRIVER=
			"oracle.jdbc.driver.OracleDriver";
	private final String JDBC_URL=
			"jdbc:oracle:thin:@localhost:1521/orcl";
	private final String USER="sys as sysdba";
	private final String PASS="1234";
	
	public s21_RegisterM() {
		try {
			Class.forName(JDBC_DRIVER);
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	public Vector<s21_RegisterBean> getRegi() throws SQLException {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		Vector<s21_RegisterBean> v=
				new Vector<s21_RegisterBean>();
		
		try {
			con=DriverManager.getConnection(JDBC_URL, USER, PASS);
			String query="select * from tbl";
			
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				s21_RegisterBean bean=
						new s21_RegisterBean();
				
				//값을 각각꺼내와서 테이블에 저장
				bean.setId(rs.getNString("id"));
				bean.setPw(rs.getString("pw"));
				bean.setName(rs.getString("name"));
				bean.setEmail(rs.getString("email"));
				bean.setAdr(rs.getString("adr"));
				bean.setJob(rs.getString("job"));
			
				//벡터에 RegisterBean 객체 저장
				//addElement
				v.addElement(bean);			
			}
		}catch(Exception e) {
			System.out.println("error");
		}rs.close();
		stmt.close();
		con.close();
	
		return v;
	}
}