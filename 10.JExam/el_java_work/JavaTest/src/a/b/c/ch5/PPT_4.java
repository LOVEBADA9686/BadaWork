package a.b.c.ch5;

public class PPT_4 {

	public void d(int x , int y){
		int div = x / y;
		System.out.println("void d()�Լ��� ��");
		System.out.println(div);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// ����ƽ�� ���� (new�����ڸ� �����) void�� �־� �������� ���� �Լ��� ���
		// new�����ڸ� ����� -> Ŭ�����̸� ����������(��������� �����ϴ°�) = new Ŭ�����̸�();
		// Ŭ����������������.d�Լ�;
		PPT a1 = new PPT();
		a1.d(x, y);	

	}

}
