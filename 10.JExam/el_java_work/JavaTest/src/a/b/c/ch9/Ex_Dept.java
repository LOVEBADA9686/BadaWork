package a.b.c.ch9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ex_Dept {

	// 상수 
	// 데이터베이스 연결 정보 : DataSource : 앞으로는 데이터베이스 연결정보를 데이터소스라고 부른다. 
	// 데이터베이스 연결 정보에는 무엇이 있어야 하는가 
	// 1. jdbc 드라이버 시작점 네임스페이스 
	// 2. 데이터베이스 연결 url 
	// 3. 계정명
	// 4. 계정명의 패스워드 
	public static final String ORCL_JDBC_DIRVER = "oracle.jdbc.driver.OracleDriver";
	public static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String ORCL_USER = "scott";
	public static final String ORCL_PASS = "tiger";
	
	// 쿼리문 
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	// 멤버변수
	
	// 생성자
	public Ex_Dept() {
		try {
			Class.forName(Ex_Dept.ORCL_JDBC_DIRVER);
		}catch(Exception e) {
			System.out.println("에러가 : JDBC 드라이버 : ojdbc6.jar를 찾지 못했네요 >>> : " + e.getMessage());
		}
	}

	// 함수 
	public ArrayList deptSelect() {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList aList = null;
		
		try {
			
			conn = DriverManager.getConnection( Ex_Dept.ORCL_URL
					                           ,Ex_Dept.ORCL_USER
					                           ,Ex_Dept.ORCL_PASS);
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(Ex_Dept.DEPT_SELECT);
			
//			10	ACCOUNTING	NEW YORK
//			20	RESEARCH	DALLAS
//			30	SALES	CHICAGO
//			40	OPERATIONS	BOSTON
			
			if (rsRs !=null) {
				aList = new ArrayList();
				
				while (rsRs.next()) {
					
					Ex_DeptVO dvo = new Ex_DeptVO();
					
					dvo.setDeptno(rsRs.getString("DEPTNO"));
					dvo.setDname(rsRs.getString("DNAME"));
					dvo.setLoc(rsRs.getString("LOC"));
										
					aList.add(dvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("deptSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ex_Dept exe = new Ex_Dept();
		ArrayList aList = exe.deptSelect();
		System.out.println("aList 사이즈 :: aList 담겨있는 깡통 클래스(EmpVO) 갯수 >>> : " + aList.size() + "\n");

		if (aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				Ex_DeptVO dvo = (Ex_DeptVO)aList.get(i);
				
				System.out.print(dvo.getDeptno() + " : ");
				System.out.print(dvo.getDname() + " : ");				
				System.out.println(dvo.getLoc());				
			}		
		}
	}
}








