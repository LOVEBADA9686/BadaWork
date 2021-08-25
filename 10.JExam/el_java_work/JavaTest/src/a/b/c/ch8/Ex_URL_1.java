package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = FilePath.FILE_PATH_CH8;
		String path = filePath + "/" + "index.html";
		
		String urlStr = "https://www.naver.com";
		
		try {
			URL ur = new URL(urlStr);
			System.out.println("ur  >>> : " + ur);
			System.out.println("ur.openStream()  >>> : " + ur.openStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(ur.openStream(), "UTF-8"));
			// ÀÎÄÚÆÃ Å¸ÀÔ 
			// UTF-8 : À¯Æ¼¿¤  ÆÈ, 
			// EUC-KR : ÀÌÀ¯¾¾ÄÉÀÌ¾Ë 
			// IOS-8859-1 : ¾ÆÀÌ¿À¿¡½º ÆÈÆÈ¿À±¸´Ù½ÃÀÏ  
			System.out.println("br  >>> : " + br);
			String inLine = "";
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(path)); 
			while ((inLine=br.readLine()) !=null)
			{
				System.out.println(inLine);
				bw.write(inLine);
			}
			bw.flush();
			br.close();
			bw.close();
		}catch(Exception e) {
			System.out.println("¿¡·¯°¡ >>> : " + e.getMessage());
		}
	}

}
