// package
package a.b.c.ch3;

// import


public class ExCast_2 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	public int aM(byte x1, byte y2) {
		System.out.println("ExCast_2.aM() 함수 시작 >>> : ");
		byte sum = (byte)(x1 + y2);
		System.out.println("ExCast_2.aM() 함수 끝 >>> : ");
		return sum;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExCast_2.main() 함수 시작 >>> : ");
		
		byte x = 1;
		byte y = 2;

		ExCast_2 ec2 = new ExCast_2();
		int sum = ec2.aM(x, y);
		System.out.println("sum >>> : " + sum);
		System.out.println("ExCast_2.main() 함수 끝 >>> : ");
	}
}
