package a.b.c.com.kbd.book.vo;

public class BookVO {

	/**
	 * @uml.property  name="bnum"
	 */
	private String bnum;
	/**
	 * @uml.property  name="btitle"
	 */
	private String btitle;
	/**
	 * @uml.property  name="bauth"
	 */
	private String bauth;
	/**
	 * @uml.property  name="isbn"
	 */
	private String isbn;
	/**
	 * @uml.property  name="bcomp"
	 */
	private String bcomp;
	/**
	 * @uml.property  name="bprice"
	 */
	private String bprice;
	/**
	 * @uml.property  name="bqty"
	 */
	private String bqty;
	/**
	 * @uml.property  name="bcover"
	 */
	private String bcover;
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
	public BookVO(){
		
	}
	
	public BookVO(	String bnum, String btitle, String bauth, 
			     	String isbn, String bcomp, String bprice, 
			     	String bqty, String bcover, String deleteyn, 
			     	String insertdate, String updatedate) {
		this.bnum = bnum;
		this.btitle = btitle;
		this.bauth = bauth;
		this.isbn = isbn;
		this.bcomp = bcomp;
		this.bprice = bprice;
		this.bqty = bqty;
		this.bcover = bcover;
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
	// getter()
	/**
	 * @return
	 * @uml.property  name="bnum"
	 */
	public String getBnum() {
		return bnum;
	}
	/**
	 * @return
	 * @uml.property  name="btitle"
	 */
	public String getBtitle() {
		return btitle;
	}
	/**
	 * @return
	 * @uml.property  name="bauth"
	 */
	public String getBauth() {
		return bauth;
	}
	/**
	 * @return
	 * @uml.property  name="isbn"
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @return
	 * @uml.property  name="bcomp"
	 */
	public String getBcomp() {
		return bcomp;
	}
	/**
	 * @return
	 * @uml.property  name="bprice"
	 */
	public String getBprice() {
		return bprice;
	}
	/**
	 * @return
	 * @uml.property  name="bqty"
	 */
	public String getBqty() {
		return bqty;
	}
	/**
	 * @return
	 * @uml.property  name="bcover"
	 */
	public String getBcover() {
		return bcover;
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
	
	// setter()
	/**
	 * @param bnum
	 * @uml.property  name="bnum"
	 */
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	/**
	 * @param btitle
	 * @uml.property  name="btitle"
	 */
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	/**
	 * @param bauth
	 * @uml.property  name="bauth"
	 */
	public void setBauth(String bauth) {
		this.bauth = bauth;
	}
	/**
	 * @param isbn
	 * @uml.property  name="isbn"
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @param bcomp
	 * @uml.property  name="bcomp"
	 */
	public void setBcomp(String bcomp) {
		this.bcomp = bcomp;
	}
	/**
	 * @param bprice
	 * @uml.property  name="bprice"
	 */
	public void setBprice(String bprice) {
		this.bprice = bprice;
	}
	/**
	 * @param bqty
	 * @uml.property  name="bqty"
	 */
	public void setBqty(String bqty) {
		this.bqty = bqty;
	}
	/**
	 * @param bcover
	 * @uml.property  name="bcover"
	 */
	public void setBcover(String bcover) {
		this.bcover = bcover;
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
	
	// 프린터
	public static void printBookVO(BookVO bvo) {
      System.out.print(bvo.getBnum()        + " : ");
      System.out.print(bvo.getBtitle()      + " : ");
      System.out.print(bvo.getBauth()       + " : ");
      System.out.print(bvo.getIsbn()        + " : ");
      System.out.print(bvo.getBcomp()       + " : ");
      System.out.print(bvo.getBprice()      + " : ");
      System.out.print(bvo.getBqty()        + " : ");
      System.out.print(bvo.getBcover()      + " : ");
      System.out.print(bvo.getDeleteyn()    + " : ");
      System.out.print(bvo.getInsertdate()  + " : ");
      System.out.print(bvo.getUpdatedate()         );
   }
   
   public static void printlnPshBoardVO(BookVO bvo) {
      System.out.println("bvo.getBnum() : " + bvo.getBnum()        );
      System.out.println("bvo.getBtitle() : " + bvo.getBtitle()      );
      System.out.println("bvo.getBauth() : " + bvo.getBauth()       );
      System.out.println("bvo.getIsbn() : " + bvo.getIsbn()        );
      System.out.println("bvo.getBcomp() : " + bvo.getBcomp()       );
      System.out.println("bvo.getBprice() : " + bvo.getBprice()      );
      System.out.println("bvo.getBqty() : " + bvo.getBqty()        );
      System.out.println("bvo.getBcover() : " + bvo.getBcover()      );
      System.out.println("bvo.getDeleteyn() : " + bvo.getDeleteyn()    );
      System.out.println("bvo.getInsertdate() : " + bvo.getInsertdate()  );
      System.out.println("bvo.getUpdatedate() : " + bvo.getUpdatedate()  );
   }
}
