// package
package a.b.c.ch3;

// import


public class ExArray_2_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	// String[] args : main 함수의 아규먼트 이고 String 배열이다. 
	// String[] args = {"abc", "def", ........};
	// 콘솔 어플리케이션 명령행 인수 라고 부른다. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("args.length >>> : " + args.length);

		// String[] args = {..................};
		System.out.println("args[0] >>> : " + args[0]);
		System.out.println("args[1] >>> : " + args[1]);

		/*
			콘솔 어플리케이션 메인 함수 스트링 배열 아규먼트 사용법 
			콘솔창에서 클래스 실해할 때 실행구문 뒤에서 아규먼트를 널 구분자로 해서 입력한다. 
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def
			String[] args = {"abc", "def"};
			args[0] >>> : abc
			args[1] >>> : def


			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def
			args.length >>> : 2
			args[0] >>> : abc
			args[1] >>> : def

			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def d f d
			args.length >>> : 5
			args[0] >>> : abc
			args[1] >>> : def

			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_1 abc def d f d d f d d d
			args.length >>> : 10
			args[0] >>> : abc
			args[1] >>> : def
		
		*/
	}
}
