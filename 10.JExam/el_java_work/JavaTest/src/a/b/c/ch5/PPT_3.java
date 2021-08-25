package a.b.c.ch5;

public class PPT_3 {
	
	public int c(int x , int y) {
		int mul = x * y;
		System.out.println("Int c() 함수의 값");
		return mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// 스태틱이 없고 (new연산자를 써야함) void가 없어 리턴형이 있는 함수일 경우
		// new연산자를 사용함 -> 클래스이름 참조변수명(내마음대로 지정하는거) = new 클래스이름();
		// -> 숫자int를 참조변수명(내마음대로 지정하는거) = 클래스의참조변수명.c함수;
		// -> 숫자int로 지정했던 참조변수명을 출력하기 -> System.out.println(f);
		PPT a = new PPT();
		int f = a.c(x, y);
		System.out.println(f);

	}

}
