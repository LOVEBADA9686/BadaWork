package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int : 4바이트, 32비트 
		// 자바는 숫자에서 int 만 안다. int 가 아닌 것이 double : 나머지는 형변환 이 일어나고, int 넘어가는 것은 표기를 해야 한다. lL, fF, dD
		// byte char short int long float double : 기초자료형 : 객체가 아니다. 
		// 기초 자료형에 대응하는 Wrapper Class 가 있다. 
		// Wraper Class 상수로 존재한다. 
		
		// Integer 클래스 에서 생성자 초기화 할 때 
		// 초기화 데이터 타입을 기초 자료형 일 때
		// 초기화 데이터 타입을 문자숫자로할 때 <=== 이것 만 사용한다. : 형변환 못하게 하기 위해서 
		Integer i0 = new Integer(100);		
		Integer i1 = new Integer("100");
		System.out.println("i0 >>> : " + i0);
		System.out.println("i1 >>> : " + i1);
		System.out.println("System.identityHashCode(i0) >>> : " + System.identityHashCode(i0));		
		System.out.println("System.identityHashCode(i1) >>> : " + System.identityHashCode(i1));
		
		// Integer 를 int 형으로 변환 한 것 
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		System.out.println("i0Val >>> : " + i0Val);
		System.out.println("i1Val >>> : " + i1Val);		
		
		// 문자숫자 Integer 형을 int 형 숫자로 변환 한 것  "12234" : 숫자로된 문자열 "1", "12"
		// 문자숫자 : 숫자 기회에 떠블쿼테이션으로 묶은 문자열 
		int i2 = Integer.parseInt("100"); // "100" -> 100 -> 100
		System.out.println("i2 >>> : " + i2);	
		
		int i3 = 100;
		System.out.println("i3 >>> : " + i3);	
		
		// int 형을 Integer 형으로 변환하기 
		Integer i4 = Integer.valueOf(i3);
		System.out.println("i4 >>> : " + i4);
		
		// jdk 1.5 부터 이렇게 한다. 
		// 오토박싱 : Autoboxing : 기본형을 객체로 바꾸는 것 
		// 언박싱 : Unboxing : 객체형을 기본형으로 꺼내는 것 
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; // 언박싱
//		int sum = num1.intValue() + num2;
		Integer num3 = num2; // 오토박싱
//		Integer num3 = Integer.valueOf(num2);
	}

}
