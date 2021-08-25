// package
package a.b.c.ch3;

// import

// Loop
public class ExFlow_6_1 
{
	// 상수 
	// 멤버변수
	int num;
	// 생성자

	// 함수
	public static void numSum(){
		
		int num = 1;
		
		num += 2; // num = num + 2;
		num += 3;
		num += 4;
		num += 5;
		num += 6;
		num += 7;
		num += 8;
		num += 9;
		num += 10;

		System.out.println("1부터 10까지의 합은 " + num + "입니다.");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
	
		ExFlow_6_1.numSum();

		int num = 1;	
		int sum = 0;

		while (num <= 10)
		{
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		int num1 = 1;
		int sum1 = 0;
			
		do
		{
			sum1 += num1;
			num1++;
		}
		while (num1 <= 10);

		System.out.println("1부터 10까지의 합은 " + sum1 + "입니다.");
	}
}
