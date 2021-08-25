package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex_URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String urlStr = "https://www.naver.com";
		
		try {
			URL ur = new URL(urlStr);
			System.out.println("ur  >>> : " + ur);
			System.out.println("ur.openStream()  >>> : " + ur.openStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(ur.openStream(), "UTF-8"));
			// ������ Ÿ�� 
			// UTF-8 : ��Ƽ��  ��, 
			// EUC-KR : ���������̾� 
			// IOS-8859-1 : ���̿����� ���ȿ����ٽ���  
			System.out.println("br  >>> : " + br);
			String inLine = "";
			while ((inLine=br.readLine()) !=null) {
				System.out.println(inLine);
			}
			br.close();
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
	}

}
