package a.b.c.kosmo.mem.vo;

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
	
	// 생성자
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
	
	
	// KbdMemberVO 프린트 함수
	public static void printKbdMemberVO(KbdMemberVO kvo) {
		System.out.print(kvo.getKnum()					+ ", ");
		System.out.print(kvo.getKname()					+ ", ");
		System.out.print(kvo.getKid()					+ ", ");
		System.out.print(kvo.getKpw()					+ ", ");
		System.out.print(CodeUtil.birth(kvo.getKbirth())					+ ", ");
		System.out.print(CodeUtil.gender(kvo.getKgender())					+ ", ");
		System.out.print(CodeUtil.tel(kvo.getKtel())						+ ", ");
		System.out.print(CodeUtil.hp(kvo.getKhp())							+ ", ");
		System.out.print(kvo.getKemail()				+ ", ");
		System.out.print(kvo.getKaddr()					+ ", ");
		System.out.print(CodeUtil.hobby(kvo.getKhobby())					+ ", ");
		System.out.print(kvo.getKphoto()				+ ", ");
		System.out.print(kvo.getKskill()				+ ", ");
		System.out.print(CodeUtil.job(kvo.getKjob())						+ ", ");
		System.out.print(kvo.getDeleteyn()				+ ", ");
		System.out.print(kvo.getInsertdate()			+ ", ");
		System.out.println(kvo.getUpdatedate());
	}
	
	public static void printlnKbdMemberVO(KbdMemberVO kvo) {
		
		System.out.println("hvo.getKnum() 		>>> : " + kvo.getKnum());
		System.out.println("hvo.getKname() 		>>> : " + kvo.getKname());
		System.out.println("hvo.geKHid() 		>>> : " + kvo.getKid());
		System.out.println("hvo.getKpw() 		>>> : " + kvo.getKpw());
		System.out.println("hvo.getKbirth() 	>>> : " + CodeUtil.birth(kvo.getKbirth()));
		System.out.println("hvo.getKgender() 	>>> : " + CodeUtil.gender(kvo.getKgender()));
		System.out.println("hvo.getKtel() 		>>> : " + CodeUtil.tel(kvo.getKtel()));
		System.out.println("hvo.getKhp() 		>>> : " + CodeUtil.hp(kvo.getKhp()));
		System.out.println("hvo.getKemail() 	>>> : " + kvo.getKemail());
		System.out.println("hvo.getKaddr() 		>>> : " + kvo.getKaddr());
		System.out.println("hvo.getKhobby() 	>>> : " + CodeUtil.hobby(kvo.getKhobby()));
		System.out.println("hvo.getKphoto() 	>>> : " + kvo.getKphoto());
		System.out.println("hvo.getKskill() 	>>> : " + kvo.getKskill());
		System.out.println("hvo.getKjob() 		>>> : " + CodeUtil.job(kvo.getKjob()));
		System.out.println("hvo.getDeleteyn() 	>>> : " + kvo.getDeleteyn());
		System.out.println("hvo.getInsertdate() >>> : " + kvo.getInsertdate());
		System.out.println("hvo.getInsertdate() >>> : " + kvo.getUpdatedate());
	}
}
