package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		/*
			Date 클래스는 epoch 시간(이포크 시간)을 리턴한다.
			1970년 1월 1일 00:00:00 시간을 기준으로 지나간 시간을 millisecond 로 반환한다.			  	
		*/
		
		// 년 
		// public int getYear()
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year + 1900 >>> : " + year);
		
		// 월
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("month >>> : " + month);	
		month = month + 1;
		System.out.println("month + 1 >>> : " + month);		
		
		// 일 
		// public int getDate()
		int date = d.getDate();
		System.out.println("date >>> : " + date);		
		
		String time = year + "." + month + "." + date;
		System.out.println("time >>> : " + time);
		time = time.replace('.', '-');
		System.out.println("time >>> : " + time);	
		time = time.replace('-', '/');
		System.out.println("time >>> : " + time);
	}
}
