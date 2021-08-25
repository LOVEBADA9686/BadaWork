package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import a.b.c.common.FilePath;

//Ex_BufferedWriter.java 화일을 읽어서 
//Ex_BufferedWriter.bak 파일 만들기 
public class Ex_BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용할 지역변수 초기화 하기
		// 버퍼  in, out 클래스
		BufferedReader inBuffer = null;
		BufferedWriter outBuffer = null;	
		// 문자 in, out 클래스
		FileReader fr = null;
		FileWriter fw = null;
		// 파일 체크할 File 클래스
		File f = null;
		// 쓰기에 사용한 데이터
		int data = 9;
		
		// 파일 패스 파일명 불러오기 , 공통 클래스 사용하기  a.b.c.common.FilePath
		String filePath = FilePath.FILE_PATH;
		String inFile = filePath + "/" + "Ex_BufferedWriter.java";
		String outFile = filePath + "/" + "Ex_BufferedWriter.java";
		
		// try-catch 블럭 만들기 
		try {
			// 데이터 있는지 체크하기 
			f = new File(inFile);
			boolean b = f.exists();
			
			if (b) {
				
				// 파일 읽어오기
				fr = new FileReader(f);
				inBuffer = new BufferedReader(fr);
				
				// 파일 쓰기 
				fw = new FileWriter(outFile);
				outBuffer = new BufferedWriter(fw);
				
				while ((data=inBuffer.read()) != -1) {
					outBuffer.write(data);
				}
				outBuffer.flush();
				
				inBuffer.close(); inBuffer=null;
				outBuffer.close(); outBuffer=null;
				fr.close(); fr=null;
				fw.close(); fw=null;
			}else {
				System.out.println("파일이 없네요 >>> : ");
			}
			// 파일 읽어오기
			// 파일 쓰기 
			
		}catch(Exception e) {
			System.out.println("에러가 e.getMessage() >>> : " + e.getMessage());
		}finally{
			if (inBuffer !=null){
				try{inBuffer.close(); inBuffer=null;}catch(Exception e){}
			}
			if (outBuffer !=null){
				try{outBuffer.close(); outBuffer=null;}catch(Exception e){}
			}	
			if (fr !=null){
				try{fr.close(); fr=null;}catch(Exception e){}
			}
			if (outFile !=null){
				try{fw.close(); fw=null;}catch(Exception e){}
			}	
		}		
		
		
	}
}
