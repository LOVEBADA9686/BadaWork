package a.b.c.ch7;

import java.io.File;
import java.io.FileReader;

import a.b.c.common.FilePath;

public class Ex_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일 패스 공통클래스에서 불러오기 
		String filePath = FilePath.FILE_PATH;
		// 파일 패스 및 사용할 파일 명까지 초기화 
		String inFile = filePath + "/" + "Ex_FileReader.java";
		
		// 지역변수, 참조변수 
		// 객체이니 null 초기화 했다. : 객체의 디폴트 값은 null 
		FileReader fr = null;
		
		// 지역변수 : 기초자료형을 함수 내부에서 선언 하면 일반적으로 지역변수라고 부른다.
		// 지역변수 디폴트 값으로 초기화 했다. 
		int data = 0;

		try {
			
			File f = new File(inFile);
			boolean bFile = f.exists();
			
			if (bFile) {
				
				// FileInputStream I/O 객체를 오픈한다. 
				fr = new FileReader(f);
				System.out.println("fr >>> : " + fr);

				data = fr.read();
				System.out.println("data >>> : " + data);
				System.out.println("(byte)data >>> : " + (byte)data);
				System.out.println("(char)data >>> : " + (char)data);

				// char 단위로 읽을 때 맨 끝을 -1 표현한다. 
				while ((data=fr.read()) != -1){
					System.out.print((char)data);
				}
			
				// 정상적으로 수행 되었을 때 수행 되는 루틴 
				// FileInputStream I/O 객체를 닫는다.
				fr.close();
				
				// FileInputStream I/O 객체를 null 처리 했다. 
				// 가비지 컬렉터가 바빠서 해당 객체를 메모리에서 해제하지 않았을 때를 대비해서 
				// 해당 참조변수(여기서는 fr)에 데이터가 없다라고 표현 한 것 
				fr = null;
				
			}else {
				System.out.println("파일이 없습니다. ");
			}
			
		}catch(Exception i) {
			
			System.out.println("에러가 i.getMessage() >>> : " + i.getMessage());
			
		}finally {
			
			// 비정상 종료를 대비해서 만든 루틴 이다. 
			if (fr !=null) {
				try {
					fr.close(); fr = null;
				}catch (Exception e) {
					
				}
			}
		}
	}
}
