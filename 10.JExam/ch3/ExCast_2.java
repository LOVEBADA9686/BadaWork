// package
package a.b.c.ch3;

// import


public class ExCast_2 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public int aM(byte x1, byte y2) {
		System.out.println("ExCast_2.aM() �Լ� ���� >>> : ");
		byte sum = (byte)(x1 + y2);
		System.out.println("ExCast_2.aM() �Լ� �� >>> : ");
		return sum;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExCast_2.main() �Լ� ���� >>> : ");
		
		byte x = 1;
		byte y = 2;

		ExCast_2 ec2 = new ExCast_2();
		int sum = ec2.aM(x, y);
		System.out.println("sum >>> : " + sum);
		System.out.println("ExCast_2.main() �Լ� �� >>> : ");
	}
}
