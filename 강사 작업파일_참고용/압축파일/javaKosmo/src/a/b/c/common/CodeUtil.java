package a.b.c.common;

import javax.swing.Icon;

public abstract class CodeUtil {
	
	// 회원가입 ------------------------------------------------------------------------
	// 회원정보 라벨
	public static final String[] member_value = { "회원번호", "회원이름", "아이디", "패스워드", "생년월일", 
			                                      "성별", "전화번호", "휴대폰번호", "이메일", "주소", 
			                                      "취미",  "사진", "특기", "직업", "삭제여부", 
			                                      "등록일", "수정일"};	
	public static final String[] member_selectall_value = { "회원번호", "회원이름", "아이디", "패스워드", "생년월일", 
												            "성별", "전화번호", "휴대폰번호", "이메일", "주소", 
												            "취미",  "사진", "특기", "직업", "Y/N", 
												            "등록일", "수정일", "수정/삭제"};		
	// 성별 라벨
	public static final String[] gender_value = {"여자","남자"};
	
	// 전화번호 라벨
	public static final String[] tel_value = {"02","031","032"};
	
	// 핸드폰 라벨
	public static final String[] hp_value = {"010","011","017"};
	
	// 취미 라벨
	public static final String[] hobby_lavel = {"게임", "음악감상", "운동", "독서", "영화", "명상"};
	public static final String[] hobby_value = {"01", "02", "03", "04", "05", "06"};
	
	// 직업 라벨
	public static final String[] job_lavel = {"회사원", "자영업", "학생", "주부", "무직", "시인"};
	public static final String[] job_value = {"01", "02", "03", "04", "05", "06"};
	
	// 회원전체 조회 ------------------------------------------------------------------------
	// 회원조회 라벨 
	public static final String[] combo_cpation = {"----------", "전체", "이름", "아이디"};
	public static final String[] jbtn_cpation = {"회원등록", "회원목록"};
	
	// 게시판  ------------------------------------------------------------------------
	// 게시판정보 라벨
	public static final String[] board_label = {"글번호", "글제목", "작성자", "비밀번호", "글내용"};
	public static final String[] board_selectall_label = {"글번호", "글제목", "작성자", "비밀번호", "글내용", 
														  "Y/N", "등록일", "수정일", "수정/삭제"};
	
	public static final String[] board_combo_cpation = {"----------", "전체", "글제목", "작성자"};
	public static final String[] board_jbtn_cpation = {"작성하기", "글목록"};	
	
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
			for (int i=1; i < hobby_lavel.length; i++) {	
				if (("0" + i).equals(s)) {
					h = CodeUtil.hobby_lavel[i-1];
				}
			}			
		}		
		return h;
	}
	
	// 취미 value(코드) 세팅
	public static String setHobby(String s) {
		
		String h = "";						
		for (int i=0; i < CodeUtil.hobby_lavel.length; i++) {			
			if (CodeUtil.hobby_lavel[i].equals(s)) {
				h = CodeUtil.hobby_value[i];
			}			
		}		
		return h;
	}
	
	// 취미, 직업 value(코드) 세팅
	public static int getComboIndex(String s) {		
		int c = 0;			
		if ("01".equals(s)) { c = 0; }		
		if ("02".equals(s)) { c = 1; }		
		if ("03".equals(s)) { c = 2; }
		if ("04".equals(s)) { c = 3; }		
		if ("05".equals(s)) { c = 4; }		
		if ("06".equals(s)) { c = 5; }
		return c;
	}	
		
	// 직업
	public static String job(String s) {
		
		String j = "";		
		if (s !=null && s.length() > 0){			
			for (int i=1; i < job_lavel.length; i++) {				
				if (("0" + i).equals(s)) {
					j = CodeUtil.job_lavel[i-1];
				}
			}		
		}		
		return j;
	}
	
	// 취미 value(직업) 세팅
	public static String setJob(String s) {
		
		String j = "";		
		for (int i=0; i < CodeUtil.job_lavel.length; i++) {			
			if (CodeUtil.job_lavel[i].equals(s)) {
				j = CodeUtil.job_value[i];
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
