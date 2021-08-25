package a.b.c.ch9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty;

public class Ex_Dept_2 {

	// 상수 
	
	// 쿼리문 
	public static final String DEPT_SELECT = "SELECT * FROM DEPT";
	// 멤버변수
	
	// 함수 
	public ArrayList<Ex_DeptVO> deptSelect() {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ArrayList<Ex_DeptVO> aList = null;
		
		try {
			
			conn = ConnProperty.getConnection();
			stmt = conn.createStatement();
			rsRs = stmt.executeQuery(Ex_Dept_2.DEPT_SELECT);
			
//			10	ACCOUNTING	NEW YORK
//			20	RESEARCH	DALLAS
//			30	SALES	CHICAGO
//			40	OPERATIONS	BOSTON
			
			if (rsRs !=null) {
				aList = new ArrayList<Ex_DeptVO>();
				
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
		
		
		Ex_Dept_2 exe = new Ex_Dept_2();
		ArrayList<Ex_DeptVO> aList = exe.deptSelect();
		
		System.out.println("aList 사이즈 :: aList 담겨있는 깡통 클래스(EmpVO) 갯수 >>> : " + aList.size() + "\n");

		if (aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				Ex_DeptVO dvo = aList.get(i);
				System.out.print(dvo.getDeptno() + " : ");
				System.out.print(dvo.getDname() + " : ");				
				System.out.println(dvo.getLoc());				
			}		
		}
	}
}








