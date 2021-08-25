package a.b.c.ch5;

public class PPT {

	// 1번 예시
	public static void a(int x ,int y){
		int sum = x + y;
		System.out.println("Static  void a()함수의 값");
		System.out.println(sum);
	}
	// 2번 예시
	public static int b(int x , int y){
		int min = x - y;
		System.out.println("Static int b()함수의 값");
		return min; 
	}
	// 3번 예시
	public int c(int x , int y) {
		int mul = x * y;
		System.out.println("Int c() 함수의 값");
		return mul;
	}
	// 4번 예시
	public void d(int x , int y){
		int div = x / y;
		System.out.println("void d()함수의 값");
		System.out.println(div);
	}

	public static void main(String[] args)	{
		// TODO Auto-generated method stub.
		
		//지역변수
		int x = 10;
		int y = 30;
		
		//1번 예시
		// 스태틱이 있고, void가 있어 리턴형이 없는 함수일 경우
		// -> 클래스이름.함수(매개변수)
		PPT.a(x, y);

		//2번 예시
		// 스태틱이 있고, void가 없어 리턴형이 있는 함수일 경우
		// -> 클래스이름.함수(매개변수) 먼저 만들고 -> 주석처리하기(지워도됨)
		// -> 숫자int를  참조변수(내마음대로 지정하는거) i 하고 클래스이름.함수(매개변수)
		// System.out.println(내 마음대로 지정한 참조변수 i);
		// PPT.b(x, y);
		int i = PPT.b(x, y);
		System.out.println(i);
		
		//3번 예시
		// 스태틱이 없고 (new연산자를 써야함) void가 없어 리턴형이 있는 함수일 경우
		// new연산자를 사용함 -> 클래스이름 참조변수명(내마음대로 지정하는거) = new 클래스이름();
		// -> 숫자int를 참조변수명(내마음대로 지정하는거) = 클래스의참조변수명.c함수;
		// -> 숫자int로 지정했던 참조변수명을 출력하기 -> System.out.println(f);
		PPT a = new PPT();
		int f = a.c(x, y);
		System.out.println(f);
		
		//4번 예시
		// 스태틱이 없고 (new연산자를 써야함) void가 있어 리턴형이 없는 함수일 경우
		// new연산자를 사용함 -> 클래스이름 참조변수명(내마음대로 지정하는거) = new 클래스이름();
		// 클래스의참조변수명.d함수;
		PPT a1 = new PPT();
		a1.d(x, y);	
	}
}