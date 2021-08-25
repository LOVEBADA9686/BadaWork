// package
package a.b.c.ch4.mem.vo;

// import


public class  Ex_MemberVO
{

	// 멤버변수
	// 멤버변수에 private 접근제한자를 붙이면
	// 이 멤버변수를 클래스 밖에서 호출할 수 가 없다. : 정보의 은닉화 
	// 이 멤버변수의 데이터를 사용하려면 setter, getter 함수를 이용해야 한다. 
	private String mnum; 
	private String mname;
	private String mid;
	private String mpw;
	private String mhp;
	private String memail;
	private String maddr;

	public Ex_MemberVO(){
		
	}

	// setter 함수 : 멤버변수 초기화 하는 함수 
	// setter 함수 만드는 규칙 
	// 1. 접두어 set 을 사용한다. 
	// 2. 변수의 첫 번째 글자를 대문자로 한다. 
	// 3. 1 + 2 : set + Mnum = setMnum()
	public void setMnum(String mnum){ this.mnum = mnum; }
	public void setMname(String mname){ this.mname = mname; }
	public void setMid(String mid){ this.mid = mid; }
	public void setMpw(String mpw){ this.mpw = mpw; }
	public void setMhp(String mhp){ this.mhp = mhp; }
	public void setMemail(String memail){ this.memail = memail; }
	public void setMaddr(String maddr){ this.maddr = maddr; }


	// getter 함수 : 멤버변수에 초기화 된 값은 리턴하는 함수
	// getter 함수 만드는 규칙 
	// 1. 접두어 get 을 사용한다. 
	// 2. 변수의 첫 번째 글자를 대문자로 한다. 
	// 3. 1 + 2 : get + Mnum = getMnum()
	public String getMnum(){ return this.mnum; }
	public String getMname(){ return this.mname; }
	public String getMid(){ return this.mid; }
	public String getMpw(){ return this.mpw; }
	public String getMhp(){ return this.mhp; }
	public String getMemail(){ return this.memail; }
	public String getMaddr(){ return this.maddr; }
}
