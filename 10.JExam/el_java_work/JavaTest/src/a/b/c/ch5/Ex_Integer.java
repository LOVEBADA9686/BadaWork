package a.b.c.ch5;

public class Ex_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int : 4����Ʈ, 32��Ʈ 
		// �ڹٴ� ���ڿ��� int �� �ȴ�. int �� �ƴ� ���� double : �������� ����ȯ �� �Ͼ��, int �Ѿ�� ���� ǥ�⸦ �ؾ� �Ѵ�. lL, fF, dD
		// byte char short int long float double : �����ڷ��� : ��ü�� �ƴϴ�. 
		// ���� �ڷ����� �����ϴ� Wrapper Class �� �ִ�. 
		// Wraper Class ����� �����Ѵ�. 
		
		// Integer Ŭ���� ���� ������ �ʱ�ȭ �� �� 
		// �ʱ�ȭ ������ Ÿ���� ���� �ڷ��� �� ��
		// �ʱ�ȭ ������ Ÿ���� ���ڼ��ڷ��� �� <=== �̰� �� ����Ѵ�. : ����ȯ ���ϰ� �ϱ� ���ؼ� 
		Integer i0 = new Integer(100);		
		Integer i1 = new Integer("100");
		System.out.println("i0 >>> : " + i0);
		System.out.println("i1 >>> : " + i1);
		System.out.println("System.identityHashCode(i0) >>> : " + System.identityHashCode(i0));		
		System.out.println("System.identityHashCode(i1) >>> : " + System.identityHashCode(i1));
		
		// Integer �� int ������ ��ȯ �� �� 
		int i0Val = i0.intValue();
		int i1Val = i1.intValue();
		System.out.println("i0Val >>> : " + i0Val);
		System.out.println("i1Val >>> : " + i1Val);		
		
		// ���ڼ��� Integer ���� int �� ���ڷ� ��ȯ �� ��  "12234" : ���ڷε� ���ڿ� "1", "12"
		// ���ڼ��� : ���� ��ȸ�� ���������̼����� ���� ���ڿ� 
		int i2 = Integer.parseInt("100"); // "100" -> 100 -> 100
		System.out.println("i2 >>> : " + i2);	
		
		int i3 = 100;
		System.out.println("i3 >>> : " + i3);	
		
		// int ���� Integer ������ ��ȯ�ϱ� 
		Integer i4 = Integer.valueOf(i3);
		System.out.println("i4 >>> : " + i4);
		
		// jdk 1.5 ���� �̷��� �Ѵ�. 
		// ����ڽ� : Autoboxing : �⺻���� ��ü�� �ٲٴ� �� 
		// ��ڽ� : Unboxing : ��ü���� �⺻������ ������ �� 
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; // ��ڽ�
//		int sum = num1.intValue() + num2;
		Integer num3 = num2; // ����ڽ�
//		Integer num3 = Integer.valueOf(num2);
	}

}
