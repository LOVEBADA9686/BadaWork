package a.b.c.ch5;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 배열 이다. 맘씨 좋은 배나온 키다리 아저씨 이다.
		// 데이터 타입이 달라도 상관없고
		// 갯수가 모자라면, 넘치면 넘치는대로 다 허용한다. 
		// 순차가 있다. index

		// Array 배열은 깍쟁이 아가씨 같다.
		// 데이터 타입이 같아야 한다. 
		// 갯수가 모자라면 에러가 나고
		// 순차가 있다. index
		// 데이터 양이 작고 빠르게 처리할 때 사용한다. 
		ArrayList aList = new ArrayList();	
		System.out.println("aList.size() >>> : " + aList.size());
		System.out.println("aList >>> : " + aList);
		aList.add(1);
		System.out.println("aList >>> : " + aList);
		aList.add(new Integer("100"));
		System.out.println("aList >>> : " + aList);
		aList.add("양성휘");
		System.out.println("aList >>> : " + aList);
		aList.add(new String("이다희"));
		System.out.println("aList >>> : " + aList);
		aList.add('c');
		System.out.println("aList >>> : " + aList);
		aList.add(false);
		System.out.println("aList >>> : " + aList);
		aList.add(aList);
		System.out.println("aList >>> : " + aList);
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new a.b.c.TestVO());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			System.out.println(">>> : " + aList.get(i));
		}	
	}
}
