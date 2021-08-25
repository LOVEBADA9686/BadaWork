// packager
package aaa.bbb.ccc;

// import


public class Ex_AA
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// �������̽� ����ϴ� ���
		// �θ��������̽�Ŭ���� ���� �θ��������̽�Ŭ���� �������� ���� = new �θ��������̽���������ڽ�Ŭ����();
		C c = new CImpl();
		// �θ��������̽�Ŭ���� �������� 
		c.c();
		c.c_1();
		int c_2 = c.c_2();
		System.out.println("c_2 >>> : " + c_2);
		boolean c_3 = c.c_3();
		System.out.println("c_3 >>> : " + c_3);

		int defalutM = c.defalutM();
		System.out.println("defalutM >>> : " + defalutM);

		boolean staticM = C.staticM();
		System.out.println("staticM >>> : " + staticM);
	}
}

// �������̽� Ŭ���� 
// �������̽� Ŭ���� = ��� + �߻��Լ� 
// ��� : public static final ������Ÿ�� XXX_XXXX = ���ͷ�; int i = 1;
// �߻��Լ� : ������ �Լ��̸�();
// �������̽� Ŭ������ �ִ� �߻��Լ��� �����ΰ� ����. 
// �ݵ�� �������̽� Ŭ������ ����ü(implementation)�� ���� ����ؾ� �Ѵ�. 
// �������̽� Ŭ���� ����ü Ŭ������ �������̽�Ŭ�����̸� + Impl ���� �Ѵ�. 
// �������̽� Ŭ���� = �������̽�Ŭ���� + �������̽�Ŭ����Impl
interface C
{
	// �������̽��� ����� �Լ��� ��� �߻��Լ� �̴�.

	// abstract Ű���尡 ���� �� ���� 
	public /*abstract*/ void c();
	public /*abstract*/ void c_1();
	public /*abstract*/ int c_2();
	public /*abstract*/ boolean c_3();

	// jdk 1.8 : SE 8 ���� interface�� defalut, static �Լ� ��밡��
	public default int defalutM(){
		System.out.println("\nC.defalutM() �Լ� ���� >>> ");

		System.out.println("interface �� defalut �Լ� >>> : ");
		System.out.println("���������� �Լ��� ȣ���� �� �ִ�..");
		System.out.println("implements �� Ŭ�������� ������ �� �� �ִ�.");

		System.out.println("C.defalutM() �Լ� �� >>> ");
		return 0;
	}

	public static boolean staticM(){
		System.out.println("\nC.staticM() �Լ� ���� >>> ");

		System.out.println("interface �� static �Լ� >>> : ");
		System.out.println("�ݵ�� Ŭ������.�Լ��̸�() ���� ȣ���ؾ� �Ѵ�.");
		System.out.println("������ �ϸ� �ʵȴ�.");
		boolean bool = false;

		System.out.println("C.staticM() �Լ� �� >>> ");
		return bool;
	}
}


/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_AA.java
Ex_AA.java:34: error: CImpl is not abstract and does not override abstract method c() in C
class CImpl implements C
^
1 error
*/
class CImpl implements C
{	
	@Override
	public void c(){
		System.out.println("\nCImpl.c() �Լ� ���� >>> ");
		System.out.println("c() >>> : ");
		System.out.println("CImpl.c() �Լ� �� >>> \n");
	}

	@Override
	public void c_1(){
		System.out.println("\nCImpl.c_1() �Լ� ���� >>> ");
		System.out.println("c_1() >>> : ");
		System.out.println("CImpl.c_1() �Լ� �� >>> \n");
	}

	@Override
	public int c_2(){
		System.out.println("\nCImpl.c_2() �Լ� ���� >>> ");
		System.out.println("c_2() >>> : ");
		System.out.println("CImpl.c_2() �Լ� �� >>> \n");
		return 0;
	}

	@Override
	public boolean c_3(){
		System.out.println("\nCImpl.c()_3 �Լ� ���� >>> ");
		System.out.println("c_3() >>> : ");
		System.out.println("CImpl.c()_3 �Լ� �� >>> \n");
		return false;
	}


}
