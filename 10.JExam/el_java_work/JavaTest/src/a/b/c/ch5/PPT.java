package a.b.c.ch5;

public class PPT {

	// 1�� ����
	public static void a(int x ,int y){
		int sum = x + y;
		System.out.println("Static  void a()�Լ��� ��");
		System.out.println(sum);
	}
	// 2�� ����
	public static int b(int x , int y){
		int min = x - y;
		System.out.println("Static int b()�Լ��� ��");
		return min; 
	}
	// 3�� ����
	public int c(int x , int y) {
		int mul = x * y;
		System.out.println("Int c() �Լ��� ��");
		return mul;
	}
	// 4�� ����
	public void d(int x , int y){
		int div = x / y;
		System.out.println("void d()�Լ��� ��");
		System.out.println(div);
	}

	public static void main(String[] args)	{
		// TODO Auto-generated method stub.
		
		//��������
		int x = 10;
		int y = 30;
		
		//1�� ����
		// ����ƽ�� �ְ�, void�� �־� �������� ���� �Լ��� ���
		// -> Ŭ�����̸�.�Լ�(�Ű�����)
		PPT.a(x, y);

		//2�� ����
		// ����ƽ�� �ְ�, void�� ���� �������� �ִ� �Լ��� ���
		// -> Ŭ�����̸�.�Լ�(�Ű�����) ���� ����� -> �ּ�ó���ϱ�(��������)
		// -> ����int��  ��������(��������� �����ϴ°�) i �ϰ� Ŭ�����̸�.�Լ�(�Ű�����)
		// System.out.println(�� ������� ������ �������� i);
		// PPT.b(x, y);
		int i = PPT.b(x, y);
		System.out.println(i);
		
		//3�� ����
		// ����ƽ�� ���� (new�����ڸ� �����) void�� ���� �������� �ִ� �Լ��� ���
		// new�����ڸ� ����� -> Ŭ�����̸� ����������(��������� �����ϴ°�) = new Ŭ�����̸�();
		// -> ����int�� ����������(��������� �����ϴ°�) = Ŭ����������������.c�Լ�;
		// -> ����int�� �����ߴ� ������������ ����ϱ� -> System.out.println(f);
		PPT a = new PPT();
		int f = a.c(x, y);
		System.out.println(f);
		
		//4�� ����
		// ����ƽ�� ���� (new�����ڸ� �����) void�� �־� �������� ���� �Լ��� ���
		// new�����ڸ� ����� -> Ŭ�����̸� ����������(��������� �����ϴ°�) = new Ŭ�����̸�();
		// Ŭ����������������.d�Լ�;
		PPT a1 = new PPT();
		a1.d(x, y);	
	}
}