package a.b.c.ch1;

public class Ex_1 {

	// main �Լ� 
	// �ڹ� ��ö �ӽ� : Java Virtual Machine : JVM : java.exe
	// main() �Լ��� �ڹ� �ܼ� ���ø����̼��� ���� ���̴�. 
	// java a.b.c.ch1.Ex_1 �� ���� �ϸ�
	// 1. ���� �������� ���� ��ġ�� ���� Ex_1.class �д´�.
    // 2. Ex_1.class �� �޸𸮿� �ε� �Ѵ�.
    // 3. �ε��� a.b.c.ch1.Ex_1 Ŭ�������� ���� �Լ��� ȣ��Ǽ� 
	// 4. ���� �Լ� �� ù��° ���� ���� �����Ѵ�. 
    // 5. System.out.println() : println() �Լ��� �ִ� �ƱԸ�Ʈ�� �ֿܼ� ��� �Ͻÿ� 
	public static void main(java.lang.String[] args){

		// �ֿܼ� ��� �Ͻÿ� 
		// System : java.lang.System Ŭ���� �ڹ����α׷����� �����, ������Ƽ
		//			�� �ý��� ���� ������� �ϴ� Ŭ����
		// out : System Ŭ������ �ִ� out �ʵ�(����) : �ֿܼ� ����ϴ� ��� ��Ȱ�� �Ѵ�.
		// println() : �ֿܼ� println �Լ��� �ƱԸ�Ʈ�� ����Ʈ �ϴ� �Լ�
		//			 : ����Ʈ �ϰ� ���� �ϳ��� ���� �߸���.
		// public void println(String x)
		java.lang.System.out.println("�ڹ� ���� ù��° ���� Ex_1 !!");
	} // end of main �Լ� 
} // end of Ex_1 Ŭ���� 
	
/*
C:\00.KOSMO93\10.JExam\ch1>javac -d . Ex_1.java

C:\00.KOSMO93\10.JExam\ch1>java a.b.c.ch1.Ex_1
�ڹ� ���� ù��° ���� Ex_1 !!

C:\00.KOSMO93\10.JExam\ch1>
*/