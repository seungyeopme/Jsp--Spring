package month9.d22;
/*
1. Class.forName()
=> 메소드를 이용해 JDBC드라이버를 로딩시킴

2. Connection객체
=> 데이터베이스에 연결해 작업을 수행할 수 있도록 만들어주는 중요 객체 

Connection은 객체 생성할 수 없다. (Connection은 인터페이스이다.)
------------------------------------------------------여기까지 하면 데이터베이스에 접근가능
실제 sql문을 실행하기 위해서는 Statement 객체를 생성해야함!!!

Statement stmt = conn.createStatement();

1. executeQuery() => select문과 같이 결과값이 여러 개일 경우에 사용됨
2. executeUpdate() => insert, update, delete문을 이용할 때는 주로 이 함수를 사용
					  (테이블 내용이 변경만 되고 결과값이 없을 경우에 사용됨)
					  
String sql="select * from student";
ResultSet r=stmt.executeQuery(sql);

while(r.next()){
	int age=r.getInt(1);
	String name=r.getString(2);
}
ResultSet => 반환된 값을 저장(행)

값을 가져올 때
int age=r.getInt(1);
*/

// s10_db.jsp와는 별개의 파일
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class s10_db {
	public static void main(String args[]) {
	Connection con;
	try {
		//1.JDBC드라이버 인스턴스 생성
		Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		
		//2.JDBC드라이버의 인스턴스를 통해 DBMS와 연결 생성
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.14:1521/orcl",
				"sys as sysdba", "1234");
		System.out.println("success");
	}catch(SQLException ex) {
		System.out.println(ex);
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

