package a.b.c.ch5;

public class PPT_4 {

	public void d(int x , int y){
		int div = x / y;
		System.out.println("void d()함수의 값");
		System.out.println(div);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// 스태틱이 없고 (new연산자를 써야함) void가 있어 리턴형이 없는 함수일 경우
		// new연산자를 사용함 -> 클래스이름 참조변수명(내마음대로 지정하는거) = new 클래스이름();
		// 클래스의참조변수명.d함수;
		PPT a1 = new PPT();
		a1.d(x, y);	

	}

}
