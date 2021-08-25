package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_String_1 {

	public static String mNum(String nCnt) {
		
		int nn = nCnt.length();
		
//		if (1 == nn) {
//			nCnt = "000" + nCnt;
//		}else if (2 == nn){
//			nCnt = "00" + nCnt;
//		}else if (3 == nn){
//			nCnt = "0" + nCnt;
//		}
		
		for (int i=nn; i < 4; i++) {
			nCnt = "0" + nCnt;
		}
		
		return nCnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 202107230001 : 회원번호 만들기 : 년월일 + 시퀀스 (0001 ~ 9999)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d >>> : " + d);
		
		String mnum = "";
		String nCnt = "";
		
		for (int i=1; i < 10; i++) {
			
			nCnt = String.valueOf(i);
			
			mnum = d + Ex_String_1.mNum(nCnt);
			
			System.out.println("mnum >>> : " + mnum);			
		}
	}
}
