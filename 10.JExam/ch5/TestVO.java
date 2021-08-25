package a.b.c.ch5;

/*
사용자정의 TestVO 클래스 자원 = 변수 2개 + 함수 5개;
변수 2개 
	멤버변수 sval
	멤버변수 ival
함수 5개 
	setSval(String sval)
	setIval(String ival)
	getSval()
	getIval()
	TestVO() 생성자
*/
public class TestVO
{
	private String sval;
	private String ival;

	public TestVO(){
		
	}

	public void setSval(String sval){
		this.sval = sval;
	}
	public void setIval(String ival){
		this.ival = ival;
	}

	public String getSval(){
		return this.sval; 
	}
	public String getIval(){
		return this.ival; 
	}

}