package a.b.c.ch5;

/*
25분 
명령행 인수를 받아서 정수의 사칙연산 콘솔 어플리케이션을 만드시오 !!

명령행 인수 : String args[]
정수 : int 
사칙연산 : + - * /
콘솔어플리케이션 : main()
변수 


연산자는 내부에서 선언해서 사용하기 
+ : addM(int x, int y)
- : subM(int x, int y)
* : mulM(int x, int y)
/ : divM(int x, int y)
로 만들어서 아규먼트를 받아서 
리턴값을 받아 콘솔에 결과를 출력하시오 
*/

/*
1. 함수를 만들 수 있어야 한다. 
	매개변수 ??
	리턴형 ??
2. 프로그램 들어오는 in 파라미터 	
	정수형 파리미터 2개 
	연산자 4개 
3. 함수 만들 때 
	static 
	안 static
4. 명령행 인수 : String 배열 	
*/	 
	
public class Ex_Math {

	// 더하기
	public int addM(int x, int y) {				
		return x + y;
	}
	// 빼기
	public int subM(int x, int y) {		
		return x - y;
	}
	// 곱하기 
	public int mulM(int x, int y) {		
		return x * y;
	}
	// 나누기
	public int divM(int x, int y) {		
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역변수, 기초자료형 
		int x = 0;
		int y = 0;
		
		if (2 == args.length) {
		
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			
			Ex_Math exm = new Ex_Math();
			
			int addSum = exm.addM(x, y);
			System.out.println(x + " + " + y + " = "  + addSum);
			
			int subSum = exm.subM(x, y);
			System.out.println(x + " - " + y + " = "  + subSum);
			
			int mulSum = exm.mulM(x, y);
			System.out.println(x + " * " + y + " = "  + mulSum);
			
			int divSum = exm.divM(x, y);
			System.out.println(x + " / " + y + " = "  + divSum);
			
		}else {
			System.out.println("사칙연산할 인수를 정수로 2개 입력하시오 !!");
		}		
	}
}
