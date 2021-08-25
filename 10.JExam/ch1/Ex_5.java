package a.b.c.ch1;

// 자바에서 클래스의 자원을 메모리에 올리는 방법은
// 1. static 키워드 사용 
// 2. new 키워드(연산자) 사용 : 클래스 전체를 메모리에 올린다. 
public class Ex_5 {

	// 멤버 변수 
	public int i;

	// 함수 a()
	public void a(){
		System.out.println("Ex_5 :: a() 함수");
	}

	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){

		/*
			1. Ex_5 사용자 정의 클래스를 선언한다.( Ex_5에 있는 자원(Ex_5 = i + a())을 사용하기 위해서)
			2. Ex_5 클래스를 가르키는 변수 ex5 를 선언한다. ex5 : 참조변수 : 레퍼런스 베리어블 
			   ex5 참조변수를 메모리에 올리는 Ex_클래스의 주소값을 가지게 된다. 
			3. = : 대입 연산자 
			4. new : 클래스를 메모리에 올리라고 하는 키워드(연산자)
					 JVM 은 new 키워드를 보면 뒤에오는 클래스이름() : (생성자, 객체) 를 메모리에 올린다.
			5. Ex_5() : 우리는 클래스라고 부르지 않고
						생성자 또는 객체라 지칭한다. 
			6. Ex_5 ex5 = new Ex_5(); : 문장이 정상적으로 수행되고 나면 
										그 하위 라인부터 
										ex5 참조변수를 이용해서 
										Ex_5() 객체에있는 자원을 사용할 수 있다. 
		*/
		
		Ex_5 ex5 = new Ex_5();		
		
		System.out.println("Ex_5() 의 주소값 >>> : " + ex5);
		
		System.out.println(ex5.i);
		
		ex5.a();

	} // end of main 함수 
} // end of Ex_5 클래스 