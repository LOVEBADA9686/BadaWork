package a.b.c.ch5;

	
public class Ex_Math_1 {

	// 더하기
	public int addM(int x, int y) {				
		return x + y;
	}
	// 빼기
	public int subM(int x, int y) {		
		return x - y;
	}
	// 곱하기 
	public int mulM(int x, int y) {		
		return x * y;
	}
	// 나누기
	public int divM(int x, int y) {		
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역변수, 기초자료형 
		char oper = '\u0000';
		int x = 0;
		int y = 0;
		
		if (3 == args.length) {
			
			oper = args[0].charAt(0);
			x = Integer.parseInt(args[1]);
			y = Integer.parseInt(args[2]);
			System.out.println("oper >>> : " + oper);
			System.out.println("x >>> : " + x);
			System.out.println("y >>> : " + y);
			
			if (0x2b == oper)
			{
				Ex_Math_1 exm = new Ex_Math_1();
				int addSum = exm.addM(x, y);
				System.out.println(x + " + " + y + " = "  + addSum);				
			}
			if (0x2D == oper)
			{
				Ex_Math_1 exm = new Ex_Math_1();
				int subSum = exm.subM(x, y);
				System.out.println(x + " - " + y + " = "  + subSum);				
			}
			if (0x2A == oper)
			{
				Ex_Math_1 exm = new Ex_Math_1();
				int mulSum = exm.mulM(x, y);
				System.out.println(x + " * " + y + " = "  + mulSum);				
			}
			if (0x2C == oper)
			{
				Ex_Math_1 exm = new Ex_Math_1();
				int divSum = exm.divM(x, y);
				System.out.println(x + " / " + y + " = "  + divSum);				
			}
		}else {
			System.out.println("사칙연산할 인수 연산자 + - * / 하나하고  정수로 2개 입력하시오 !!");
		}		
	}
}
