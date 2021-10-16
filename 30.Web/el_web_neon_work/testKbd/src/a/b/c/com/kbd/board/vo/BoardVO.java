package a.b.c.com.kbd.board.vo;

public class BoardVO {

	/**
	 * @uml.property  name="bnum"
	 */
	private String bnum;
	/**
	 * @uml.property  name="bsubject"
	 */
	private String bsubject;
	/**
	 * @uml.property  name="bwriter"
	 */
	private String bwriter;
	/**
	 * @uml.property  name="bpw"
	 */
	private String bpw;
	/**
	 * @uml.property  name="bmemo"
	 */
	private String bmemo;
	/**
	 * @uml.property  name="bphoto"
	 */
	private String bphoto;
	/**
	 * @uml.property  name="deleteyn"
	 */
	private String deleteyn;
	/**
	 * @uml.property  name="insertdate"
	 */
	private String insertdate;
	/**
	 * @uml.property  name="updatedate"
	 */
	private String updatedate;
	
	// 생성자
	public BoardVO(){
		
	}
	
	public BoardVO(String bnum, String bsubject, String bwriter,
				   String bpw, String bmemo, String bphoto,
				   String deleteyn, String insertdate, String updatedate) {
		
		this.bnum = bnum;
		this.bsubject = bsubject;
		this.bwriter = bwriter;
		this.bpw = bpw;
		this.bmemo = bmemo;
		this.bphoto = bphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;	
	}
	/**
	 * @return
	 * @uml.property  name="bnum"
	 */
	public String getBnum() {
		return bnum;
	}
	/**
	 * @return
	 * @uml.property  name="bsubject"
	 */
	public String getBsubject() {
		return bsubject;
	}
	/**
	 * @return
	 * @uml.property  name="bwriter"
	 */
	public String getBwriter() {
		return bwriter;
	}
	/**
	 * @return
	 * @uml.property  name="bpw"
	 */
	public String getBpw() {
		return bpw;
	}
	/**
	 * @return
	 * @uml.property  name="bmemo"
	 */
	public String getBmemo() {
		return bmemo;
	}
	/**
	 * @return
	 * @uml.property  name="bphoto"
	 */
	public String getBphoto() {
		return bphoto;
	}
	/**
	 * @return
	 * @uml.property  name="deleteyn"
	 */
	public String getDeleteyn() {
		return deleteyn;
	}
	/**
	 * @return
	 * @uml.property  name="insertdate"
	 */
	public String getInsertdate() {
		return insertdate;
	}
	/**
	 * @return
	 * @uml.property  name="updatedate"
	 */
	public String getUpdatedate() {
		return updatedate;
	}
	/**
	 * @param bnum
	 * @uml.property  name="bnum"
	 */
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	/**
	 * @param bsubject
	 * @uml.property  name="bsubject"
	 */
	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}
	/**
	 * @param bwriter
	 * @uml.property  name="bwriter"
	 */
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	/**
	 * @param bpw
	 * @uml.property  name="bpw"
	 */
	public void setBpw(String bpw) {
		this.bpw = bpw;
	}
	/**
	 * @param bmemo
	 * @uml.property  name="bmemo"
	 */
	public void setBmemo(String bmemo) {
		this.bmemo = bmemo;
	}
	/**
	 * @param bphoto
	 * @uml.property  name="bphoto"
	 */
	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}
	/**
	 * @param deleteyn
	 * @uml.property  name="deleteyn"
	 */
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	/**
	 * @param insertdate
	 * @uml.property  name="insertdate"
	 */
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	/**
	 * @param updatedate
	 * @uml.property  name="updatedate"
	 */
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
		
	// 프린트
	public static void printBoardVO (BoardVO bvo){
		System.out.print(bvo.getBnum() + ":");
		System.out.print(bvo.getBsubject() + ":");
		System.out.print(bvo.getBwriter() + ":");
		System.out.print(bvo.getBpw() + ":");
		System.out.print(bvo.getBmemo() + ":");
		System.out.print(bvo.getDeleteyn() + ":");
		System.out.print(bvo.getInsertdate() + ":");
		System.out.println(bvo.getUpdatedate());
	}
	
	public static void printlnKbdBoardVO (BoardVO bvo){
		System.out.println("bvo.getBnum()					>>> : " + bvo.getBnum());
		System.out.println("bvo.getBsubject()				>>> : " + bvo.getBsubject());
		System.out.println("bvo.getBwriter()				>>> : " + bvo.getBwriter());
		System.out.println("bvo.getBpw()					>>> : " + bvo.getBpw());
		System.out.println("bvo.getBmemo()					>>> : " + bvo.getBmemo());
		System.out.println("bvo.getBphoto()					>>> : " + bvo.getBphoto());
		System.out.println("bvo.getDeleteyn()				>>> : " + bvo.getDeleteyn());
		System.out.println("bvo.getInsertdate()				>>> : " + bvo.getInsertdate());
		System.out.println("bvo.getUpdatedate()				>>> : " + bvo.getUpdatedate());	
	}	
}
