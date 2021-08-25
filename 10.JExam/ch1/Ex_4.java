package a.b.c.ch1;

public class Ex_4 {

	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){

		// 변수를 사용하는 이유는
		// 1. 데이터를 담으려고
		// 2. 데이터를 통에다 담아서 데리고 다니면서 사용하려고
		// 3. 변수를 사용할 때는(호출 할 때는) 변수 명을 사용한다.
		// 4. 같은 블럭에 변수명 동일한 것이 있으면 변수 명을 사용하기가 어렵다.		
		int i = 1;
		System.out.println(i); // 1
		
		int i = 2; // 에러가 예상 됨
		i = 2;
		System.out.println(i); // 2

	} // end of main 함수 
} // end of Ex_4 클래스 