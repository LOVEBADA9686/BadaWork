package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{

	public static void a(){
		System.out.println("�� a() �Լ� �̴�. ");
		try{
			// 2�� ���� �ڴٰ� 2�ʰ� �Ǹ� �ڵ����� ������ 
			Thread.sleep(2000);;			
		}
		catch (InterruptedException i){
		}		
	}

	public void run(){
		System.out.println("run() >>> : start() �Լ��� ȣ���ϸ�  run() �Լ��� ȣ��ȴ�.");

		System.out.println("run() �Լ� ���� ���� �����ϰ��� �ϴ� ���� ��Ų��.");
		try{
			// 3�� ���� �ڴٰ� 3�ʰ� �Ǹ� �ڵ����� ������ 
			Thread.sleep(3000);			
		}catch (InterruptedException i){
		}

		System.out.println("3�� �ڰ� �Ͼ����"); // awake
		
		Ex_Thread_2.a();

		System.out.println("ThreadTest.a() ȣ�� �ϰ� ���� >>> : ");
	}
	
	public static void main(String args[]){
	
		new Ex_Thread_2().start();
	}
}