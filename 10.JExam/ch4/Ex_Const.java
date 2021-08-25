// package
package a.b.c.ch4;

// import

// ConstTest_1 : �θ� Ŭ���� 
// Ex_Const : �ڽ� Ŭ���� 
public class Ex_Const extends ConstTest_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	public Ex_Const(){
		/*
			C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_Const.java
			Ex_Const.java:17: error: call to this must be first statement in constructor
                this("������", 27);
                    ^
			1 error
		*/
		/*
			1. this() :  �� �Լ���� �θ���. �ڹٿ��� ����� ���ǵ� �Լ��̴�.
			2. �ڱ��ڽ� Ŭ�������� �����ε�� �����ڸ� �Ű������� ���� �����ڸ� ȣ���ϴ� �Լ��̴�.
			3. this() �Լ��� ������ ������ �� ��ܿ� ��ġ�ؾ� �Ѵ�.  JVM ��Ģ�̴�.	
		*/
		this("������", 27);
		System.out.println("Ex_Const() ������ >>> : ");
	}

	public Ex_Const(String name){
		this(name, 23);
		System.out.println("Ex_Const(String name) ������ >>> : ");
		System.out.println("name >>> : " + name);
	}

	public Ex_Const(int age){
		super("�����");
		System.out.println("Ex_Const(int age) ������ >>> : ");
		System.out.println("age >>> : " + age);
	}

	public Ex_Const(String name, int age){
		/*
			1. super() :  ���� �Լ���� �θ���. �ڹٿ��� ����� ���ǵ� �Լ��̴�.
			2. �ڱ��ڽ� Ŭ�������� ������� �θ� Ŭ������ �����ڸ� ȣ���Ѵ�.
			3. super() �Լ��� ������ ������ �� ��ܿ� ��ġ�ؾ� �Ѵ�.  JVM ��Ģ�̴�.	
		*/
		super();
		System.out.println("Ex_Const(String name, int age) ������ >>> : ");
		System.out.println("name, age >>> : " + name +", "+ age);
	}



	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		Ex_Const ec = new Ex_Const();
		// java.lang.Objec.toString();
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// ec >>> : a.b.c.ch4.Ex_Const@15db9742
		System.out.println("Ex_Const() ������ ec �ּҰ� JVM  >>> : " + ec); // toString() ������ �� 
		System.out.println("Ex_Const() ������ ec �ּҰ� JVM  >>> : " + ec.toString());
		System.out.println("ec.getClass() >>> : " + ec.getClass());
		System.out.println("ec.getClass().getName() >>> : " + ec.getClass().getName());
		System.out.println("ec.hashCode() >>> : " + Integer.toHexString(ec.hashCode()));
		// System.identityHashCode(Object x)
		System.out.println("��� >>> : " + System.identityHashCode(ec));

		// ������ �����ε� ȣ�� �ϱ� 
		Ex_Const ec_1 = new Ex_Const("�����");
		System.out.println("ec_1 �ּҰ� >>> : " + ec_1); // toString() ������ �� 

		Ex_Const ec_2 = new Ex_Const(29);
		System.out.println("ec_2 �ּҰ� >>> : " + ec_2); // toString() ������ �� 

		Ex_Const ec_3 = new Ex_Const("�����", 29);
		System.out.println("ec_3 �ּҰ� >>> : " + ec_3); // toString() ������ �� 
		

	}
}

/*
class ConstTest_1 extends java.lang.Object
{
	public ConstTest_1(){
		System.out.println("ConstTest_1() ������ >>> : ");
	}

	public ConstTest_1(String name){
		System.out.println("ConstTest_1(String name) ������ >>> : ");
		System.out.println("ConstTest_1() ������ name >>> : " + name);
	}
}
*/