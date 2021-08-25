package a.b.c.ch5;

public class Ex_String_2 extends java.lang.Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스트링 클래스 문자열 비교 함수 equals()
		String s1 = "abc";
		String s2 = "abc";	
		
		System.out.println("s1 >>> : " + s1);
		System.out.println("s2 >>> : " + s2);
		System.out.println("System.identityHashCode(s1) >>> : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) >>> : " + System.identityHashCode(s2));		
		
		boolean b = s1.equals(s2);
		System.out.println("b >>> : " + b);
		// if (b == true) {
		if (b) {
			System.out.println("s1.equals(s2) = " + b);
		}
		if (s1.equals(s2)) {
			System.out.println("s1.equals(s2) = " + b);
		}

//		== : 상등연산자 : 자바에서는 기초자료형에서 사용하는 것 : 숫자 비교하는 연산자 
//      자바에서는 == 하고 java.lang.Object.equals() 동일한 기능 이다. 		
//		자바스크립트 : 데이터타입을 연산할 때 코드로 구별을 하지 않는다. 
//		자바스크립트는 데이터 타입을 선언하지 않는다.
//		데이터 타입 변수 var 하나만 있다. 
//		문자열 == 문자열 
//		문자 == 문자
//		숫자 == 숫자  
		boolean b1_1 = s1 == s2;
		System.out.println("b1_1 >>> : " + b1_1);	
		if (b1_1) {
			System.out.println("s1 == s2 = " + b1_1);
		}
		
		String ss1 = "abcd";
		String ss2 = "abcde";
		boolean b1 = ss1.equals(ss2);
		System.out.println("b1 >>> : " + b1);	
		if (b1) {
			System.out.println("ss1.equals(ss2) = " + b1);
		}else {
			System.out.println("ss1.equals(ss2) = " + b1);
		}
		
		String s3 = new String("abc");
		String s4 = new String("abc");	
		
		System.out.println("new String(\"abc\") s3 >>> : " + s3);
		System.out.println("new String(\"abc\") s4 >>> : " + s4);
		System.out.println("System.identityHashCode(s3) >>> : " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) >>> : " + System.identityHashCode(s4));		
		
		boolean b2 = s3.equals(s4);
		System.out.println("b2 >>> : " + b2);
		if (b2) {
			System.out.println("s3.equals(s4) = " + b2);
		}
		
		boolean b2_1 = s3 == s4;
		System.out.println("b2_1 >>> : " + b2_1);	
		if (b2_1) {
			System.out.println("s3 == s4 = " + b2_1);
		}else {
			System.out.println("s3 == s4 = " + b2_1);
		}		
		
		/*
			java.lang.Object.equals(); 
				객체의 주소값을 비교 하는 함수
				연산자 : ==
			java.lang.String.equals(); 
				문자열만 비교하는 함수 
				Object 클래스에 있는 equals() 함수를 오버라이딩해서 
				String 클래스에서는 문자열의 값만 비교하는 연산자로 사용한다. 
			equals()를 사용할 때 비교하는 객체를 보고  jvm이 판단을 한다. 
			
			java.util.Objects.euquas() 
		*/
		
//		Object obj = new Ex_String_2();
//		Ex_String_2 ex2 = (Ex_String_2)obj;
//		boolean b3 = obj.equals(ex2);
//		System.out.println("b3 >>> : " + b3);
//		boolean b3_1 = obj == ex2;
//		System.out.println("b3_1 >>> : " + b3_1);
	}

}
