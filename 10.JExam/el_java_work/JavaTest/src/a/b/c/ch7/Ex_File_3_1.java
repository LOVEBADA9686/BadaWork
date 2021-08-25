package a.b.c.ch7;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex_File_3_1{
	
	static int totalFiles = 0;
	static int totalDirs = 0;
	
	public static void printFileList(File dir){
		System.out.println("" + dir.getAbsolutePath());
		
		File[] files = dir.listFiles();

		ArrayList subDir = new ArrayList();

		for (int i=0; i < files.length; i++){
			String fileName = files[i].getName();

			if (files[i].isDirectory())
			{
				fileName = "[" + fileName + "]";
				subDir.add(i + "");
			}
			System.out.println("" +  fileName);
		}

		int dirNum = subDir.size();
		int fileNum = files.length - dirNum;

		totalFiles += fileNum;
		totalDirs += dirNum;

		System.out.println(fileNum + " 개의 파일, " + dirNum + " 개의 디렉토리");
		System.out.println();

		for (int i=0; i < subDir.size(); i++){
			int index = Integer.parseInt((String)subDir.get(i));
			printFileList(files[index]); 
		}
	}

	public static void main(String args[]){
		
		// String args = c:\\00.kosmo93\10.JExam
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		File dir = new File(str);
		System.out.println("dir >>> : " + dir);
		
		// 메소드 
		printFileList(dir);
		System.out.println();
		System.out.println(" 총 : " + totalFiles + " 개의 파일");
		System.out.println(" 총 : " + totalDirs + " 개의 디렉토리");
	}
}