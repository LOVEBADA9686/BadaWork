package a.b.c.com.kbd.notice.vo;

public class NoticeVO {

	/**
	 * @uml.property  name="nnum"
	 */
	private String nnum;
	/**
	 * @uml.property  name="nsubject"
	 */
	private String nsubject;
	/**
	 * @uml.property  name="nmemo"
	 */
	private String nmemo;
	/**
	 * @uml.property  name="nphoto"
	 */
	private String nphoto;
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
	public NoticeVO(){}
	
	public NoticeVO(String nnum, String nsubject, String nmemo,
					String nphoto, String deleteyn, String insertdate, String updatedate){
		
		this.nnum = nnum;
		this.nsubject = nsubject;
		this.nmemo = nmemo;
		this.nphoto = nphoto;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}

	/**
	 * @return
	 * @uml.property  name="nnum"
	 */
	public String getNnum() {
		return nnum;
	}

	/**
	 * @return
	 * @uml.property  name="nsubject"
	 */
	public String getNsubject() {
		return nsubject;
	}

	/**
	 * @return
	 * @uml.property  name="nmemo"
	 */
	public String getNmemo() {
		return nmemo;
	}

	/**
	 * @return
	 * @uml.property  name="nphoto"
	 */
	public String getNphoto() {
		return nphoto;
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
	 * @param nnum
	 * @uml.property  name="nnum"
	 */
	public void setNnum(String nnum) {
		this.nnum = nnum;
	}

	/**
	 * @param nsubject
	 * @uml.property  name="nsubject"
	 */
	public void setNsubject(String nsubject) {
		this.nsubject = nsubject;
	}

	/**
	 * @param nmemo
	 * @uml.property  name="nmemo"
	 */
	public void setNmemo(String nmemo) {
		this.nmemo = nmemo;
	}

	/**
	 * @param nphoto
	 * @uml.property  name="nphoto"
	 */
	public void setNphoto(String nphoto) {
		this.nphoto = nphoto;
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
	
	// Notice 프린트 함수
	public static void printNoticeVO(NoticeVO nvo){
		
		System.out.print(nvo.getNnum()									+ ",");
		System.out.print(nvo.getNsubject()								+ ",");
		System.out.print(nvo.getNmemo()									+ ",");
		System.out.print(nvo.getNphoto()								+ ",");
		System.out.print(nvo.getDeleteyn()								+ ",");
		System.out.print(nvo.getInsertdate()							+ ",");
		System.out.println(nvo.getUpdatedate()							+ ",");
	}
	
	public static void printlnNoticeVO(NoticeVO nvo){
		
		System.out.println("nvo.getNnum()							>>> : " + nvo.getNnum());
		System.out.println("nvo.getNsubject()						>>> : " + nvo.getNsubject());
		System.out.println("nvo.getNmemo()							>>> : " + nvo.getNmemo());
		System.out.println("nvo.getNphoto()							>>> : " + nvo.getNphoto());
		System.out.println("nvo.getDeleteyn()						>>> : " + nvo.getDeleteyn());
		System.out.println("nvo.getInsertdate()						>>> : " + nvo.getInsertdate());
		System.out.println("nvo.getUpdatedate()						>>> : " + nvo.getUpdatedate());
	}
}
