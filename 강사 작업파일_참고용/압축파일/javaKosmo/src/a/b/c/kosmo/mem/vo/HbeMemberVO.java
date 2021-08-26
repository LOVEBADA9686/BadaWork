package a.b.c.kosmo.mem.vo;

import a.b.c.common.CodeUtil;

public class HbeMemberVO {

	private String hnum;
	private String hname;
	private String hid;
	private String hpw; 
	private String hbirth;
	private String hgender;
	private String htel;
	private String hhp; 
	private String hemail;
	private String haddr; 
	private String hhobby;
	private String hphoto;
	private String hskill;
	private String hjob;
	private String deleteyn; 
	private String insertdate; 
	private String updatedate;
	
	// 생성자 
	public HbeMemberVO() {
		
	}
			
	public HbeMemberVO(String hnum, String hname, String hid, 
			           String hpw, String hbirth, String hgender, 
			           String htel, String hhp, String hemail, 
			           String haddr, String hhobby, String hphoto, 
			           String hskill, String hjob, String deleteyn, 
			           String insertdate, String updatedate) {
		
		this.hnum = hnum;
		this.hname = hname;
		this.hid = hid;
		this.hpw = hpw;
		this.hbirth = hbirth;
		this.hgender = hgender;
		this.htel = htel;
		this.hhp = hhp;
		this.hemail = hemail;
		this.haddr = haddr;
		this.hhobby = hhobby;
		this.hphoto = hphoto;
		this.hskill = hskill;
		this.hjob = hjob;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	
	// getter() 함수 
	public String getHnum() {
		return hnum;
	}
	public String getHname() {
		return hname;
	}
	public String getHid() {
		return hid;
	}
	public String getHpw() {
		return hpw;
	}
	public String getHbirth() {
		return hbirth;
	}
	public String getHgender() {
		return hgender;
	}
	public String getHtel() {
		return htel;
	}
	public String getHhp() {
		return hhp;
	}
	public String getHemail() {
		return hemail;
	}
	public String getHaddr() {
		return haddr;
	}
	public String getHhobby() {
		return hhobby;
	}
	public String getHphoto() {
		return hphoto;
	}
	public String getHskill() {
		return hskill;
	}
	public String getHjob() {
		return hjob;
	}
	public String getDeleteyn() {
		return deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	
	// setter() 함수 
	public void setHnum(String hnum) {
		this.hnum = hnum;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public void setHpw(String hpw) {
		this.hpw = hpw;
	}
	public void setHbirth(String hbirth) {
		this.hbirth = hbirth;
	}
	public void setHgender(String hgender) {
		this.hgender = hgender;
	}
	public void setHtel(String htel) {
		this.htel = htel;
	}
	public void setHhp(String hhp) {
		this.hhp = hhp;
	}
	public void setHemail(String hemail) {
		this.hemail = hemail;
	}
	public void setHaddr(String haddr) {
		this.haddr = haddr;
	}
	public void setHhobby(String hhobby) {
		this.hhobby = hhobby;
	}
	public void setHphoto(String hphoto) {
		this.hphoto = hphoto;
	}
	public void setHskill(String hskill) {
		this.hskill = hskill;
	}
	public void setHjob(String hjob) {
		this.hjob = hjob;
	}
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}

	// HbeMemberVO 프린트 함수 
	public static void printHbeMemberVO(HbeMemberVO hvo) {
		
		System.out.print(hvo.getHnum() 			+ ", ");
		System.out.print(hvo.getHname() 		+ ", ");
		System.out.print(hvo.getHid()			+ ", ");
		System.out.print(hvo.getHpw() 			+ ", ");
		System.out.print(CodeUtil.birth(hvo.getHbirth()) 	+ ", ");
		System.out.print(CodeUtil.gender(hvo.getHgender())  + ", ");
		System.out.print(CodeUtil.tel(hvo.getHtel())		+ ", ");
		System.out.print(CodeUtil.hp(hvo.getHhp()) 			+ ", ");
		System.out.print(hvo.getHemail()		+ ", ");
		System.out.print(hvo.getHaddr() 		+ ", ");
		System.out.print(CodeUtil.hobby(hvo.getHhobby())    + ", ");
		System.out.print(hvo.getHphoto() 		+ ", ");
		System.out.print(hvo.getHskill()		+ ", ");
		System.out.print(CodeUtil.job(hvo.getHjob())        + ", ");
		System.out.print(hvo.getDeleteyn() 		+ ", ");
		System.out.print(hvo.getInsertdate() 	+ ", ");
		System.out.println(hvo.getUpdatedate());
	}
	
	public static void printlnHbeMemberVO(HbeMemberVO hvo) {
		
		System.out.println("hvo.getHnum() 		>>> : " + hvo.getHnum());
		System.out.println("hvo.getHname() 		>>> : " + hvo.getHname());
		System.out.println("hvo.getHid() 		>>> : " + hvo.getHid());
		System.out.println("hvo.getHpw() 		>>> : " + hvo.getHpw());
		System.out.println("hvo.getHbirth() 	>>> : " + CodeUtil.birth(hvo.getHbirth()));
		System.out.println("hvo.getHgender() 	>>> : " + CodeUtil.gender(hvo.getHgender()));
		System.out.println("hvo.getHtel() 		>>> : " + CodeUtil.tel(hvo.getHtel()));
		System.out.println("hvo.getHhp() 		>>> : " + CodeUtil.hp(hvo.getHhp()));
		System.out.println("hvo.getHemail() 	>>> : " + hvo.getHemail());
		System.out.println("hvo.getHaddr() 		>>> : " + hvo.getHaddr());
		System.out.println("hvo.getHhobby() 	>>> : " + CodeUtil.hobby(hvo.getHhobby()));
		System.out.println("hvo.getHphoto() 	>>> : " + hvo.getHphoto());
		System.out.println("hvo.getHskill() 	>>> : " + hvo.getHskill());
		System.out.println("hvo.getHjob() 		>>> : " + CodeUtil.job(hvo.getHjob()));
		System.out.println("hvo.getDeleteyn() 	>>> : " + hvo.getDeleteyn());
		System.out.println("hvo.getInsertdate() >>> : " + hvo.getInsertdate());
		System.out.println("hvo.getInsertdate() >>> : " + hvo.getUpdatedate());
	}
}
