package a.b.c.ch1;

public class ÀÌ±ÙÈñ {

	public String name;
	public String role;

	public ÀÌ±ÙÈñ(String role){
		this.role = role;
	}

	public static void main(String args[]){
		 
		 ÀÌ±ÙÈñ ½Å¶û = new ÀÌ±ÙÈñ("¸¶´ÔÀ» Äª¼ÛÇÏ´Â ¸àÆ®");
		 System.out.println("½Å¶û >>> : " + ½Å¶û);
		 System.out.println("½Å¶û.role >>> : " + ½Å¶û.role);
		 ÀÌ±ÙÈñ °­»ç = new ÀÌ±ÙÈñ("ÀÚ¹Ù ÃµÃµÈ÷ °¡¸£Å°ÀÚ");
		 System.out.println("°­»ç >>> : " + °­»ç);
		 System.out.println("°­»ç.role >>> : " + °­»ç.role);
		 ÀÌ±ÙÈñ Ä£±¸ = new ÀÌ±ÙÈñ("Àë³ª°Ô ³î¾Æ¾ßÁö");
		 System.out.println("Ä£±¸ >>> : " + Ä£±¸);
		 System.out.println("Ä£±¸.role >>> : " + Ä£±¸.role);

	} // end of main ÇÔ¼ö
} // end of Ex_5 Å¬·¡½º