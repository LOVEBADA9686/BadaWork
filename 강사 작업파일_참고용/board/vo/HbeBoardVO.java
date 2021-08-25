package a.b.c.board.vo;

public class HbeBoardVO {
	
	private String bnum;
	private String bsubject;
	private String bwriter;
	private String bcontents;
	private String bpw;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// 생성자 
	public HbeBoardVO() {
		
	}
	
	public HbeBoardVO(String bnum, String bsubject, 
			          String bwriter, String bcontents, 
			          String bpw, String deleteyn,
			          String insertdate, String updatedate) {		
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
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
	
	// 프린트 
	public static void printHbeBoardVO (HbeBoardVO hvo){
		System.out.print(hvo.getBnum() + " : ");
		System.out.print(hvo.getBsubject() + " : ");
		System.out.print(hvo.getBwriter() + " : ");
		System.out.print(hvo.getBcontents() + " : ");
		System.out.print(hvo.getBpw() + " : ");
		System.out.print(hvo.getDeleteyn() + " : ");
		System.out.print(hvo.getInsertdate() + " : ");
		System.out.println(hvo.getUpdatedate());
	}
	
	public static void printlnHbeBoardVO (HbeBoardVO hvo){
		System.out.println("hvo.getBnum() 			>>> : " + hvo.getBnum());
		System.out.println("hvo.getBsubject() 		>>> : " + hvo.getBsubject());
		System.out.println("hvo.getBwriter() 		>>> : " + hvo.getBwriter());
		System.out.println("hvo.getBcontents() 		>>> : " + hvo.getBcontents());
		System.out.println("hvo.getBpw() 			>>> : " + hvo.getBpw());
		System.out.println("hvo.getDeleteyn() 		>>> : " + hvo.getDeleteyn());
		System.out.println("hvo.getInsertdate() 	>>> : " + hvo.getInsertdate());
		System.out.println("hvo.getUpdatedadte() 	>>> : " + hvo.getUpdatedate());
	}
}
