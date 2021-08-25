package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.TestVO;

public class Ex_ArrayList_3 {
	
	public ArrayList<TestVO> memSelect() {
		
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		
		for (int i=0; i < 3; i++) {
			TestVO tvo = new TestVO();
			
			tvo.setMunm("00_" + i);
			tvo.setMid("aa_" + i);
			tvo.setMpw("aa00_" + i);
			tvo.setMhp("010_" + i);
			tvo.setMjuso("주소_" + i);
			
			aList.add(tvo);
			
			System.out.println(aList);
		}
		return aList;
	}
	
	public ArrayList<TestVO> memSelect(TestVO tvo) {
		
		// 의도적으로 데이터를 세팅하기
		ArrayList<TestVO> aList = new ArrayList<TestVO>();
		for (int i=0; i<3; i++) {
			TestVO tt = new TestVO();
			tt.setMunm("00_"+i);
			tt.setMid("aa_"+i);
			tt.setMpw("aa00_"+i);
			tt.setMhp("010_"+i);
			tt.setMjuso("주소_"+i);
			aList.add(tt);
			System.out.println(aList);
		}
		
		ArrayList<TestVO> aList_1 = new ArrayList<TestVO>();
		
		if ("00_1".equals(tvo.getMunm())) {
			
			TestVO _tvo = new TestVO();
			_tvo.setMunm(aList.get(0).getMunm());
			_tvo.setMid(aList.get(0).getMid());
			_tvo.setMpw(aList.get(0).getMpw());
			_tvo.setMhp(aList.get(0).getMhp());
			_tvo.setMjuso(aList.get(0).getMjuso());
			
			aList_1.add(_tvo);			
		}
		
		return aList_1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("조회 키워드를 입력 하시오 : 조건조회 S, 전체조회 SALL");
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();
		isud = isud.toUpperCase();
		
		if ("S".equals(isud)) {
			System.out.println("isud >>> : " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
			
			// 지역변수는 객체 또는 기초자료형도 꼭 dafault 값으로 초기화 해서 사용을 해야 한다.
			TestVO tvo = null;
			tvo = new TestVO();
			tvo.setMunm("00_1");
			
			ArrayList<TestVO> aList = ex3.memSelect(tvo);
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
			if (aList.size()>0) {
				for (int i = 0; i < aList.size(); i++) {
					TestVO _tvo = aList.get(i);
					
					System.out.print(_tvo.getMunm());
					System.out.print("" + _tvo.getMid());
					System.out.print("" + _tvo.getMpw());
					System.out.print("" + _tvo.getMhp());
					System.out.println("" + _tvo.getMjuso());
				}
			}
		}
		if ("SALL".equals(isud)) {
			System.out.println("isud >>> : " + isud);
			
			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();
						
			ArrayList<TestVO> aList = ex3.memSelect();
			
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
			if (aList.size()> 0) {
				
				for (int i=0; i < aList.size(); i++) {
					
					TestVO tvo = aList.get(i);
					
					System.out.print(tvo.getMunm());
					System.out.print("" + tvo.getMunm());
					System.out.print("" + tvo.getMid());
					System.out.print("" + tvo.getMpw());
					System.out.print("" + tvo.getMhp());
					System.out.println("" + tvo.getMjuso());
				}
			}
		}
	}
}
