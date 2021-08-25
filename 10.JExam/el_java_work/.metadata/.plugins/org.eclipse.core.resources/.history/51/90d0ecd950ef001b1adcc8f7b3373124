package a.b.c.ch8;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
하나의 컴퓨터를 가르키는 방법이 아래와 같이 4가지 방법이 있다. 
------------------------------------------
ping localhost : 자기 컴퓨터를 가르키는 로컬 도메인
ping 127.0.0.1 : 자기 컴퓨터를 가르키는 로컬 ip 
ping 192.168.219.105 : 컴퓨터 아이피 
ping DESKTOP-A9S5QHQ : 컴퓨터 이름 
*/

public class Ex_InetAddress {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("addr >>> : " + addr);
		System.out.println("addr.getHostName() >>> : " + addr.getHostName());
		System.out.println("addr.getHostAddress() >>> : " + addr.getHostAddress());
		
		InetAddress addr1 = InetAddress.getByName("localhost");
		System.out.println("\naddr1 >>> : " + addr1);
		System.out.println("addr1.getHostName() >>> : " + addr1.getHostName());
		System.out.println("addr1.getHostAddress() >>> : " + addr1.getHostAddress());
		
		InetAddress addr2 = InetAddress.getByName("127.0.0.1");
		System.out.println("\naddr2 >>> : " + addr2);
		System.out.println("addr2.getHostName() >>> : " + addr2.getHostName());
		System.out.println("addr2.getHostAddress() >>> : " + addr2.getHostAddress());
		
		InetAddress addr3 = InetAddress.getByName("192.168.219.111");
		System.out.println("\naddr3 >>> : " + addr2);
		System.out.println("addr3.getHostName() >>> : " + addr3.getHostName());
		System.out.println("addr3.getHostAddress() >>> : " + addr3.getHostAddress());
		
		InetAddress addr4 = InetAddress.getByName("DESKTOP-A9S5QHQ");
		System.out.println("\naddr4 >>> : " + addr2);
		System.out.println("addr4.getHostName() >>> : " + addr4.getHostName());
		System.out.println("addr4.getHostAddress() >>> : " + addr4.getHostAddress());

	}

}
