package a.b.c.swing.sample;


//CREATE TABLE K_MEMBER(
//	  KNUM 			VARCHAR2(20) 	PRIMARY KEY
//   ,KNAME		 	VARCHAR2(50)
//   ,KID 			VARCHAR2(20)  	NOT NULL
//   ,KPW 			VARCHAR2(300) 
//   ,DELETEYN		VARCHAR2(1) 	NOT NULL
//   ,INSERTDATE 	DATE
//   ,UPDATEDATE 	DATE
//);
//
//DESC K_MEMBER;
//
//-- SYS_C0011100
//SELECT A.INDEX_NAME, A.TABLE_NAME, A.COLUMN_NAME FROM ALL_IND_COLUMNS A 
//WHERE A.TABLE_NAME IN ('K_MEMBER'); 
// 
//SELECT  /*+ INDEX_DESC(SYS_C0011100) */ 
//        NVL(MAX(SUBSTR(A.KNUM,-4)),0)+1 COMMNO 
//FROM    K_MEMBER A;

public class MemberVO {

	private String knum;
	private String kname;
	private String kid;
	private String kpw;
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// »ý¼ºÀÚ
	public MemberVO() {}
	public MemberVO(String knum, String kname, 
			        String kid, String kpw, 
			        String deleteyn, String insertdate,
			        String updatedate) {		
		this.knum = knum;
		this.kname = kname;
		this.kid = kid;
		this.kpw = kpw;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	
	// getter()
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
	public String getDeleteyn() {
		return deleteyn;
	}
	public String getInsertdate() {
		return insertdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	
	// setter()
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
	public void setDeleteyn(String deleteyn) {
		this.deleteyn = deleteyn;
	}
	public void setInsertdate(String insertdate) {
		this.insertdate = insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	
	public static void printMemberVO(MemberVO mvo) {
		System.out.print(mvo.getKnum() + " : ");
		System.out.print(mvo.getKname() + " : ");
		System.out.print(mvo.getKid() + " : ");
		System.out.print(mvo.getKpw() + " : ");		
		System.out.print(mvo.getDeleteyn() + " : ");
		System.out.print(mvo.getInsertdate() + " : ");
		System.out.println(mvo);				
	}
	
	public static void printlnMemberVO(MemberVO mvo){
		System.out.println("mvo.getKnum() 					>>> : " + mvo.getKnum());
		System.out.println("mvo.getKname() 					>>> : " + mvo.getKname());
		System.out.println("mvo.getKid() 					>>> : " + mvo.getKid());
		System.out.println("mvo.getKpw() 					>>> : " + mvo.getKpw());		
		System.out.println("mvo.getDeleteyn() 				>>> : " + mvo.getDeleteyn());
		System.out.println("mvo.getInsertdate() 			>>> : " + mvo.getInsertdate());
		System.out.println("mvo.getUpdatedate() 			>>> : " + mvo.getUpdatedate());		
	}
	
}
