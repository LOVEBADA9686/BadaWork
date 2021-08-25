package a.b.c.ch2;

public class Data_9 {

	// void : 리턴이 없는 함수 
	// 일반 함수 : 참조 변수 이용 : new 키워드 : 클래스선언 참조변수 선언 = new 생성자이름();
	// 참조변수.함수이름();
	// 함수에 매개변수 2개
	// 첫번째 매개변수 인트형, 두번째 매개변수 인트형
	// 호출할 때 : 참조변수.함수이름(인트형 데이터, 인트형 데이터)
	public void aMethod(int x1, int y1){
		System.out.println("Data_9 클래스 void aMethod() 함수 ");
		
		int sum1 = x1 + y1;
		System.out.println("sum1 >>> : " + sum1);
	}

	// void : 리턴형이 없는 함수 
	// static : 클래스이름.함수이름()
	// 함수에 매개변수 2개
	// 첫번째 매개변수 인트형, 두번째 매개변수 인트형
	// 호출할 때 : 클래스이름.함수이름(인트형 데이터, 인트형 데이터)
	public static void aaMethod(int x2, int y2){
		System.out.println("Data_9 클래스에 static void aaMethod() 함수 ");
		
		int sum2 = x2 + y2;
		System.out.println("sum2 >>> : " + sum2);
	}

	// int형 리턴형이 있는 함수 : 함수의 결과 값이 인트형이다.
	// 일반함수 : 참조변수 이용 : new 키워드 : 클래스이름선언 참조변수선언 = new 생성자이름();
	// 참조변수.함수이름();
	// 함수에 매개변수 2개
	// 첫번째 매개변수 인트형, 두번째 매개변수 인트형
	// 호출할 때 : 참조변수.함수이름(인트형 데이터, 인트형 데이터)
	// 결과값을 인트형 변수를 선언해서 받기
	// int i = 참조변수.함수이름(인트형 데이터, 인트형 데이터);
	public int bMethod(int x3, int y3){
		System.out.println("Data_9 클래스 int bMethod() 함수 ");

		int sum3 = x3 + y3;
		System.out.println("bMethod() 함수 sum3 >>> : " + sum3);

		return sum3;
	}

	// int형 리턴형이 있는 함수 : 함수의 결과 값이 인트형이다.
	// 클래스함수 : 클래스이름.함수이름()
	// 함수에 매개변수 2개
	// 첫번째 매개변수 인트형, 두번째 매개변수 인트형
	// 호출할 때 : 클래스이름.함수이름(인트형 데이터, 인트형 데이터)
	// 결과값을 인트형 변수를 선언해서 받기
	// int i1 = 클래스이름.함수이름(인트형 데이터, 인트형 데이터)
	public static int bbMethod(int x4, int y4){
		System.out.println("Data_9 클래스에 static int bbMethod() 함수 ");

		int sum4 = x4 + y4;
		System.out.println("bbMethod() 함수 sum4 >>> : " + sum4);
		
		return sum4;
	}

	public static void main(java.lang.String[] args){

		// 지역변수 데이터타입 int 형 선언하고 
		// x = 1 초기화 
		// y = 2 초기화 
		int x = 1;
		int y = 2;

		// static 함수 사용하기 
		// 클래스이름.함수이름
		Data_9.aaMethod(x, y);

		int i = Data_9.bbMethod(x, y);
		System.out.println("i >>> : " + i);

		// static 없는 함수 : 참조변수 이용하기 : 인스턴스 해서 사용하기 : new 연산자 사용하기 
		// 참조변수.함수이름
		Data_9 d9 = new Data_9();
		d9.aMethod(x, y);
		int i1 = d9.bMethod(x, y);
		System.out.println("i1 >>> : " + i1);

	} // end of main 함수 	
} // end of Data_6


