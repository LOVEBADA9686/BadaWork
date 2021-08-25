package a.b.c.kosmo.board.vo;

public class KbdBoardVO {
	
	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bcontents;
	private String bpw;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// 생성자
	public KbdBoardVO() {
		
	}
	
	public KbdBoardVO(String bnum, String bsubject, 
						String bwriter, String bcontents,
						String bpw, String deleteyn,
						String insertdate, String updatedate) {
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bsubject = bsubject;
		this.bwriter =bwriter;
		this.bcontents = bcontents;
		this.bpw = bpw;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	// getter() 함수 
	public String getBnum() {
		return bnum;
	}

	public String getBsubject() {
		return bsubject;
	}

	public String getBwriter() {
		return bwriter;
	}

	public String getBcontents() {
		return bcontents;
	}

	public String getBpw() {
		return bpw;
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
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}

	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public void setBpw(String bpw) {
		this.bpw = bpw;
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
	
	//프린트
	public static void printKbdBoardVO (KbdBoardVO kvo) {
		System.out.print(kvo.getBnum() + " : ");
		System.out.print(kvo.getBsubject() + " : ");
		System.out.print(kvo.getBwriter() + " : ");
		System.out.print(kvo.getBcontents() + " : ");
		System.out.print(kvo.getBpw() + " : ");
		System.out.print(kvo.getDeleteyn() + " : ");
		System.out.print(kvo.getUpdatedate() + " : ");
		System.out.println(kvo.getUpdatedate());
	}
	
	public static void printlnKbdBoardVO (KbdBoardVO kvo) {
		System.out.println("kvo.getBnum()			>>> : " + kvo.getBnum());
		System.out.println("kvo.getBsubject()		>>> : " + kvo.getBsubject());
		System.out.println("kvo.getBwriter()		>>> : " + kvo.getBwriter());
		System.out.println("kvo.getBcontents()		>>> : " + kvo.getBcontents());
		System.out.println("kvo.getBpw()			>>> : " + kvo.getBpw());
		System.out.println("kvo.getDeleteyn()		>>> : " + kvo.getDeleteyn());
		System.out.println("kvo.getInsertdate()		>>> : " + kvo.getInsertdate());
		System.out.println("kvo.getUpdatedadte()	>>> : " + kvo.getUpdatedate());
	}
}
