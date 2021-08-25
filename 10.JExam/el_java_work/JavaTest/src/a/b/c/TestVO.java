package a.b.c;

public class TestVO {

	String munm;
	String mid;
	String mpw;
	String mhp;
	String mjuso;
	public TestVO() {
		
	}

	public TestVO(String munm, String mid, 
				  String mpw, String mhp, 
				  String mjuso) {
		super();
		this.munm = munm;
		this.mid = mid;
		this.mpw = mpw;
		this.mhp = mhp;
		this.mjuso = mjuso;
	}
	
	public String getMunm() {
		return munm;
	}
	public String getMid() {
		return mid;
	}
	public String getMpw() {
		return mpw;
	}
	public String getMhp() {
		return mhp;
	}
	public String getMjuso() {
		return mjuso;
	}
	
	public void setMunm(String munm) {
		this.munm = munm;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public void setMhp(String mhp) {
		this.mhp = mhp;
	}
	public void setMjuso(String mjuso) {
		this.mjuso = mjuso;
	}
}
