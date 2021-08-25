package a.b.c.ch7;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOTest_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
//			String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
			String path = "C:/00.KOSMO93/10.JExam/el_java_work/javaTest/src/a/b/c/ch7";
			
			FileInputStream fis = new FileInputStream(path + "/" + "Ex_IOTest_1.java");
			System.out.println("fis >>> : " + fis);

			int data = fis.read();
			System.out.println("data >>> : " + data);
			System.out.println("(byte)data >>> : " + (byte)data);
			System.out.println("(char)data >>> : " + (char)data);

			// 바이트 단위로 읽을 때 맨 끝을 -1 표현한다. 
//			while ((data=fis.read()) != -1){
//				System.out.print((char)data);
//			}
			
			while ((data=fis.read()) != -1){
				System.out.println(  " : " + data
					               + " : " + (char)data
								   + " : " + Integer.toBinaryString(data));
			}
			
		}catch(IOException i) {
			System.out.println("에러가 i.getMessage() >>> : " + i.getMessage());
		}
	}

}
