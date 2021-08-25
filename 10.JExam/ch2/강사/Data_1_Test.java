package a.b.c.ch2.data;

/*
1.	패키지가 다르면
	클래스, 변수, 함수 마다 각각 다 public 키워드를 사용해야 한다. 
*/
public class Data_1_Test {

	// 메모리에 올려서 사용해야 한다. 
	// 메모리에 올리는 방법을 현재는 new 밖에 모른다.
	public int i;

	// static 키워드가 있어서 메모리에 올라간다.
	public static final int TEST_DATA = 100;
	// static final int TEST_DATA = 100;

	public void a(){
		System.out.println("Data_1_Test void a() 함수");
	}

	public static void b(){
		System.out.println("Data_1_Test void b() 함수");
	}
} // end of Data_1_Test 클래스 
