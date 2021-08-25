package a.b.c.ch7;

import java.io.File;

import a.b.c.common.FilePath;


public class Ex_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath = FilePath.FILE_PATH;
		
		try {
			// File 클래스는  자바에서 파일 및 폴더 객체를 다루는 클래스이다. 
			//  new File() : File 클래스의 인스턴스를 생성 
			// 실제 하드디스크에 물리적인 파일/폴더(디렉토리)를 생성하지 않는다. 
			// 실제 파일/폴더(디렉토리)를 만들기 위해서는 File 클래스에 있는 함수를 호출해야 한다. 
			// createNewFile(), mkdir(), mkdirs()
			File f = new File("aaaaaa");
			System.out.println("f >>> :  " + f);
			System.out.println("f.getName() >>> :  " + f.getName());
			boolean bf = f.createNewFile();
			System.out.println("bf >>> : " + bf);
		
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> : " + bdir);
			boolean bfile = f.isFile();
			System.out.println("bfile >>> : " + bfile);
			
			String getPath = f.getPath(); // File에 입력된 경로 출력 
			System.out.println("getPath >>> : " + getPath);
			String getAbsolutePath = f.getAbsolutePath(); // 현재경로 + 입력된 경로(연산되지 않은 경로)
			System.out.println("getAbsolutePath >>> : " + getAbsolutePath);
			String getCanonicalPath = f.getCanonicalPath(); // 현재경로 + 입력된 경로(연산된 경로)
			System.out.println("getCanonicalPath >>> : " + getCanonicalPath);
						
			File f1 = new File(filePath + "/" + "aaaaaa.txt");
			System.out.println("f1 >>> :  " + f1);
			System.out.println("f1.getName() >>> :  " + f1.getName());
			boolean bf1 = f1.createNewFile();
			System.out.println("bf1 >>> : " + bf1);
			
			boolean bdir1 = f1.isDirectory();
			System.out.println("bdir1 >>> : " + bdir1);
			boolean bfile1 = f1.isFile();
			System.out.println("bfile1 >>> : " + bfile1);
			
			String getPath1 = f1.getPath(); // File에 입력된 경로 출력 
			System.out.println("getPath1 >>> : " + getPath1);
			String getAbsolutePath1 = f1.getAbsolutePath(); // 현재경로 + 입력된 경로(연산되지 않은 경로)
			System.out.println("getAbsolutePath1 >>> : " + getAbsolutePath1);
			String getCanonicalPath1 = f1.getCanonicalPath(); // 현재경로 + 입력된 경로(연산된 경로)
			System.out.println("getCanonicalPath1 >>> : " + getCanonicalPath1);
			
		}catch(Exception io) {
			
		}		
	}
}
