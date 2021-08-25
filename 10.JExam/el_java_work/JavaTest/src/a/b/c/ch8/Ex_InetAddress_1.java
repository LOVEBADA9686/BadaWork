package a.b.c.ch8;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex_InetAddress_1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub

		InetAddress addr1 = InetAddress.getByName("www.naver.com");
		System.out.println("addr1 >>> : " + addr1);
		System.out.println("addr1.getHostName() >>> : " + addr1.getHostName());
		System.out.println("addr1.getHostAddress() >>> : " + addr1.getHostAddress());
		
		InetAddress addr2 = InetAddress.getByName("www.daum.net");
		System.out.println("\naddr2 >>> : " + addr2);
		System.out.println("addr2.getHostName() >>> : " + addr2.getHostName());
		System.out.println("addr2.getHostAddress() >>> : " + addr2.getHostAddress());
		
		InetAddress addr3 = InetAddress.getByName("www.google.com");
		System.out.println("\naddr3 >>> : " + addr3);
		System.out.println("addr3.getHostName() >>> : " + addr3.getHostName());
		System.out.println("addr3.getHostAddress() >>> : " + addr3.getHostAddress());
		
		InetAddress addr4 = InetAddress.getByName("www.youtube.com");
		System.out.println("\naddr4 >>> : " + addr4);
		System.out.println("addr4.getHostName() >>> : " + addr4.getHostName());
		System.out.println("addr4.getHostAddress() >>> : " + addr4.getHostAddress());
	}

}
