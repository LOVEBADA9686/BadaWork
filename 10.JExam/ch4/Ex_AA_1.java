// package
package a.b.c.ch4;

// import


public class Ex_AA_1 implements A_interface, B_interface, C_interface
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	@Override
	public void a(){
		System.out.println("a()");
		
	}

	@Override
	public void b(){
		System.out.println("b()");		
	}

	@Override
	public void c(){
		System.out.println("c()");				
	}
	
	@Override
	public void d(){
		System.out.println("d()");						
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// �ڽ�Ŭ���� �ڽ�Ŭ������������ = new �ڽ�Ŭ����() �ν��Ͻ�
		// �ڽ�Ŭ�������������� �θ� �������̽����� �������̵��� �Լ��� ������ �� �ִ�. 
		Ex_AA_1 ea1 = new Ex_AA_1();
		ea1.a();
		ea1.b();
		ea1.c();
		ea1.c();

		// �θ��������̽�Ŭ���� �θ��������̽�Ŭ������������ = new �ڽ�Ŭ����() �ν��Ͻ� 
		// �θ��������̽�Ŭ������������ ������ �ڱ��ڽ� �θ��������̽�Ŭ�������� ������ �Լ��� ��� ���� 
		A_interface ai = new Ex_AA_1();
		ai.a();
		// ai.b();
		/*		
			C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_AA_1.java
			Ex_AA_1.java:50: error: cannot find symbol
							ai.b();
							  ^
			  symbol:   method b()
			  location: variable ai of type A_interface
			1 error
		*/
		
		B_interface bi = new Ex_AA_1();
		bi.b();

		C_interface ci = new Ex_AA_1();
		ci.c();
		ci.d();

	}
}

/*
interface A_interface
{
	public void a();
}


interface B_interface
{
	public void b();
}


interface C_interface extends D_interface
{
	public void c();
}

interface D_interface
{
	public void d();
}

*/