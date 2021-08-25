package a.b.c.ch7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Ex_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 패스 공통클래스에서 불러오기 
		String filePath = FilePath.FILE_PATH;

		// 파일 패스 및 사용할 파일 명까지 초기화 
		String inFile = filePath + "/" + "Ex_BufferedStream.java";
		String outFile = filePath + "/" + "Ex_BufferedStream.bak";
		
		BufferedInputStream inbuf = null;
		BufferedOutputStream outbuf = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		
			fis = new FileInputStream(inFile);
			inbuf = new BufferedInputStream(fis);
		}catch (Exception e) {
		
			
		}
	}

}
