package a.b.c.ch6;

public class Ex_Exception_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() 시작 >>> : ");
		
		int argsL = args.length;
		
		if (2 == argsL) {
			String sX = args[0];
			System.out.println("입력한 데이터 sX = " + sX);
			String sY = args[1];
			System.out.println("입력한 데이터 sY = " + sY);
			
			try {
				
//				public static int parseInt(String s) throws NumberFormatException
				// 문자 숫자를 숫자로 형변환 
				int x = Integer.parseInt(sX);
				int y = Integer.parseInt(sY);
				int z = x / y;
				System.out.println(x + " / " + y + " = " + z);				
			}
//			catch(NumberFormatException n) {
//				System.out.println("에러가 n.getMessage() >>> : " + n.getMessage());
//			}
			catch(Exception e) {
				System.out.println("에러가 Exeption 클래스의 e 참조변수 >>> : " + e);
				System.out.println("에러가 e.getMessage() >>> : " + e.getMessage());
				e.printStackTrace();
			}
		}else {
			System.out.println("콘솔에 데이터를 입력 하시오 !! ");
		}
		
		System.out.println("main() 끝 >>> : ");
	}

}
