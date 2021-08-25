// package
package aaa.bbb;

// import
import java.util.Date;
import java.util.Calendar;

/*
�������̵� : Overrideing
1. ��� ���迡�� �Ͼ�� ���̴�. : extends, implements 
2. �θ�Ŭ������ �ִ� �ڿ� �� �Լ��� �ڽ�Ŭ������ �Լ��� �������� ����
3. �������̵� �� �Լ� ������  @Override ��� �������̵� ������̼��� ����ؾ� �Ѵ�. 
*/

public class Ex_A extends B
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:7: error: Ex_A is not abstract and does not override abstract method b() in B
public class Ex_A extends B
       ^
1 error
*/
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// jdk 1.5 �߰��� @ ������̼� ��� 
	// 1. �Լ��� ���� ����
	// 2. ������ �������̽� ��Ȱ : ������ ����� �ϴ� ��
	// @Override : �θ�Ŭ�������� b() �Լ��� �ڽ�Ŭ������ �������̵� �ߴ� 
	@Override
	public void b(){
		System.out.println("B �߻�Ŭ�������ִ� b() �߻��Լ��� Ex_A �ڽ�Ŭ������ �������̵� �ߴ�. ");
		System.out.println("�߻��Լ��� �ڽ�Ŭ������ �������̵��� ���� abstract Ű���带 �����Ѵ�.");
	}

	@Override
	public void b_1(){
		System.out.println("B �߻�Ŭ�������ִ� b_1() �߻��Լ��� Ex_A �ڽ�Ŭ������ �������̵� �ߴ�. ");
		System.out.println("�߻��Լ��� �ڽ�Ŭ������ �������̵��� ���� abstract Ű���带 �����Ѵ�.");
	}

	@Override
	public void b_2(){
		System.out.println("B �߻�Ŭ�������ִ� b_2() �߻��Լ��� Ex_A �ڽ�Ŭ������ �������̵� �ߴ�. ");
		System.out.println("�߻��Լ��� �ڽ�Ŭ������ �������̵��� ���� abstract Ű���带 �����Ѵ�.");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// B �߻� Ŭ���� ����ϱ� 
		// 1. �߻� Ŭ������ �ڱ� �ڽ� Ŭ������ �ν��Ͻ� �� ���� ����.
		// 2. �߻� Ŭ������ ����ϴ� ����� ������ �ִ�.
		// 3. ����ϴ� ����� �ִ�. 
		// 4. �߻� Ŭ������ Ŭ���� �̱� ������ extends Ű���带 ����ؼ� ����Ѵ�. 
		// 5. �߻� Ŭ������ ����ϸ� �ڽ� Ŭ������ �߻��Լ��� �� ���������̵� �ؾ� �Ѵ�. 
		// B b = new B();
		
		// �ڽ�Ŭ�������� �ڽ�Ŭ���� ������������ = new �ڽ�Ŭ����() �ν��Ͻ� 
		Ex_A ea = new Ex_A();
		ea.b();

		// ��ư����� �����ϸ� �θ�Ŭ���� ���������� ������� 
		// �θ�Ŭ�������� �θ�Ŭ���� ������������ = new �ڽ�Ŭ����() �ν��Ͻ� 
		B b1 = new Ex_A();
		b1.b();

		// Ŭ�����̸�.�Ϲ��Լ��̸�();
		B.staticB();

		// �߻�Ŭ���������� getInstance() �Լ��� ��ü�� �޸𸮿� �ø���.
		// new Ű���� vs getInstance() �Լ�
		// new Ű���� : new �ν��Ͻ��� �� ���� �ּҰ��� ����ȴ�.
		// getInstance() : ���ʿ� �޸𸮿� �ø� �ּҰ� �ϳ��� ����Ѵ�. 		
		Date d = B.getInstance();
		System.out.println("d >>> : " + d);
		System.out.println("d >>> : " + System.identityHashCode(d));

		Date da = new Date();
		System.out.println("da >>> : " + da);
		System.out.println("da >>> : " + System.identityHashCode(da));

		// ��Ʈ�� Calendar Ŭ���� �� getInstance() �Լ��� ����� ���� 
		Calendar rightNow = Calendar.getInstance();
		System.out.println("rightNow >>> : \n" + rightNow);
	}
}

// �߻� Ŭ����
// �߻� �Լ��� ������� Ŭ������ �߻� Ŭ�����̾�� �Ѵ�. abstract Ű���带 ����ؾ� �Ѵ�. 
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:23: error: B is not abstract and does not override abstract method b() in B
class B
^
1 error
*/
// class B
abstract class B
{
	/*
	public B(){
		System.out.println("B() ������");
	}
	*/
	// �߻� �Լ� : �Լ��� {} ���� : �Լ��� ���� �� ���� ����. 
	// �߻� �Լ��� ����Ϸ��� Ŭ���� ����� �ؼ� 
	// �ڽ� Ŭ�������� �߻� �Լ��� �������̵� �ؼ� 
	// {} �߰��� �� ����ü�� ���´�. 
	public abstract void b();
	// public abstract void b(){}
	/*
	C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
	Ex_A.java:29: error: abstract methods cannot have a body
        public abstract void b(){}
                             ^
	1 error
	*/

	public abstract void b_1();
	public abstract void b_2();
	// �߻�Ŭ���������� �Ϲ� �Լ��� ����Ѵ�. 
	public void bM(){
		System.out.println("���� �߻�Ŭ���� B�� �ִ� �Ϲ��Լ� bM() �̴�. ");
	}

	public static void staticB(){
		System.out.println("���� �߻�Ŭ���� B�� �ִ� static �Ϲ��Լ� staticB() �̴�. ");
		System.out.println("static �Ϲ��Լ� staticB() �� ȣ���ؼ� �����ϸ� �ʵȴ�.  ");
	}


	public static Date getInstance(){
		return new Date();
	}
}

// �������̽� Ŭ���� 
interface C
{
	public void c();
}