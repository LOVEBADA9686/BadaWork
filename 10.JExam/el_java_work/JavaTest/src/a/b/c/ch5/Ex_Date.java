package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deprecated. : 현재꺼 보다 더 향상된 버전이 있으니 이것을 사용하지 마시오 
		// 컴터에서 시간은 : 초로 계산한다. : 1 day = 24 * 60 * 60 = 86400
		// The leap second : 윤초 : 
		// Greenwich mean time (GMT) 
		// global positioning system (GPS)
		// A year y is represented by the integer y - 1900.
		// A month is represented by an integer from 0 to 11; 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		// Date 클래스는 윤년이 사용 가능 
		
		// 컴퓨터 시간 : 클라이언트 시간, 서버 시간  
		Date d = new Date();
		System.out.println("d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");		
		System.out.println("sdf >>> : " + sdf);
		System.out.println("sdf >>> : " + sdf.format(d));
		
		Date d1 = new Date();
		System.out.println("d1 >>> : " + d1);
		System.out.println("d1 >>> : " + System.identityHashCode(d1));	
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf1 >>> : " + sdf1);
		System.out.println("sdf1 >>> : " + sdf1.format(d1));
		
		Date d2 = new Date();
		System.out.println("d2 >>> : " + d2);
		System.out.println("d2 >>> : " + System.identityHashCode(d2));
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("sdf2 >>> : " + sdf2);
		System.out.println("sdf2 >>> : " + sdf2.format(d2));
	}
}
