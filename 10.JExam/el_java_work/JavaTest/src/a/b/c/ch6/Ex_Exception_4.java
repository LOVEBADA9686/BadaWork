package a.b.c.ch6;

public class Ex_Exception_4 {

	public void aM() throws Exception {
		System.out.println("aM() 함수 시작");
		System.out.println("aM()");
		
		bM();
		
		System.out.println("aM() 함수 끝");
	}

	public void bM() throws Exception {
		System.out.println("bM() 함수 시작");
		System.out.println("bM()");	
		
		// 에러 발생 : ArrayIndexOutOfBoundsException
		int[] iVal = new int[5];
		
		for (int i=0; i <= iVal.length; i++){
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
		}
		
		String msg = cM();
		System.out.println("bM() msg >>> : " + msg);

		System.out.println("bM() 함수 끝");
	}

	public String cM() throws Exception {
		System.out.println("cM() 함수 시작");
		System.out.println("cM()");
		
		String msg = dM();
		System.out.println("cM() msg >>> : " + msg);
		
		System.out.println("cM() 함수 끝");	
		
		return "cM() 함수에서 예외 테스트 중 ";
	}

	public String dM() throws Exception {
		System.out.println("dM() 함수 시작");
		System.out.println("dM()");
		
		int x = 1;
		int y = 0;
		// 에러 발생 : ArithmeticException a
		int z = x / y;
		
		System.out.println("z >>> : " + z);
		System.out.println("dM() 함수 끝");
		
		return "dM() 함수에서 예외 테스트 중";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 시작 >>> : ");
		
		try{
			Ex_Exception_4 ex4 = new Ex_Exception_4();
			System.out.println("ex4 참조변수 >>> : " + ex4);
			ex4.aM();			
		}catch (Exception e){
			System.out.println("e >>> : " + e);
		}
		
		System.out.println("main() 끝 >>> : ");
	}
}
