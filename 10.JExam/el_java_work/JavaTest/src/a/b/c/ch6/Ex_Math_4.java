package a.b.c.ch6;

public class Ex_Math_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n0 = "";
		String n1 = "";
		char c = 'A';
		String n2[]= {" �� �� ", " �� ��  "};		

		for (int n=0; n < 5; n++) {
			
			int lo[] = new int[6];		
			
			for (int i=0; i < lo.length; i++){
				
				lo[i] = (int)(Math.random()*45) + 1;
				
				//System.out.println(i + " : lo["+i+"]" + lo[i]);
				for (int j=0; j < i; j++ )
				{
					//System.out.println(i + " : iiii lo["+i+"] >>> : "  + lo[i]);
					if (lo[j] == lo[i])
					{
						//System.out.println(j + " : jjjj lo["+j+"] <<<>>> : "  + lo[j]);
						i--;
						break;
					}
				}
			}
							
			for (int i=0; i < lo.length; i++ ){				
				
				if (lo[0] == lo[i]) {			
					
					n1 = String.valueOf(lo[i]);					
					
					if (1 == n1.length()) {
						n1 = "0" + n1;
					}						
					
					n0 = c + n2[1] + n1;
					c += 1;
				}else {					
					
					n0 = String.valueOf(lo[i]);					
					
					if (1 == n0.length()) {
						n0 = "0" + n0;
					}	
				}
				
				n0 += " ";	
				
				System.out.print(n0);				
			}					
			System.out.println();
		}		
	}
}
