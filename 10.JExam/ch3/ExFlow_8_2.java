// package
package a.b.c.ch3;

// import


public class ExFlow_8_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 2�� for �� : 2���� �迭�� �����ϴ�.
		// int i=0 �� ���� �����̴�. 

		/*
			�ܺ� for�� ù ��° ���� ���� ���� �Ǹ� 
				���� for���� Ƚ�� ��ŭ ����ǰ�  
			�ٽ� �ܺ� for�� �� ��° ���� ���� ���� �Ǹ� 
				���� for���� Ƚ�� ��ŭ ����ǰ�  
			�ܺ� for�� Ƚ�� ��ŭ ���� �ȴ�.
		*/
		// �ܺ� for�� 
		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n�ܺ� for i >>> : " + i + "\n");
			// ���� for �� 
			for (int j=0; j < 3; j++ )
			{
				System.out.println("���� for j >>> : " + j);
			}
		}

		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n�ܺ� for i >>> : " + i);
			// ���� for �� 
			for (int j=0; j < 3; j++ )
			{
				System.out.print("���� for j >>> : " + j + " : " );
			}
			System.out.println();
		}

		for (int i=0; i < 3; i++ )
		{
			System.out.println("\n�ܺ� for i >>> : " + i);
			// ���� for �� 
			for (int j=0; j < 3; j++ )
			{
				System.out.print(j + "," );
			}
			System.out.println();
		}
	
	}
}
