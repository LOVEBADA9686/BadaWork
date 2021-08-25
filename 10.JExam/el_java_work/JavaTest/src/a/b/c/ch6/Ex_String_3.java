package a.b.c.ch6;

import java.util.StringTokenizer;

public class Ex_String_3 {

	public void charSplit(String sVal){
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			sVal = sVal.replace('#', ' ');
			
			String sChar[] = sVal.split(" ");
			
			for (int i=0; i < sChar.length; i++ ){
				String s = sChar[i];
				System.out.println("sChar["+i+"] >>> : " + s);
			
				for (int j=0; j < s.length(); j++ ){
					System.out.println("s.charAt("+j+") >>> : " + s.charAt(j));
				}
			}
		}
	}
	public void charToken(String sVal){
		System.out.println("charToken(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0){
			StringTokenizer st = new StringTokenizer(sVal, "#");
			
			for (int i=0; st.hasMoreTokens(); i++ ){
				String ss = st.nextToken();
				System.out.println(i + "¹øÂ° : " + ss);
			
				for (int j=0; j < ss.length(); j++ ){
					System.out.println("ss.charAt("+j+") >>> : " + ss.charAt(j));
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sVal = "A BC#D EF#G HI#J KL#M NO";
		Ex_String_3 ex3 = new Ex_String_3();
		ex3.charSplit(sVal);
		ex3.charToken(sVal);

	}
}
