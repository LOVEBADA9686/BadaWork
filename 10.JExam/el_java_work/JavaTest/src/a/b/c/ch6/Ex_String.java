package a.b.c.ch6;

public class Ex_String {
	
	String orginFileName = "Hello.java";

	public void strIndexOf(){
		System.out.println("strIndexOf() >>> : #####################");
		
		String fullName = "Hello.java";
		int index = fullName.indexOf('.'); // 싱글쿼테이션 : 문자 
		int index1 = fullName.indexOf("."); // 더블쿼테이션 : 문자열 
		
		System.out.println("index >>> : " + index);
		System.out.println("index1 >>> : " + index1);
		
		String fileName = fullName.substring(0, index);
		System.out.println("fileName >>> : " + fileName);
		
		String extenstions = fullName.substring(index+1);
		System.out.println("extenstions >>> : " + extenstions);

		if (orginFileName.equals(fullName))
		{
			// Hello(1).java
			System.out.println("orginFileName.equals(fullName) >>> : #####################");
			
			System.out.println("fullName >>> : " + fullName);
			int index2 = fullName.indexOf('.');
			String fileName2 = fileName.substring(0, index2);
			System.out.println("fileName2 >>> : " + fileName2);
			
			String extenstions2 = fullName.substring(index2+1);
			System.out.println("extenstions2 >>> : " + extenstions2);
			
			String fullName2 = fileName2 + "(1)" + "." + extenstions2;
			System.out.println("fullName2 >>> : " + fullName2);
			System.out.println("orginFileName.equals(fullName) >>> : #####################");
		}
	}
	
	public void strLastIndexOf(){
		System.out.println("strLastIndexOf() >>> : #####################");
		
		String fullName = "Hello00000.doc";
		
		int lastIndex = fullName.lastIndexOf('.');
		System.out.println("lastIndex >>> : " + lastIndex);
		
		String extenstions = fullName.substring(lastIndex+1);
		System.out.println("extenstions >>> : " + extenstions);

		if ("doc".equals(extenstions))
		{
			System.out.println("extenstions >>> : " + extenstions);
			System.out.println("ms doc MIME TYPE : application/msword");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public String substring(int beginIndex)
//		public String substring(int beginIndex, int endIndex)
/*		
		 "unhappy".substring(2) returns "happy"
		 "Harbison".substring(3) returns "bison"
		 "emptiness".substring(9) returns "" (an empty string)
		 "hamburger".substring(4, 8) returns "urge"
		 "smiles".substring(1, 5) returns "mile"
*/		 
/*
		index = length() - 1									
		length() = index + 1									
				0	1	2	3	4	5	6									
				u	n 	h	a   p 	p 	y												
		u = s0.charAt(0)									
		n = s0.charAt(1)									
		h = s0.charAt(2)									
		a = s0.charAt(3)									
		p = s0.charAt(4)									
		p = s0.charAt(5)									
		y = s0.charAt(6)									
*/
		String s0 = "unhappy";
		System.out.println("s0.length() >>> : " + s0.length());
		System.out.println("s0.charAt(2) >>> : " + s0.charAt(2));
		String s01 = s0.substring(2);
		System.out.println("s0.charAt(2) :: s0.substring(2) >>> : " + s01);
		
		String s1 = "Harbison";
		System.out.println("s1.length() >>> : " + s1.length());
		System.out.println("s1.charAt(3) >>> : " + s1.charAt(3));
		String s11 = s1.substring(3);
		System.out.println("s1.charAt(3) :: s0.substring(3) >>> : " + s11);

		String s2 = "emptiness";
		System.out.println("s2.length() >>> : " + s2.length());
		// System.out.println("s2.charAt(9) >>> : " + s2.charAt(9));
		// String s21 = s1.substring(9);
		// System.out.println("s1.charAt(9) :: s0.substring(9) >>> : " + s21);
		
		String s3 = "hamburger";
		System.out.println("s3.length() >>> : " + s3.length());
		System.out.println("s3.charAt(4) >>> : " + s3.charAt(4));
		System.out.println("s3.charAt(8) >>> : " + s3.charAt(8));
		String s31 = s3.substring(4, 8);
		System.out.println("s1.substring(4, 8) >>> : " + s31);
		
		
		String s4 = "smiles";	
		System.out.println("s4.length() >>> : " + s4.length());
		System.out.println("s4.charAt(1) >>> : " + s4.charAt(1));
		System.out.println("s4.charAt(5) >>> : " + s4.charAt(5));
		String s41 = s4.substring(1, 5);
		System.out.println("s4.substring(1, 5) >>> : " + s41);
		
		
		Ex_String exs = new Ex_String();
		exs.strIndexOf();
		exs.strLastIndexOf();
	
	}
}
