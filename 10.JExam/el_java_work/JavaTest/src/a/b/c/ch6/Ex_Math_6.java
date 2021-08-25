package a.b.c.ch6;

public class Ex_Math_6 {

	public static int max(int imax[]) {
		
		int max = imax[0];
		
		for (int i=0; i < imax.length; i++) {
			
//			max = imax[0];
			
			if (imax[i] > max) {
				
				max = imax[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int imax[] = {5, 3 , 6, 7, 9, 8};
		int max = Ex_Math_6.max(imax);
		System.out.println("max >>> : " + max);
	}
}
