// package
package a.b.c.ch3;

// import


public class ExArray_2_2
{
	// ��� 
	// �������
	int i;
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������	
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		/*
			Enhanced For Loop �����
			���� :
			1) �迭�� ũ�⸦ ������ �ʿ䰡 ����.
			2) �ݺ��� ������ �ݺ��� ������ �����Ͽ� ������ �� �ִ�.

			���� :
			1) �迭������ ��밡���ϰ�, �迭�� ���� �������� ���ϴ� ������ �ֽ��ϴ�. 
		*/

		int i = 0;
		String strArray[] = {"Java", "Android", "C", "JavaScript", "Python"};
		System.out.println("String lang : strArray >>>>>>>>>>>>> : ");
		
		for (String lang : strArray )
		{
			/*
				lang = "Java";
				lang = "Android";
				lang = "C";
				lang = "JavaScript";
				lang = "Python";
			*/
			System.out.println("lang >>> : " + lang);
		}
		
		
		
		System.out.println("String a : args >>>>>>>>>>>>> : ");
		// ����� �μ� �о���� : ���� ���� 
		for (String a : args )
		{
			System.out.println("a >>> : " + a);
		}
		

		// ����� �μ� �о���� : �Ϲ� ����
		System.out.println("int i=0; i < args.length; i++ >>>>>>>>>>>>> : ");
		for (int i=0; i < args.length; i++ )
		{
			System.out.println("args["+i+"] >>> : " + args[i]);
		}


		/*
			C:\00.KOSMO93\10.JExam\ch3>java a.b.c.ch3.ExArray_2_2 11 22 33
			String lang : strArray >>>>>>>>>>>>> :
			lang >>> : Java
			lang >>> : Android
			lang >>> : C
			lang >>> : JavaScript
			lang >>> : Python
			String a : args >>>>>>>>>>>>> :
			a >>> : 11
			a >>> : 22
			a >>> : 33
			int i=0; i < args.length; i++ >>>>>>>>>>>>> :
			args[0] >>> : 11
			args[1] >>> : 22
			args[2] >>> : 33		
		*/
	}
}
