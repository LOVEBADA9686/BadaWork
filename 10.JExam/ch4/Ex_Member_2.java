// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_2
{
	// 상수
	// 멤버변수
	// 생성자
	
	//함수
	//회원 가입하는 함수
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

	// 회원 조회 하는 함수
	public void memSelect(Ex_MemberVO exvo){
	System.out.println("Ex_Member_1.memSelect() 진입 성공 >>> : ");
	System.out.println("회원조회 :: exvo >>> : " + exvo);
	System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
	}

	// 회원정보 삭제하는 함수
	public void memDelete(Ex_MemberVO exvo){
	System.out.println("Ex_Member_1.memDelete() 진입 성공 >>> : ");
	System.out.println("회원정보삭제 :: exvo >>> : " + exvo);
	System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());

	int nCnt = 0;
	if (true)
	{
		nCnt = 1;
	}
		return nCnt;
	}
	
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
	String mnum = "";
	String mname = "";
	String mid = "";
	String mpw = "";
	String mhp = "";
	String mmail = "";
	String maddr = "";

	if (1 == args.length)
	{
		String isud = args[0];

		// 회원가입
		if ("I".equals(isud.toUpperCase()))
		{
		System.out.println("회원가입정보를 입력하시오! >>> : " + isud);
		Scanner sc = new Scanner(System.in);

		System.out.println("회원번호를 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 회원번호 >>> : " + mnum);

		System.out.println("회원이름을 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 회원이름 >>> : " + mname);

		System.out.println("회원아이디를 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 회원아이디 >>> : " + mid);

		System.out.println("비밀번호 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 비밀번호 >>> : " + mpw);

		System.out.println("핸드폰번호 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 핸드폰번호 >>> : " + mhp);

		System.out.println("이메일을 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 이메일 >>> : " + mmail);

		System.out.println("회원주소 key-in 하시오 >>> : ");
		mnum = sc.next();
		System.out.println("입력한 회원주소 >>> : " + maddr);
		sc.nextLine();

		Ex_Member_1 exm_1 = new Ex_Member_1();
		System.out.println("exm_1 >>> : " + exm_1);


		Ex_MemberVO exvo = new Ex_MemberVO();
		exvo.setMnum(mnum);
		exvo.setMname(mname);
		exvo.setMid(mid);
		exvo.setMpw(mpw);
		exvo.setMhp(mhp);
		exvo.setMmail(mmail);
		exvo.setMaddr(maddr);

		int nCntInsert = exm_1memInsert(exvo);


	System.out.println("nCnInsert >>> : " + nCnInsert);
	if (nCnInsert == 1)
	{
		System.out.println("회원가입 성공!!!");
	}else{
		System.out.println("회원가입 실패!!!");
	}
		}

if ("S".equals(isud.toUpperCase()))
{
	System.out.println("isud >>> : " + isud);
	System.out.println("회원조회 정보를 입력하시오 >>> : " + isud);
	Scanner sc = new Scanner(System.in);

	System.out.println("회원번호를 key_in 하시오!!! >>> : ");
	mnum = sc.next();
	System.out.println("입력한 회원번호 >>> : " + mnum);

	Ex_Member_1 exm_1 = new Ex_Member_1();
	System.out.println("exm_1 >>> : " + exm_1);

	Ex_MemberVO exvo = new Ex_MemberVO();
	exvo.setMnum(mnum);

	exm_1.memSelete(exvo);
}

if ("U".equals(isud.toUpperCase()))
{
	System.out.println("isud >>> : " + isud);
	System.out.println("회원수정 정보를 입력하시오 >>> : " + isud);
	Scanner sc = new Scanner(System.in);

	System.out.println("회원번호를 key_in 하시오!!! >>> : ");
	mnum = sc.next();
	System.out.println("입력한 회원번호 >>> : " + mnum);

	System.out.println("회원주소를 key_in 하시오!!! >>> : ");
	mnum = sc.next();
	System.out.println("입력한 회원주소 >>> : " + mnum);

	Ex_Member_1 exm_1 = new Ex_Member_1();
	System.out.println("exm_1 >>> : " + exm_1);

	Ex_MemberVO exvo = new Ex_MemberVO();
	exvo.setMnum(mnum);
	exvo.setMaddr(addr);

	int nCntUpdate = exm_1.memUpdate(exvo);

	System.out.println("nCnUpdate >>> : " + nCnUpdate);

	if (nCnUpdate == 1)
	{
		System.out.println("회원가입 성공!!!");
	}else{
		System.out.println("회원가입 실패!!!");
	}	
}
	if ("D".equals(isud.toUpperCase()))
	{
		System.out.println("isud >>> : " + isud);
		System.out.println("삭제할 회원번호를 입력하시오 >>> : " + isud);
		Scanner sc = new Scanner(System.in);

		System.out.println("회원번호를 key_in 하시오!!! >>> : ");
		mnum = sc.next();
		System.out.println("입력한 회원번호 >>> : " + mnum);

		Ex_Member_1 exm_1 = new Ex_Member_1();
		System.out.println("exm_1 >>> : " + exm_1);

		Ex_MemberVO exvo = new Ex_MemberVO();
		exvo.setMnum(mnum);

		int nCnDelete = exm_1.memDelete(exvo);

		System.out.println("nCnDelete >>> : " + nCnDelete);

		if (nCnDelete == 1)
		{
			System.out.println("회원정보삭제 성공!!!");

		}else{
			System.out.println("회원정보삭제 실패!!!");
		}
	}
	}else{
			System.out.println("ISUD 구분자를 입력하시오!!!");
	}
	}
}
