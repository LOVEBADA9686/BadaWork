package a.b.c.ch6;

public class PPT {

	// 1번 예시
	public static void a(int x ,int y){
		int sum = x + y;
		System.out.println("Static  void a()함수의 값");
		System.out.println(sum);
	}

	public static int b(int x , int y){
		int min = x - y;
		System.out.println("Static int b()함수의 값");
		return min; 
	}

	public int c(int x , int y) {
		int mul = x * y;
		System.out.println("Int c() 함수의 값");
		return mul;
	}

	public void d(int x , int y){
		int div = x / y;
		System.out.println("void d()함수의 값");
		System.out.println(div);
	}

	public static void main(String[] args)	{
		// TODO Auto-generated method stub.
		
		//1번예시
		//지역변수
		int x = 10;
		int y = 30;
		// 스태틱이 있고, void가 있어 리턴형이 없는 함수일 경우
		// -> 클래스이름.함수(매개변수)
		PPT.a(x, y);

	}
}