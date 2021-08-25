// package
package a.b.c.ch5;

// import


public class Ex_Refer_2 
{
	// 상수 
	// 멤버변수
	// 생성자
	public Ex_Refer_2(){
		System.out.println("Ex_Refer_2() 생성자 >>> : ");
	}
	// 함수 
	// TestVO tvo_0, TestVO tvo_1, TestVO tvo_2, TestVO tvo_3 : 매개변수 
	public void rederMethod( TestVO tvo_0
		                    ,TestVO tvo_1
							,TestVO tvo_2
							,TestVO tvo_3){
		System.out.println("Ex_Refer_2.rederMethod() 함수 진입 >>> : ");
		System.out.println("rederMethod :: tvo_0 >>> : " + tvo_0);
		System.out.println("rederMethod :: tvo_0.getSval() >>> : " + tvo_0.getSval());
		System.out.println("rederMethod :: tvo_0.getIval() >>> : " + tvo_0.getIval());

		System.out.println("rederMethod :: tvo_1 >>> : " + tvo_1);	
		System.out.println("rederMethod :: tvo_1.getSval() >>> : " + tvo_1.getSval());
		System.out.println("rederMethod :: tvo_1.getIval() >>> : " + tvo_1.getIval());

		System.out.println("rederMethod :: tvo_2 >>> : " + tvo_2);	
		System.out.println("rederMethod :: tvo_2.getSval() >>> : " + tvo_2.getSval());
		System.out.println("rederMethod :: tvo_2.getIval() >>> : " + tvo_2.getIval());

		System.out.println("rederMethod :: tvo_3 >>> : " + tvo_3);	
		System.out.println("rederMethod :: tvo_3.getSval() >>> : " + tvo_3.getSval());
		System.out.println("rederMethod :: tvo_3.getIval() >>> : " + tvo_3.getIval());

	}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		
		Ex_Refer_2 ef2 = new Ex_Refer_2();
		System.out.println("ef2 >>> : " + ef2);
		
		// 지역변수, 참조자료형
		TestVO tvo_0 = new TestVO();
		System.out.println("main :: tvo_0 >>> : " + tvo_0);
		tvo_0.setSval("11");
		tvo_0.setIval("1100");

		TestVO tvo_1 = new TestVO();
		System.out.println("main :: tvo_1 >>> : " + tvo_1);
		tvo_1.setSval("22");
		tvo_1.setIval("2200");
		
		TestVO tvo_2 = new TestVO();
		System.out.println("main :: tvo_2 >>> : " + tvo_2);
		tvo_2.setSval("33");
		tvo_2.setIval("3300");


		TestVO tvo_3 = new TestVO();
		System.out.println("main :: tvo_3 >>> : " + tvo_3);
		tvo_3.setSval("44");
		tvo_3.setIval("4400");


		// tvo_0, tvo_1, tvo_2, tvo_3 : 아규먼트
		ef2.rederMethod(tvo_0, tvo_1, tvo_2, tvo_3);
	}
}
