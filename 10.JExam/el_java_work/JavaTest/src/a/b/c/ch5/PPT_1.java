package a.b.c.ch5;

public class PPT_1 {
	
	public static void a(int x ,int y){
		int sum = x + y;
		System.out.println("Static  void a()함수의 값");
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번 예시
		//지역변수
		int x = 10;
		int y = 30;
		// 스태틱이 있고, void가 있어 리턴형이 없는 함수일 경우
		// -> 클래스이름.함수(매개변수)
		PPT.a(x, y);

		}
	}
