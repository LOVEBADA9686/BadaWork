package a.b.c.ch5;

public class PPT_3 {
	
	public int c(int x , int y) {
		int mul = x * y;
		System.out.println("Int c() �Լ��� ��");
		return mul;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// ����ƽ�� ���� (new�����ڸ� �����) void�� ���� �������� �ִ� �Լ��� ���
		// new�����ڸ� ����� -> Ŭ�����̸� ����������(��������� �����ϴ°�) = new Ŭ�����̸�();
		// -> ����int�� ����������(��������� �����ϴ°�) = Ŭ����������������.c�Լ�;
		// -> ����int�� �����ߴ� ������������ ����ϱ� -> System.out.println(f);
		PPT a = new PPT();
		int f = a.c(x, y);
		System.out.println(f);

	}

}
