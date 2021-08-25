// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_1 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// 회원 가입하는 함수 
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memInsert() 진입 성공 >>> : ");		
		System.out.println("회원가입 :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
		System.out.println("exvo.getMname() >>> : " + exvo.getMname());
		System.out.println("exvo.getMid() >>> : " + exvo.getMid());
		System.out.println("exvo.getMpw() >>> : " + exvo.getMpw());
		System.out.println("exvo.getMhp() >>> : " + exvo.getMhp());
		System.out.println("exvo.getMmail() >>> : " + exvo.getMmail());
		System.out.println("exvo.getMaddr() >>> : " + exvo.getMaddr());
		
		// 실제는 서비스나 다오단의 함수를 호출해서 결과를 받는다. 
		int nCnt = 0;
		
		if (true)
		{
			nCnt = 1;

		}		
		return nCnt;
	}

	// 회원 조회하는 함수
	public void memSelect(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memSelect() 진입 성공 >>> : ");
		System.out.println("회원조회 :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
	}

	// 회원정보 수정하는 함수
	public int memUpdate(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memUpdate() 진입 성공 >>> : ");
		System.out.println("회원정보수정 :: exvo >>> : " + exvo);	
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
		System.out.println("exvo.getMaddr() >>> : " + exvo.getMaddr());

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt;
	}

	// 회원정보 삭제하는 함수 
	public int memDelete(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memDelete() 진입 성공 >>> : ");
		System.out.println("회원정보삭제 :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt ;
	}


	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		// 브라우저 화면 

		// 데이터베이스 ISUD : CRDU 프로그램 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE
		
		// 지역변수, 참조변수 
		String mnum = ""; 
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String memail = "";
		String maddr = "";

		if (1 == args.length)
		{
			String isud = args[0];

			// 회원가입
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("회원가입 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);
				
				System.out.println("회원이름를 key-in 하시오 >>> : ");
				mname = sc.next();
				System.out.println("입력한 회원이름 >>> : " + mname);
				
				System.out.println("아이디를 key-in 하시오 >>> : ");
				mid = sc.next();
				System.out.println("입력한 아이디 >>> : " + mid);
				
				System.out.println("비밀번호를 key-in 하시오 >>> : ");
				mpw = sc.next();
				System.out.println("입력한 비밀번호 >>> : " + mpw);

				System.out.println("핸드폰번호를 key-in 하시오 >>> : ");
				mhp = sc.next();
				System.out.println("입력한 핸드폰번호 >>> : " + mhp);

				System.out.println("이메일를 key-in 하시오 >>> : ");
				memail = sc.next();
				System.out.println("입력한 이메일 >>> : " + memail);
				
				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);
				sc.nextLine();

				// 회원가입
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
							
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				exvo.setMname(mname);
				exvo.setMid(mid);
				exvo.setMpw(mpw);
				exvo.setMhp(mhp);
				exvo.setMemail(memail);
				exvo.setMaddr(maddr);

				// Value Objec exvo 참조변수를 memInsert 아규먼트로 넘기기
				int nCntInsert = exm_1.memInsert(exvo);

				System.out.println("nCntInsert >>> : " + nCntInsert);
				if (nCntInsert == 1)
				{
					System.out.println("회원가입 성공 !!!");
				}else{
					System.out.println("회원가입 실패 !!!");
				}
			}

			// 회원 조회
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원조회 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);

				// 회원 조회
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);

				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				
				// Value Objec exvo 참조변수를 memSelect 아규먼트로 넘기기
				exm_1.memSelect(exvo);
			}

			// 회원정보 수정 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원수정 주소 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);
				
				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);
				
				// 회원정보 수정 
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);				
				exvo.setMaddr(maddr);

				// Value Objec exvo 참조변수를 memUpdate 아규먼트로 넘기기
				int nCntUpdate = exm_1.memUpdate(exvo);

				System.out.println("nCntUpdate >>> : " + nCntUpdate);
				if (nCntUpdate == 1)
				{
					System.out.println("회원정보 수정 성공 !!!");
				}else{
					System.out.println("회원정보 수정 실패 !!!");			
				}
			}

			// 회원정보 삭제
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원삭제할 회원번홀를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);

				// 회원정보 삭제
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);

				// Value Objec exvo 참조변수를 memDelete 아규먼트로 넘기기
				int nCntDelete = exm_1.memDelete(exvo);

				System.out.println("nCntDelete >>> : " + nCntDelete);
				if (nCntDelete == 1)
				{
					System.out.println("회원정보 삭제 성공 !!!");
				}else{
					System.out.println("회원정보 삭제 실패 !!!");
				}
			}
		}else{
			System.out.println("ISUD 구분자를 입력하시오 !!!!");		
		}	// end of if 	
	}	// end of main 함수 	
} // end of Ex_Member_1 클래스 

