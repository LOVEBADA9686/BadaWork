package a.b.c.ch5;

public class PPT_2 {
	
	public static int b(int x , int y){
		int min = x - y;
		System.out.println("Static int b()�Լ��� ��");
		return min; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 30;
		// ����ƽ�� �ְ�, void�� ���� �������� �ִ� �Լ��� ���
		// -> Ŭ�����̸�.�Լ�(�Ű�����) ���� ����� -> �ּ�ó���ϱ�(��������)
		// -> ����int��  ��������(��������� �����ϴ°�) i �ϰ� Ŭ�����̸�.�Լ�(�Ű�����)
		// System.out.println(�� ������� ������ �������� i);
		// PPT.b(x, y);
		int i = PPT.b(x, y);
		System.out.println(i);

	}

}
