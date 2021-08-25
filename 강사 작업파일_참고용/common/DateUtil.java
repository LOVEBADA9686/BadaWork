package a.b.c.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

	public static String yyyymmdd() {		
		return new SimpleDateFormat("yyyyMMdd").format(new Date()).toString();
	}
		
	public static String cTime(){
		
		long time = System.currentTimeMillis();	
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
//		String cTime = sdf.format(new java.util.Date(time));
//		return cTime;
		
		return new SimpleDateFormat("yyyy.MM.dd hh:mm:ss").format(new Date(time)).toString();
	}

	public static void main(String args[]) {
		String d = DateUtil.yyyymmdd();
		System.out.println("d >>> : " + d);
		System.out.println("dt >>> : " + DateUtil.cTime());
	}
}
