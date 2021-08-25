package a.b.c.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public abstract class FileUtil {

	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	FileReader fr = null;
	FileWriter fw = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	InputStreamReader isr = null; 
	OutputStreamWriter osw = null;
	
	public static void fisClose(FileInputStream fis) {
		if (fis !=null){
			try{fis.close(); fis=null;}catch (Exception e){}
		}	
	}
	public static void fosClose(FileOutputStream fos) {
		if (fos !=null){
			try{fos.close(); fos=null;}catch (Exception e){}
		}	
	}
}
