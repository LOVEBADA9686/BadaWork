package a.b.c.ch2;

public class Data_8 {

	// void 함수, 일반함수
	// 사용법 : 참조변수 사용하기 : 클래스이름 참조변수 = new 생성자이름();
	//        참조변수.함수이름();
	// Data_8 d8 = new Data_8();
	// d8.aMethod();
	public void aMethod(){
		System.out.println("Data_8 클래스 void aMethod() 함수 ");
	}

	// void 함수, static  함수 
	// 사용법 : 클래스이름.함수이름();
	// Data_8.aaMethod();
	public static void aaMethod(){
		System.out.println("Data_8 클래스에 static void aaMethod() 함수 ");
	}

	// 리턴형이 있는 함수, 일반 함수
	// 참조변수 사용하기, 리턴형을 받아서 사용하기 
	// Data_8 d8 = new Data_8();
	// int i = d8.bMethod();
	public int bMethod(){
		System.out.println("Data_8 클래스 int bMethod() 함수 ");
		return 1;
	}

	// 리턴형이 있는 함수, static 함수 
	// 클래스이름.함수이름(); 리턴형 받기
	// int i = Data_8.bbMethod();
	public static int bbMethod(){
		System.out.println("Data_8 클래스에 static int bbMethod() 함수 ");
		return 1;
	}

	public static void main(java.lang.String[] args){

		// static 함수 사용하기 
		// 클래스이름.함수이름
		Data_8.aaMethod();

		int i = Data_8.bbMethod();
		System.out.println("i >>> : " + i);

		// static 없는 함수 : 참조변수 이용하기 : 인스턴스 해서 사용하기 : new 연산자 사용하기 
		// 참조변수.함수이름
		Data_8 d8 = new Data_8();
		d8.aMethod();
		int i1 = d8.bMethod();
		System.out.println("i1 >>> : " + i1);

	} // end of main 함수 	
} // end of Data_6


