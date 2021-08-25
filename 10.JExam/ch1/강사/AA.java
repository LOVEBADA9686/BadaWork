package a.b;

// public class A{
class A{

	// main 함수 
	public static void main(String[] v){
	
	} // end of main 함수 
	
} // end of A 클래스
/*
1.	자바 소스코드를 *.java 로 저장 할 때는 
    main() 가 있는 클래스는 
    class 키워드 앞에 public 키워드를 붙여서 
	클래스 이름과 소스파일 이름을 동일하게 저장한다. 

	예)
	AA.java 로 저장
	javac -d . AA.java
	java a.b.c.AA
	public class AA{

		// main 함수 
		public static void main(String[] v){
		
		} // end of main 함수 	
	} // end of A 클래스

	단 : main() 가 있는 클래스에 
	    class 키워드 앞에 public 키워드를 붙이지 않으면 
		클래스 이름과 소스파일 이름을 다르게 저장해도 된다.
		이 경우네는 
		소스 파일 이름과 클래스 이름이 동일하지 않으니 
		실행 할 때는 클래스 이름으로 실행해야만 한다. 

		예)
		AAA.java 로 저장
		javac -d . AAA.java
		java a.b.c.A
		class A{

			// main 함수 
			public static void main(String[] v){
			
			} // end of main 함수 	
		} // end of A 클래스
*/



