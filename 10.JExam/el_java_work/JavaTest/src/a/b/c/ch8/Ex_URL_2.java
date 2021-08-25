package a.b.c.ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import a.b.c.common.FilePath;

public class Ex_URL_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			url : Uniform Resource Locator : web address : ���Ͻĺ���, �����ڿ����ñ�				 
			uri : Uniform Resource Identifier : ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ڿ�
	
			uri > url : 
	
			http://������:��Ʈ/���/�н�?key=value&page=12
	
			url : http://������:��Ʈ/���/�н� 
			uri : http://������:��Ʈ/���/�н�?key=value&page=12	
		 */
		
//		http �������� url �� ��û�� �� ����� �ִµ� 
//		post ���  : http://������:��Ʈ/���/���ϸ�.Ȯ����
//		get ��� : http://������:��Ʈ/���/���ϸ�.Ȯ����?key=value&key=value : url �� ����ǥ�� �ִ� �� : ?key=value&key=value
		// String urlStr = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
		// https://nid.naver.com/nidlogin.login
		String urlStr = "https" 		// ��������
				+ "://" 				// �������� �� ��� ������ 
				+ "nid.naver.com" 		// ip or ������
//				+ ":"  // ip or ������ �� ��Ʈ�� ������ 
//				+ "8080" // ��Ʈ
				+ "/nidlogin.login" 	// ������ ���
										// /nidlogin.login : ��û�� ���� ���� �� 
				+ "?"					// ������ ��� �� Query String ������ 
				+ "mode=form" 			// Query String : key=value
				+ "&" 					// ���� ��Ʈ�� ������
				+ "url=https%3A%2F%2Fwww.naver.com"; // Query String : key=value
		
		try {
			URL ur = new URL(urlStr);
			System.out.println("ur  >>> : " + ur);
			System.out.println("u.getProtocol() >>> : " + ur.getProtocol());
			System.out.println("u.getHost() >>> : " + ur.getHost());
			System.out.println("u.getPort() >>> : " + ur.getPort());
			System.out.println("u.getPath() >>> : " + ur.getPath());
			System.out.println("u.getQuery() >>> : " + ur.getQuery());
			System.out.println("u.getFile() >>> : " + ur.getFile());	
			
			System.out.println("ur.openStream()  >>> : " + ur.openStream());
			BufferedReader br = new BufferedReader(
					new InputStreamReader(ur.openStream(), "UTF-8"));			 
			System.out.println("br  >>> : " + br);
			String inLine = "";		
			while ((inLine=br.readLine()) !=null){
				System.out.println(inLine);				
			}
			
			br.close();
			
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}
	}

}
