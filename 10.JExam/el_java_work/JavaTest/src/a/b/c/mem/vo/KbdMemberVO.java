package a.b.c.mem.vo;

import a.b.c.common.CodeUtil;

public class KbdMemberVO {
	
	private String knum;
	private String kname;
	private String kid;
	private String kpw;
	private String kbirth;
	private String kgender;
	private String ktel;
	private String khp;
	private String kemail;
	private String kaddr;
	private String khobby;
	private String kphoto;
	private String kskill;
	private String kjob;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// »ý¼ºÀÚ
	public KbdMemberVO() {
		
	}
	
	public KbdMemberVO(String knum, String kname, String kid, 
	           String kpw, String kbirth, String kgender, 
	           String ktel, String khp, String kemail, 
	           String kaddr, String khobby, String kphoto, 
	           String kskill, String kjob, String deleteyn, 
	           String insertdate, String updatedate) {
		
		this.knum = knum;
		this.kname = kname;
		this.kid = kid;
		this.kpw = kpw;
		this.kbirth = kbirth;
		this.kgender = kgender;
		this.ktel = ktel;
		this.khp = khp;
		this.kemail = kemail;
		this.kaddr = kaddr;
		this.khobby = khobby;
		this.kphoto = kphoto;
		this.kskill = kskill;
		this.kjob = kjob;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	public String getKnum() {
		return knum;
	}

	public String getKname() {
		return kname;
	}

	public String getKid() {
		return kid;
	}

	public String getKpw() {
		return kpw;
	}

	public String getKbirth() {
		return kbirth;
	}

	public String getKgender() {
		return kgender;
	}

	public String getKtel() {
		return ktel;
	}

	public String getKhp() {
		return khp;
	}

	public String getKemail() {
		return kemail;
	}

	public String getKaddr() {
		return kaddr;
	}

	public String getKhobby() {
		return khobby;
	}

	public String getKphoto() {
		return kphoto;
	}

	public String getKskill() {
		return kskill;
	}

	public String getKjob() {
		return kjob;
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

	public void setKnum(String knum) {
		this.knum = knum;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public void setKid(String kid) {
		this.kid = kid;
	}

	public void setKpw(String kpw) {
		this.kpw = kpw;
	}

	public void setKbirth(String kbirth) {
		this.kbirth = kbirth;
	}

	public void setKgender(String kgender) {
		this.kgender = kgender;
	}

	public void setKtel(String ktel) {
		this.ktel = ktel;
	}

	public void setKhp(String khp) {
		this.khp = khp;
	}

	public void setKemail(String kemail) {
		this.kemail = kemail;
	}

	public void setKaddr(String kaddr) {
		this.kaddr = kaddr;
	}

	public void setKhobby(String khobby) {
		this.khobby = khobby;
	}

	public void setKphoto(String kphoto) {
		this.kphoto = kphoto;
	}

	public void setKskill(String kskill) {
		this.kskill = kskill;
	}

	public void setKjob(String kjob) {
		this.kjob = kjob;
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
	
	public static void printKbdMemberVO(KbdMemberVO kvo) {
		System.out.print(kvo.getKnum() 			+ ", ");
		System.out.print(kvo.getKname() 		+ ", ");
		System.out.print(kvo.getKid() 			+ ", ");
		System.out.print(kvo.getKpw() 			+ ", ");
		System.out.print(CodeUtil.birth(kvo.getKbirth()) 			+ ", ");
		System.out.print(CodeUtil.gender(kvo.getKgender())			+ ", ");
		System.out.print(CodeUtil.tel(kvo.getKtel()) 				+ ", ");
		System.out.print(kvo.getKemail() 			+ ", ");
		System.out.print(kvo.getKaddr() 			+ ", ");
		System.out.print(CodeUtil.hobby(kvo.getKjob()) 				+ ", ");
		System.out.print(kvo.getKphoto() 			+ ", ");
		System.out.print(kvo.getKskill() 			+ ", ");
		System.out.print(CodeUtil.job(kvo.getKjob()) 				+ ", ");
		System.out.print(kvo.getDeleteyn() 			+ ", ");
		System.out.print(kvo.getInsertdate() 		+ ", ");
		System.out.print(kvo.getUpdatedate());
	}
	
	public static void printlnKbdMemberVO(KbdMemberVO kvo) {
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKnum());
		System.out.println("kvo.getKname() 		>>> : " + kvo.getKname());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKid());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKpw());
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.birth(kvo.getKbirth()));
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.gender(kvo.getKgender()));
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.tel(kvo.getKtel()));
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.hp(kvo.getKhp()));
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKemail());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKaddr());
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.hobby(kvo.getKhobby()));
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKphoto());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getKskill());
		System.out.println("kvo.getKnum() 		>>> : " + CodeUtil.job(kvo.getKjob()));
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getDeleteyn());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getInsertdate());
		System.out.println("kvo.getKnum() 		>>> : " + kvo.getUpdatedate());
	}
}
