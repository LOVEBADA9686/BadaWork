package  a.b.c.ch1;

public class ��ٴ�{

	// ��� ����
	public String name;
	public String role;

	// ������
	public ��ٴ�(String role){
		this.role = role;
	}
	// main �Լ� : �ܼ� ���ø����̼��� ������
	public static void main(String args[]){

		��ٴ� �Ŷ� = new ��ٴ�("������ Ī���ϴ� ��Ʈ");
		System.out.println("�Ŷ� >>> : " + �Ŷ�);
		System.out.println("�Ŷ�.role >>> : " + �Ŷ�.role);
		
		��ٴ� �л� = new ��ٴ�("�ڹ� õõ�� �����");
		System.out.println("�л� >>> : " + �л�);
		System.out.println("�л�.role >>> : " + �л�.role);
		
		��ٴ� ģ�� = new ��ٴ�("�볪�� ��ƾ���");
		System.out.println("ģ�� >>> : " + ģ��);
		System.out.println("ģ��.role >>> : " + ģ��.role);
	
	} // end of main �Լ� 
} // end of Ex_5 Ŭ���� 