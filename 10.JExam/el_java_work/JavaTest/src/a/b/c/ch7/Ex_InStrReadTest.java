package a.b.c.ch7;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import a.b.c.common.FilePath;

public class Ex_InStrReadTest{

	public static void main(String args[]){
		/*	
			InputStreamReader isr = 
				new InputStreamReader(
				new FileInputStream("Ex_InStrReadTest.java"));
			while ((data=isr.read()) !=-1)
			{
				// 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다. 
				System.out.print((char)data);
			}
		*/
		
		// 파일 패스 공통클래스에서 불러오기 
		String filePath = FilePath.FILE_PATH;

		// 파일 패스 및 사용할 파일 명까지 초기화 
		String inFile = filePath + "/" + "Ex_InStrReadTest.java";

		File ff = null;
		FileInputStream fis = null;
		InputStreamReader isr = null; // byte -> char 변환한는 io 보조스트림 클래스 
		
		BufferedReader br = null;
		
		int data = 0;
		boolean bFile = false;

		try{
			ff = new File(inFile);			
			bFile = ff.exists();

			if (bFile){
				fis = new FileInputStream(ff);
				isr = new InputStreamReader(fis);
				
				br = new BufferedReader(isr);
				
				while ((data=br.read()) !=-1){
					// 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다. 
					System.out.print((char)data);					
				}

			}else{
				System.out.println("해당 경로에 파일이 존재하지 않습니다. >>> : ");
			}
			
			br.close(); br=null;
			isr.close(); isr=null;
			fis.close(); fis=null;
		}
		catch (Exception e){
			System.out.println("e >>> : " + e);
		}finally{
			if (br !=null){
				try{br.close(); br=null;}catch (Exception e){}
			}
			if (isr !=null){
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}