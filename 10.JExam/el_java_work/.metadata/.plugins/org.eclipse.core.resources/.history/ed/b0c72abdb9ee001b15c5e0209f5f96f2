package a.b.c.ch7;

import java.io.File;
import java.io.IOException;

import a.b.c.common.DateUtil;

public class Ex_File_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("abc");
		f1.mkdir();
		System.out.println("f1 >>> : " + f1);
		
//		File f2 = new File(f1, "20210727_" + f1.getName() + ".txt");
		
		File f2 = new File(f1, DateUtil.yyyymmdd() + "_" + f1.getName() + ".txt");
		f2.createNewFile();
		String getPath = f2.getPath(); // File에 입력된 경로 출력 
		System.out.println("getPath >>> : " + getPath);
		
		if (f2.exists()) {
			java.io.FileWriter fw = null;
			fw = new java.io.FileWriter(f2);
			fw.write("파일 내용을 써보세요 ~~~ !!! ");
			fw.close();
		}
	}

}
