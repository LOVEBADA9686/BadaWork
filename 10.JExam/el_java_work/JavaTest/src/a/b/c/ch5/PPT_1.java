package a.b.c.ch5;

public class PPT_1 {
	
	public static void a(int x ,int y){
		int sum = x + y;
		System.out.println("Static  void a()�Լ��� ��");
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1�� ����
		//��������
		int x = 10;
		int y = 30;
		// ����ƽ�� �ְ�, void�� �־� �������� ���� �Լ��� ���
		// -> Ŭ�����̸�.�Լ�(�Ű�����)
		PPT.a(x, y);

		}
	}
