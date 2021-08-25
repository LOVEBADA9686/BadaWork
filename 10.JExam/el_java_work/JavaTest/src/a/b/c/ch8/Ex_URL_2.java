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
			url : Uniform Resource Locator : web address : 파일식별자, 유일자원지시기				 
			uri : Uniform Resource Identifier : 인터넷에 있는 자원을 나타내는 유일한 자원
	
			uri > url : 
	
			http://도메인:포트/경로/패스?key=value&page=12
	
			url : http://도메인:포트/경로/패스 
			uri : http://도메인:포트/경로/패스?key=value&page=12	
		 */
		
//		http 프로토콜 url 을 요청할 때 방법이 있는데 
//		post 방식  : http://도메인:포트/경로/파일명.확장자
//		get 방식 : http://도메인:포트/경로/파일명.확장자?key=value&key=value : url 에 꼬리표가 있는 것 : ?key=value&key=value
		// String urlStr = "https://nid.naver.com/nidlogin.login?mode=form&url=https%3A%2F%2Fwww.naver.com";
		// https://nid.naver.com/nidlogin.login
		String urlStr = "https" 		// 프로토콜
				+ "://" 				// 프로토콜 과 경로 구분자 
				+ "nid.naver.com" 		// ip or 도메인
//				+ ":"  // ip or 도메인 과 포트의 구분자 
//				+ "8080" // 포트
				+ "/nidlogin.login" 	// 웹서버 경로
										// /nidlogin.login : 요청한 실제 파일 명 
				+ "?"					// 웹서버 경로 와 Query String 구분자 
				+ "mode=form" 			// Query String : key=value
				+ "&" 					// 쿼리 스트링 구분자
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
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}

}
