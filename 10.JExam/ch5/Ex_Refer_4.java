// package
package a.b.c.ch5;

// import
import java.util.ArrayList;

public class Ex_Refer_4 
{
	// 상수 
	// 멤버변수
	// 생성자
	public Ex_Refer_4(){
		System.out.println("Ex_Refer_4() 생성자 >>> : ");
	}
	
	// 함수 
	
	public void rederMethod(ArrayList aList){
		System.out.println("Ex_Refer_4.rederMethod() 함수 진입 >>> : ");
		for (int i=0; i < aList.size(); i++ )
		{
			TestVO tvo = (TestVO)aList.get(i);
			System.out.println("tvo >>> : " + tvo);
		}
	}
	
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		
		Ex_Refer_4 ef4 = new Ex_Refer_4();
		System.out.println("ef4 >>> : " + ef4);
		
		ArrayList aList = new ArrayList();
		
		// 지역변수, 참조자료형
		for (int i=0; i < 3; i++ )
		{
			TestVO tvo_0 = new TestVO();
			System.out.println("\nmain :: tvo_0 >>> : " + tvo_0);
			tvo_0.setSval("11_" + i);
			tvo_0.setIval("1100_" + i);
			
			aList.add(tvo_0);
		}

		ef4.rederMethod(aList);
	}
}
