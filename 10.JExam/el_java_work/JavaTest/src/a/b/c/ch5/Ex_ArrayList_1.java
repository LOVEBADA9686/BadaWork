package a.b.c.ch5;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList aList  = new ArrayList();
		
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
		System.out.println(aList.size());
		for (int i=0; i < aList.size(); i++) {
			
			System.out.println(i + " >>> : " + aList.get(i));
			
			TestVO tvo = (TestVO)aList.get(i);
			
			System.out.print(" " + tvo.getMunm());
			System.out.print(" " + tvo.getMid());
			System.out.print(" " + tvo.getMpw());
			System.out.print(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMjuso());
		}
		
		// 제너릭 : Generic : 데이터 타입을 한정 한다(한가지만 사용해야 한다.)
		System.out.println("\n제너릭으로 해보기 ##################\n");
		
		ArrayList<TestVO> aList1  = new ArrayList<TestVO>();
		
		for (int i=0; i < 3; i++) {
			
			TestVO tvo1 = new TestVO();
			
			tvo1.setMunm("00_" + i);
			tvo1.setMid("aa_" + i);
			tvo1.setMpw("aa00_" + i);
			tvo1.setMhp("010_" + i);
			tvo1.setMjuso("주소_" + i);
			
			aList1.add(tvo1);
			
			System.out.println(aList1);
			
		}
		System.out.println(aList1.size());
		for (int i=0; i < aList1.size(); i++) {
			
			System.out.println(i + " >>> : " + aList1.get(i));
			
			TestVO tvo1 = (TestVO)aList1.get(i);
			
			System.out.print(" " + tvo1.getMunm());
			System.out.print(" " + tvo1.getMid());
			System.out.print(" " + tvo1.getMpw());
			System.out.print(" " + tvo1.getMhp());
			System.out.println(" " + tvo1.getMjuso());
		}

	}

}
