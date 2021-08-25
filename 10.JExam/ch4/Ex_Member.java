// package
package a.b.c.ch4.mem;

// import
import a.b.c.ch4.mem.vo.Ex_MemberVO;

/*
콘솔 어플리케이션으로 회원가입을 하는 프로그램 만든다.
회원정보는 명령행 인수로 받는다. 
회원정보 데이터는 VO에 넣어서 사용한다.
회원정보는 
회원번호 : mnum
회원이름 : mname
회원아이디 : mid
회원비밀번호 : mpw
회원휴대폰번호 : mhp
회원이메일주소 : memail
회원주소 : maddr

패키지 : a.b.c.ch4.mem
메인클래스는 : a.b.c.ch4.mem.Ex_Member
캉통클래스 : a.b.c.ch4.mem.vo.Ex_MemberVO
// 다오인터페이스 : a.b.c.ch4.mem.dao.Ex_MemberDAO
// 다오클래스 : a.b.c.ch4.mem.dao.Ex_MemberDAOImpl

만드는 순선
1. VO 만들기 
2. DAO
3. main 만들기
*/

public class  Ex_Member
{
	// 상수 
	// 멤버변수
	

	// 생성자
	public Ex_Member(){
		System.out.println("Ex_Member() 생성자");
	}

	// 함수 
	// 회원 입력
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("Ex_Member.memInsert() 함수 진입 >>> ");
		System.out.println("exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
		System.out.println("exvo.getMname() >>> : " + exvo.getMname());
		System.out.println("exvo.getMid() >>> : " + exvo.getMid());
		System.out.println("exvo.getMpw() >>> : " + exvo.getMpw());
		System.out.println("exvo.getMhp() >>> : " + exvo.getMhp());
		System.out.println("exvo.getMemail() >>> : " + exvo.getMemail());
		System.out.println("exvo.getMaddr() >>> : " + exvo.getMaddr());

		int nCnt = 0;
		
		if (true){
			nCnt = 1;
		}

		return nCnt;
	}

	// 회원정보 조회
	public Ex_MemberVO memSelect(Ex_MemberVO exvo){
		System.out.println("Ex_Member.memSelect() 함수 진입 >>> ");
		
		return null;
	}
	
	// 회원정보 수정
	public int memUpdate(Ex_MemberVO exvo){
		System.out.println("Ex_Member.memUpdate() 함수 진입 >>> ");
		
		return 0;
	}

	// 회원정보 삭제 
	public int memDelete(Ex_MemberVO exvo){
		System.out.println("Ex_Member.memDelete() 함수 진입 >>> ");
		
		return 0;
	}
	

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 지역변수, 참조변수 
		String mnum = ""; 
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String memail = "";
		String maddr = "";

		if (7 == args.length)
		{
			mnum = args[0]; 
			mname = args[1]; 
			mid = args[2]; 
			mpw = args[3]; 
			mhp = args[4]; 
			memail = args[5]; 
			maddr = args[6]; 

			Ex_MemberVO exvo = new Ex_MemberVO();
			exvo.setMnum(mnum);
			exvo.setMname(mname);
			exvo.setMid(mid);
			exvo.setMpw(mpw);
			exvo.setMhp(mhp);
			exvo.setMemail(memail);
			exvo.setMaddr(maddr);

			Ex_Member exm = new Ex_Member();
			int nCnt = exm.memInsert(exvo);
			if (nCnt == 1)
			{
				System.out.println("회원가입 성공 !!!!");
			}else{
				System.out.println("회원가입 실패 !!!!");
			}

		}else{
			System.out.println("데이터를 잘 입력하시오 !!!!");
		}

	}
}
