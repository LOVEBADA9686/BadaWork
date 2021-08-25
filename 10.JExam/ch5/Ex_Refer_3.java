// package
package a.b.c.ch5;

// import


public class Ex_Refer_3 
{
	// 상수 
	// 멤버변수
	// 생성자
	public Ex_Refer_3(){
		System.out.println("Ex_Refer_3() 생성자 >>> : ");
	}
	
	// 함수 	 
	public void rederMethod(TestVO tvo){
		System.out.println("Ex_Refer_3.rederMethod() 함수 진입 >>> : ");
		System.out.println("rederMethod :: tvo >>> : " + tvo);
		System.out.println("rederMethod :: tvo.getSval() >>> : " + tvo.getSval());
		System.out.println("rederMethod :: tvo.getIval() >>> : " + tvo.getIval());
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		
		Ex_Refer_3 ef3 = new Ex_Refer_3();
		System.out.println("ef3 >>> : " + ef3);
		
		// 지역변수, 참조자료형
		for (int i=0; i < 3; i++ )
		{
			TestVO tvo_0 = new TestVO();
			System.out.println("\nmain :: tvo_0 >>> : " + tvo_0);
			tvo_0.setSval("11_" + i);
			tvo_0.setIval("1100_" + i);
			ef3.rederMethod(tvo_0);
		}
	}
}
