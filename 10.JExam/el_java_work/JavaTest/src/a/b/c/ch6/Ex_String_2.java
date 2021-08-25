package a.b.c.ch6;

import java.util.StringTokenizer;

public class Ex_String_2 {
	
	public void charSplit(String sVal){
		
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			
			String sChar[] = sVal.split("@");
			
			for (int i=0; i < sChar.length; i++ ){
				System.out.println("sChar["+i+"] >>> : " + sChar[i]);
			}
		}
	}
	
	public void charToken(String sVal){
		System.out.println("charToken(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			
			StringTokenizer st = new StringTokenizer(sVal, "@^ |");
			
			while (st.hasMoreTokens()) {
				System.out.println(">>> : " + st.nextToken());
			}
			
//			for (int i=0; st.hasMoreTokens(); i++ ){
//				System.out.println(i + "¹øÂ° : " + st.nextToken());
//			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sVal = "a b^c,d ef,g|h^i,jk|l,m^no";
		System.out.println("sVal >>> : " + sVal);
		
		sVal = sVal.replace(',', '@');
		System.out.println("sVal >>> : " + sVal);	
		
		Ex_String_2 ex2 = new Ex_String_2();
		ex2.charSplit(sVal);
		ex2.charToken(sVal);
	}
}
