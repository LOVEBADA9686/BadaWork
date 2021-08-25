package a.b.c.ch7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex_IOTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaTest\\src\\a\\b\\c\\ch7";
		System.out.println("path >>> : " + path);
		path = path.replace("\\", "/");
		System.out.println("path >>> : " + path);
		
		try {
			
			FileInputStream fis = new FileInputStream(path + "/" + "Ex_IOTest_2.java");
			System.out.println("fis >>> : " + fis);
						
			FileOutputStream fos = new FileOutputStream(path + "/" + "Ex_IOTest_2.bak");
			System.out.println("fos >>> : " + fos);

			int data = 0;
			while ((data=fis.read()) != -1)
			{
				System.out.print((char)data);
				fos.write(data);
			}	
			
		}catch (IOException i) {
			System.out.println("¿¡·¯°¡ i.getMessage() >>> : " + i.getMessage());
		}
			
	}
}
