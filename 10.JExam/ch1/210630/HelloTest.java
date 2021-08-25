class HelloTest {

	public static void main(String[] args){
	
		System.out.println("Hello Test");
	} // end of main 함수 
} // end of HelloTest 클래스 

// javac HelloTest.java
// java HelloTest

/*
C:\00.KOSMO93\10.JExam\ch1>dir/w
 C 드라이브의 볼륨에는 이름이 없습니다.
 볼륨 일련 번호: A461-CAA8

 C:\00.KOSMO93\10.JExam\ch1 디렉터리

[.]              [..]             [a]              HelloJava.java   HelloTest.java   JavaHBE.java
               3개 파일               1,277 바이트
               3개 디렉터리  196,776,321,024 바이트 남음

C:\00.KOSMO93\10.JExam\ch1>javac HelloTest.java

C:\00.KOSMO93\10.JExam\ch1>java HelloTest
Hello Test

C:\00.KOSMO93\10.JExam\ch1>javap HelloTest
Compiled from "HelloTest.java"
class HelloTest {
  HelloTest();
  public static void main(java.lang.String[]);
}

C:\00.KOSMO93\10.JExam\ch1>
*/