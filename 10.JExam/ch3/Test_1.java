// package
package a.b.c.ch3;

// import


public class Test_1
{
	// ���
	// �������
	// ������
	
	//�Լ�
	public int a(){
		System.out.println("Test_1.a() �Լ� ���� >>> : ");
		System.out.println("Test_!.a() �Լ� �� >>> : ");

		return 1+2;
	}	
		public void b(){
		System.out.println("Test_1.b() �Լ� ���� >>> : ");
		System.out.println("Test_!.b() �Լ� �� >>> : ");	
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Test_1 t1 = new Test_1();
		System.out.println("t1 �ּҰ� >>> : " + t1);
		t1.a();
		System.out.println("ti.a() >>> : " + t1.a());

		int i = t1.a();
		System.out.println("i >>> : " + i);

		t1.b();
		// System.out.println("t1.b() >>> : " + t1.b());
	}
}
