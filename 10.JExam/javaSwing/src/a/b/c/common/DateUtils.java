package a.b.c.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {
	
	// 날짜
	private static final String[] date_label = {"yyyyMMdd", "yyyyMM", "yyyy", ""};

	public static String ymdFormat(){
		return new SimpleDateFormat(DateUtils.date_label[0]).format(new Date());
	}
	
	public static String ymFormat(){		
		return new SimpleDateFormat(DateUtils.date_label[1]).format(new Date());
	}
	
	public static String yFormat(){
		return new SimpleDateFormat(DateUtils.date_label[2]).format(new Date());
	}
	
	// 날짜 타입
	public static String ymdFormats(String ymdFlag){
		
		String ymd = "";		
		if ("D".equals(ymdFlag.toUpperCase())) ymd = DateUtils.date_label[0];
		if ("M".equals(ymdFlag.toUpperCase())) ymd = DateUtils.date_label[1];
		if ("Y".equals(ymdFlag.toUpperCase())) ymd = DateUtils.date_label[2];
		if ("N".equals(ymdFlag.toUpperCase())) ymd = DateUtils.date_label[3];
		
		return new SimpleDateFormat(ymd).format(new Date());
	} // end of ymdFormats()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
