package a.b.c.ch5;

public class PPT_2 {
	
	public static int b(int x , int y){
		int min = x - y;
		System.out.println("Static int b()함수의 값");
		return min; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// 스태틱이 있고, void가 없어 리턴형이 있는 함수일 경우
		// -> 클래스이름.함수(매개변수) 먼저 만들고 -> 주석처리하기(지워도됨)
		// -> 숫자int를  참조변수(내마음대로 지정하는거) i 하고 클래스이름.함수(매개변수)
		// System.out.println(내 마음대로 지정한 참조변수 i);
		// PPT.b(x, y);
		int i = PPT.b(x, y);
		System.out.println(i);

	}

}
