package a.b.c.ch1;

public class Ex_Const_2 {

	// 함수 a() : 리턴형이 없는 함수 
	public void a(){
		System.out.println("Ex_Const_2 :: void a() 함수");
	}

	// 함수 b() : 리턴형이 있는 함수 : 리턴형은 String : 문자열 
	public String b(){
		return "Ex_Const_2 :: String b() 함수";
	}

	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){

		Ex_Const_2 ex_c2 = new Ex_Const_2();				
		System.out.println("Ex_Const_2() ex_c2 의 주소값 >>> : " + ex_c2);

		// System.out.println(ex_c2.a());
		/*
		Ex_Const_2.java:25: error: 'void' type not allowed here
                System.out.println(ex_c2.a());
                                          ^
		1 error
		*/

		ex_c2.a();

		System.out.println(ex_c2.b());
	
		String str = ex_c2.b();
		System.out.println("str >>> : " + str);

	} // end of main 함수 
} // end of Ex_5 클래스 