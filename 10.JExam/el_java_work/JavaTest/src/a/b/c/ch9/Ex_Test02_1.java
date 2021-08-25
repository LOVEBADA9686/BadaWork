package a.b.c.ch9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import a.b.c.common.ConnProperty_Test02;


// ArrayList<Ex_Test02VO> 제너릭 버전 
public class Ex_Test02_1 {
	
	// 쿼리문 
	public static final String T3_SELECT = "SELECT * FROM T3";
	// 멤버변수

	// 함수 
	public ArrayList<Ex_Test02VO> t3Select() {
		
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<Ex_Test02VO> aList = null;
		
		try {
			
			conn = ConnProperty_Test02.getConnection();
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(Ex_Test02_1.T3_SELECT);
//			rsRs = stmt.executeQuery(Ex_Test02_1.T3_SELECT);
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<Ex_Test02VO>();
				
				while (rsRs.next()) {
					
					Ex_Test02VO tvo = new Ex_Test02VO();
					tvo.setT3_1(rsRs.getString("T3_1"));
					tvo.setT3_2(rsRs.getString("T3_2"));
					tvo.setT3_3(rsRs.getString("T3_3"));
					tvo.setT3_4(rsRs.getString("T3_4"));
					tvo.setT3_5(rsRs.getString("T3_5"));
					tvo.setT3_6(rsRs.getString("T3_6"));
					
					
					aList.add(tvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("t3Select() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ex_Test02_1 ext = new Ex_Test02_1();
		
		ArrayList<Ex_Test02VO> aList = ext.t3Select();

		if (aList !=null && aList.size() > 0) {
			for (int i=0; i < aList.size(); i++) {
				
				Ex_Test02VO tvo = aList.get(i);
				
				System.out.print(tvo.getT3_1() + " : ");
				System.out.print(tvo.getT3_2() + " : ");
				System.out.print(tvo.getT3_3() + " : ");
				System.out.print(tvo.getT3_4() + " : ");
				System.out.print(tvo.getT3_5() + " : ");				
				System.out.println(tvo.getT3_6());				
			}		
		}else {
			System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
		}
	}
}








