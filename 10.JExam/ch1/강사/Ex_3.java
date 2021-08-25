package a.b.c.ch1;

public class Ex_3 {

	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){
		System.out.println("Ex_3 :: main() 시작 >>> :  ");

		int i = 1;
		System.out.println(i); // 1
		
		i = 2;
		System.out.println(i); // 2

		// int ii;
		System.out.println(ii); // 
		/*
			Ex_3.java:15: error: cannot find symbol
					System.out.println(ii); //
									   ^
			symbol:   variable ii
			location: class Ex_3
			1 error
		*/
		/*
			함수 블럭 안에서 선언하는 변수를 지역변수라고 부른다.
			지역 변수는 사용하기 전에 꼭 초기화를 해야 한다.
		*/
		int ii = 22;
		System.out.println(ii); // 22

		System.out.println("Ex_3 :: main() 끝 >>> :  ");
	} // end of main 함수 
} // end of Ex_2 클래스 