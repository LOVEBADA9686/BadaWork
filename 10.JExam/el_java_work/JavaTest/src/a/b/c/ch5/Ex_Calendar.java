package a.b.c.ch5;

import java.util.Calendar;

public class Ex_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cd = Calendar.getInstance();
		System.out.println("cd >>> : \n" + cd);
		
		// 년
		int y = cd.get(Calendar.YEAR);
		System.out.println("y >>> : " + y);
		System.out.println("cd.get(1) >>> : " + cd.get(1));
		
		// 월 
		int m = cd.get(Calendar.MONTH) + 1;
		System.out.println("m >>> : " + m);
		System.out.println("(cd.get(2)+1) >>> : " + (cd.get(2)+1));		
		
		// 일 
		int d = cd.get(Calendar.DATE);
		System.out.println("d >>> : " + d);
		System.out.println("cd.get(5) >>> : " + cd.get(5));
		
		int d1 = cd.get(Calendar.DAY_OF_MONTH);
		System.out.println("d1 >>> : " + d1);
		
		// 시
		int t = cd.get(Calendar.HOUR_OF_DAY); // 24시간 
		System.out.println("t >>> : " + t);
		System.out.println("cd.get(11) >>> : " + cd.get(11));
		int t1 = cd.get(Calendar.HOUR); // 12시간 
		System.out.println("t1 >>> : " + t1);
		
		// 분
		int mm = cd.get(Calendar.MINUTE);
		System.out.println("mm >>> : " + mm);
		System.out.println("cd.get(12) >>> : " + cd.get(12));
		
		// 초
		int s = cd.get(Calendar.SECOND);
		System.out.println("s >>> : " + s);
		System.out.println("cd.get(13) >>> : " + cd.get(13));
		
		String time = "현재시간은 : "
				 		+ y + "년 "
				 		+ m + "월 "
				 		+ d + "일 "
				 		+ t + "시 "
				 		+ mm + "분 "
				 		+ s + "초 입니다. !!!!";
		System.out.println("time >>> : \n" + time);
	}
}
