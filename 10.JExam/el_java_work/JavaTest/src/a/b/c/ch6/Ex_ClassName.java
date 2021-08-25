package a.b.c.ch6;

import java.lang.reflect.Method;

public class Ex_ClassName extends java.lang.Object {

	public void aM() {
		System.out.println("ClassName.aM() 함수 ");
	}
	public void bM() {
		System.out.println("ClassName.bM() 함수 ");
	}
	public void cM() {
		System.out.println("ClassName.cM() 함수 ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자식클래스선언 자식클래스참조변수 선언 = new 자식클래스생성자()선언 
		Ex_ClassName cn = new Ex_ClassName();
		System.out.println("cn 참조변수 >>> : " + cn);
		System.out.println("cn.getClass() >>> : " + cn.getClass());
		System.out.println("cn.getClass().getName() >>> : " + cn.getClass().getName());
		
		// 부모클래스선언  부모클래스참조변수선언 = new 자식클래스()생성자 선언 
		Object obj = new Ex_ClassName();
		System.out.println("부모클래스 Object의 obj 부모클래스참조변수 " + obj);
				
		// 부모클래스 obj 에서 자식클래스 ClassName 을 꺼내놓은 것 
		// obj 에서 ClassName 캐스팅 한 것 
		// obj 에서 ClassName 으로 객체 형변환 : reference casting 
		//  ■  = (■) ◆ : 자바는 = 대입연산자를 중심으로 모든 자료형은 좌우가 같아야 한다.(자료형)
		Ex_ClassName cn1 = (Ex_ClassName)obj;
		System.out.println("cn1 참조변수 >>> : " + cn1);
		System.out.println("cn1.getClass() >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() >>> : " + cn1.getClass().getName());
		
		try {
			Class cc = Class.forName("a.b.c.ch6.ClassName");
			System.out.println("cc >>> : " + cc);
			Ex_ClassName cc1 = (Ex_ClassName)cc.newInstance();
			System.out.println("cc1 >>> : " + cc1);
			cc1.aM();
			
			System.out.println("\n############\n");
			
			// 클래스에 선언된 메소드 찾기 
			Method m[] = cc.getDeclaredMethods();
			for (int i=0; i < m.length; i++) {
				
				System.out.println(">>> :: " + m[i].toString());
				
				String findM = m[i].getName();
				System.out.println("m["+i+"].getName() >>> :: " + findM);			
			}
			
			System.out.println("\n############\n");
			
			Class aList = Class.forName("java.util.ArrayList");
			java.util.ArrayList aList1 = (java.util.ArrayList)aList.newInstance();
			System.out.println("aList1 >>> : " + aList1);
			
			Class d = Class.forName("java.util.Date");
			java.util.Date dd = (java.util.Date)d.newInstance();
			System.out.println("dd >>> : " + dd);
			
		}catch(Exception c) {
			System.out.println("c 에러가 >>>  :" + c);
		}		
	}
}
