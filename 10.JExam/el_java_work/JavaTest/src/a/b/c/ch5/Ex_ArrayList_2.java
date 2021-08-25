package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 제너릭 :<> : 데이터 타입을 통일하는 것
		// 문자 
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("오재영");
		System.out.println("aList >>> : " + aList);
		aList.add("25"); // 숫자
		System.out.println("aList >>> : " + aList);		
		aList.add("2021-07-21"); // 날짜 
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		
		// for문 이용해서 출력하기 
		for (int i=0; i < aList.size(); i++) {
			System.out.println("aList.get("+i+") >>> : " + aList.get(i));
		}
		
		// 숫자 
		// ArrayList<int> al0 = new ArrayList<int>(); // 기초자료형은 않됨
		ArrayList<Integer> al0 = new ArrayList<Integer>();
		al0.add(1);
		al0.add(new Integer(100));
		// al0.add(new Byte(11));
		System.out.println("al0 >>> : " + al0);
		System.out.println("al0.size() >>> : " + al0.size());
		
		// for문 이용해서 출력하기 
		for (int i=0; i < al0.size(); i++) {
			System.out.println("aList.get("+i+") >>> : " + aList.get(i));
		}
		
		// 사용자정의 클래스 
		ArrayList<TestVO> al1 = new ArrayList<TestVO>();
		al1.add(new TestVO("00_1", "aa_1", "aa00_1", "010_1", "주소_1"));
		al1.add(new TestVO("00_2", "aa_2", "aa00_2", "010_2", "주소_2"));
		al1.add(new TestVO("00_3", "aa_3", "aa00_3", "010_3", "주소_3"));
		System.out.println("al1 >>> : " + al1);
		System.out.println("al1.size() >>> : " + al1.size());
		
		// for문 이용해서 출력하기 
		for (int i=0; i < al1.size(); i++) {
			TestVO tvo  = al1.get(i);
			System.out.print(" " + tvo.getMunm());
			System.out.print(" " + tvo.getMid());
			System.out.print(" " + tvo.getMpw());
			System.out.print(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMjuso());
		}
		
	}
}
