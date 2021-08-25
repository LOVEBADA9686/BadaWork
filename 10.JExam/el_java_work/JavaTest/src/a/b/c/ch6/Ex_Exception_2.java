package a.b.c.ch6;

public class Ex_Exception_2 {
		
	// iVal : aM()  함수의 매개변수 
	// int[] iVal = iArr
	public void aM(int[] iVal) {
		System.out.println("Ex_Exception_2.aM() >>> 시작");
		
		System.out.println("iVal >>> : " + iVal);		
		System.out.println("iVal.length >>> : " + iVal.length);
		
		for (int i=0; i <= iVal.length; i++ ){
			
			// iVal 배열에 초기화 하기 
			iVal[i] = i;
			
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
		}			
		
		System.out.println("Ex_Exception_2.aM() >>> 끝");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Exception_2.main() >>> 시작");
		
		// iArr : 지역변수, 참조변수 
		int[] iArr = new int[5];
		System.out.println("iArr >>> : " + iArr);
		
		Ex_Exception_2 ex2 = new Ex_Exception_2();
		// iArr : aM() 함수의 아규먼트 
		ex2.aM(iArr);			

		System.out.println("Ex_Exception_2.main() >>> 끝");
	}
}
