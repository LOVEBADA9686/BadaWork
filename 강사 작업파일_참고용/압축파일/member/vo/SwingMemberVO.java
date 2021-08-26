package a.b.c.swing.member.vo;

public class SwingMemberVO {

	private String swnum;
	private String swname;
	private String swid;
	private String swpw;	
	private String deleteyn;
	private String insertdate;
	private String updatedate;
	
	// »ý¼ºÀÚ
	public SwingMemberVO() {
		
	}
	
	public SwingMemberVO( String swnum, String swname, 
			              String swid, String swpw, 
			              String deleteyn, String insertdate, 
			              String updatedate) {		
		this.swnum = swnum;
		this.swname = swname;
		this.swid = swid;
		this.swpw = swpw;	
		this.deleteyn = deleteyn;
		this.insertdate = insertdate;
		this.updatedate = updatedate;
	}
		
	public String getSwnum() {
		return swnum;
	}
	public String getSwname() {
		return swname;
	}
	public String getSwid() {
		return swid;
	}
	public String getSwpw() {
		return swpw;
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
	public void setSwnum(String swnum) {
		this.swnum = swnum;
	}
	public void setSwname(String swname) {
		this.swname = swname;
	}
	public void setSwid(String swid) {
		this.swid = swid;
	}
	public void setSwpw(String swpw) {
		this.swpw = swpw;
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
	
}
