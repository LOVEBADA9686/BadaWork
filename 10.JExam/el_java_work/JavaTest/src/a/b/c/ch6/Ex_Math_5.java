package a.b.c.ch6;

public class Ex_Math_5 {

	public static int max(int a, int b, int c) {
		
		int max = a;
		
		if (b >= max) {
			max = b;
		}
		if (c >= max) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = Ex_Math_5.max(11, 2, 3);
		System.out.println("max >>> : " + max);
	}
}
