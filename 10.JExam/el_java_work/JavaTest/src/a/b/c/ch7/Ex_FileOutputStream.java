package a.b.c.ch7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import a.b.c.common.FilePath;

public class Ex_FileOutputStream {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 패스 공통클래스에서 불러오기 
		String filePath = FilePath.FILE_PATH;

		// 파일 패스 및 사용할 파일 명까지 초기화 
		String inFile = filePath + "/" + "Ex_FileOutputStream.java";
		String outFile = filePath + "/" + "Ex_FileOutputStream.bak";
		
		// 지역변수 디폴트 값으로 초기화 
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File f = null;		
		int data = 0;
				
		try {
			
			f = new File(inFile);
			
			// 파일이 있는지 여부 체크 하는 boolean 
			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);
			
			// 파일이 있을 때만 수행 한다. 
			if (bFile) {
				
				// 파일을 읽기 위해서 
				fis = new FileInputStream(f);
				System.out.println("fis >>> : " + fis);
				
				// 파일을 쓰기 위해서 
				fos = new FileOutputStream(outFile, true);
				System.out.println("fos >>> : " + fos);
				
				// 파일을 읽어서 파일에 쓰기 
				while ((data=fis.read()) != -1) {
					System.out.print((char)data);
					fos.write(data);
				}
			}else {
				System.out.println("사용하려는 해당 데이터(파일이)가 없습니다. ");
			}
			
			// io 를 닫을 때는 여는 순서의 반대로 닫는다. 
			fos.close(); fos=null;
			fis.close(); fis=null;
			
		}catch (Exception e) {
			System.out.println("에러가 e.getMessage() >>> : " + e.getMessage());
		}finally {
			// try 절에서 예외 발생시 사용한 io 객체 닫기 
			// io 를 선언한 객체가 null 인 경우에만 수행 된다. 
			if (fos !=null){
				try{fos.close(); fos=null;}catch (Exception e){}
			}
			if (fis !=null){
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}		
	}
}
