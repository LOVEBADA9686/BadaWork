package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

// 추상클래스 만듬 : new 연산자를 사용하지 못함 
public abstract class ConnProperty_Test02 {
	
	// 상수 
	// 데이터베이스 연결 정보 : DataSource : 앞으로는 데이터베이스 연결정보를 데이터소스라고 부른다. 
	// 데이터베이스 연결 정보에는 무엇이 있어야 하는가 
	// 1. jdbc 드라이버 시작점 네임스페이스 
	// 2. 데이터베이스 연결 url 
	// 3. 계정명
	// 4. 계정명의 패스워드 
	private static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "test02";
	private static final String ORCL_PASS = "1234";
	
	
	// 데이터베이스 드라이버를 찾고, 연결 까지 하는 함수 
	// 추상함수가 아닌 static 일반함수
	// ConnProperty.getConnection() 이케 사용하면 된다. 
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty_Test02.ORCL_JDBC_DIRVER);	
			conn = DriverManager.getConnection( ConnProperty_Test02.ORCL_URL
					                           ,ConnProperty_Test02.ORCL_USER
					                           ,ConnProperty_Test02.ORCL_PASS);
			
		}catch (Exception e) {
			System.out.println(   "ConnProperty :: 데이터베이스를 연결하는데 \n"
					            + "드라이버 또는 연결 과정에서 문제가 생김 >>> : \n" 
								+ e.getMessage() + "\n");
		}
		
		return conn;
	}
	
	// 연결 해제하는 함수 
}
