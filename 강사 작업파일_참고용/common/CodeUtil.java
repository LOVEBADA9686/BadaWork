package a.b.c.common;

public abstract class CodeUtil {
	
	// 취미 
	static final String hVal[] = {"게임", "음악감상", "운동", "독서", "영화", "명상"};
	// 직업 
	static final String jVal[] = {"회사원", "자영업", "학생", "주부", "무직", "시인"};
	
	// 생년월일 
	public static String birth(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (8 == sLen) {
				s0 = s.substring(0, 4);
				s1 = s.substring(4, 6);
				s2 = s.substring(6);				
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}
	
	// 성별
	public static String gender(String s) {
		
		String g = "";	
		
		if (s !=null && s.length() > 0){			
			if ("01".equals(s)) {
				g = "여자";
			}else if ("02".equals(s)){
				g = "남자";
			}			
		}			
		return g;
		
		/*
		String g = "";		
		if ("01".equals(s)) {
			g = "여자";
		}
		if ("02".equals(s)) {
			g = "남자";
		}				
		return g;
		*/
		
		/*
		if ("01".equals(s)) {
			return "여자";
		}else {
			return "남자";
		}
		*/
		
		// return "01".equals(s) ? "여자" : "남자";
	}
	
	// 전화번호 
	public static String tel(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (10 == sLen) {
				s0 = s.substring(0, 2);
				s1 = s.substring(2, 6);
				s2 = s.substring(6);
				ss = s0 + "-" + s1 + "-" + s2;
			}		
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}
		return ss;
	}
	
	// 전화번호 
	public static String hp(String s) {

		String s0 = "";
		String s1 = "";
		String s2 = "";
		String ss = "";
		
		if (s !=null && s.length() > 0){			
			int sLen = s.length();			
			if (11 == sLen) {
				s0 = s.substring(0, 3);
				s1 = s.substring(3, 7);
				s2 = s.substring(7);
				ss = s0 + "-" + s1 + "-" + s2;
			}
		}		
		return ss;
	}

	// 취미
	public static String hobby(String s) {
		
		String h = "";				
		if (s !=null && s.length() > 0){							
			for (int i=1; i < hVal.length; i++) {	
				if (("0" + i).equals(s)) {
					h = CodeUtil.hVal[i-1];
				}
			}			
		}		
		return h;
	}
	
	// 직업
	public static String job(String s) {
		
		String j = "";		
		if (s !=null && s.length() > 0){			
			for (int i=1; i < jVal.length; i++) {				
				if (("0" + i).equals(s)) {
					j = CodeUtil.jVal[i-1];
				}
			}		
		}		
		return j;
	}
	
	// 0001 자리수 채우는 함수,  commNO 의 수 보고 0 개수 채우기 
	public static String numPad(String s) {
		
		int sLen = s.length();		
		for (int i=sLen; i < 4; i++) {
			s = "0" + s;
		}		
		return s;
	}
	
	public static void main(String args[]) {
		
		// 생년월일
		String b = CodeUtil.birth("20210801");		
		System.out.println("b >>> : " + b);
		
		// 전화번호
		String t = CodeUtil.tel("03212341234");		
		System.out.println("t >>> : " + t);
		
		// 핸드폰
		String hp = CodeUtil.tel("01012341234");		
		System.out.println("hp >>> : " + hp);		
		
		// 성별
		String g = CodeUtil.gender("02");
		System.out.println("g >>> : " + g);
		// 취미
		String h = CodeUtil.hobby("02");
		System.out.println("h >>> : " + h);
		// 직업
		String j = CodeUtil.job("02");
		System.out.println("j >>> : " + j);
	}
}
