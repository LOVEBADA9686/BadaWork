package a.b.c.ch7;

// 파일을 읽는 객체, byte 단위로 읽는 객체 
// 파일을 읽으려면 
// 1. 파일이 있는 위치를 알아야 한다. 
// 2. 파일 이름을 알아야 한다. 
// 3. 1번, 2번이 충족되면 파일에 있는 내용을 메모리에 올려야 한다. 
// 4. 파일을 읽을 때 byte 단위로 읽어서 메몰이 올려 놓는다. 
// 5. 파일을 잘 찾아서 메모링 올려 놓으면 
// 6. FileInputStream.read() 함수가 바이트 단위로 읽어온다. 
// 7. byte 단위로 읽을 때 파일의 끝 -1 로 표현한다. 
import java.io.FileInputStream;
// IOException 예외 클래스는 
// io 패키지의 최상의 예외 클래스 이다. 
// checked Exception 이다 : 컴파일 때 체크하는 예외이다. 
// 소스파일을 구성할 때 : 컴파일 할 때 : 꼭 예외 처리를 해주어야 한다. 
import java.io.IOException;


// 파일 
// 디렉토리 + 파일이름 + 파일 덩어리 
public class Ex_IOTest_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// 디렉토리 구분자, 파일구분자 : file seperator 
		// 윈도우 : \, 리눅스, 유닉스 : /
		// 이클립스 사용방법이 다르다. / , \\ 
		// String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		
		// FileInputStream fis = new FileInputStream(path + "\\" + "Ex_IOTest_1.java");
		FileInputStream fis = new FileInputStream("Ex_IOTest_1.java");
		System.out.println("fis >>> : " + fis);

		int data = fis.read();
		
		System.out.println("data >>> : " + data);
		System.out.println("(byte)data >>> : " + (byte)data);
		System.out.println("(char)data >>> : " + (char)data);

		// 바이트 단위로 해당 파일을 읽으면 파일의 끝까지 읽는데 파일의 맨 끝은 -1로 표현한다.
		while ((data=fis.read()) != -1){
			System.out.print((char)data);
		}
		/*
		while ((data=fis.read()) != -1){
			System.out.println(  " : " + data
				               + " : " + (char)data
							   + " : " + Integer.toBinaryString(data));
		}
		*/
	}
}

/*
batch 명령어 
echo 
>> 
---------------------

C:\00.KOSMO93\10.JExam\ch7>echo Hello World11 >> hello.txt

C:\00.KOSMO93\10.JExam\ch7>echo Hello World2222
Hello World2222

C:\00.KOSMO93\10.JExam\ch7>echo Hello World2222 >> hello_2.txt

C:\00.KOSMO93\10.JExam\ch7>

C:\00.KOSMO93\10.JExam\ch7>java a.b.c.ch7.Ex_IOTest_1 >> Ex_IOTest_1.txt

C:\00.KOSMO93\10.JExam\ch7>

*/
