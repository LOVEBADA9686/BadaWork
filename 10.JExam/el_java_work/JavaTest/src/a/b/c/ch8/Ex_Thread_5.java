package a.b.c.ch8;

public class Ex_Thread_5 extends Thread{

	// 6. int seqNum = 0;
	// 16. int seqNum = 1;	
	int seqNum;

	// 4. ������ ȣ�� Ex_Thread_5(0)
	// 14. ������ ȣ�� Ex_Thread_5(1)
	public Ex_Thread_5(int seqNum){
		
		// 5. ������� �ʱ�ȭ this.seqNum = 0;
		// 15. ������� �ʱ�ȭ this.seqNum = 1;
		this.seqNum = seqNum;
	}

	// 8. start() ȣ���� ��ũ�� run() �Լ� ���� 
	// 18. start() ȣ���� ��ũ�� run() �Լ� ���� 
	public void run(){
		
		// 9. synchronized(this) �Լ� ���� 
		// 19. synchronized(this) �Լ� ���� 
		synchronized(this){
			
			// 10. �ܼ� ���
			// 20. �ܼ� ���
			System.out.println(this.seqNum + " Thread Start >>> : ");
			
			try{		
				// 11.  sleep() �Լ� ���� 3�� ���
				// 21.  sleep() �Լ� ���� 3�� ���
				Thread.sleep(3000);			
			}
			catch (Exception e){}
			
			System.out.println(this.seqNum + " Thread End >>> : ");
		}
	}
	
	public static void main(String args[]){
		// 1. �����Լ� ���� 
		for (int i=0; i < 20; i++ ){
			
			// 2. for i=0
			// 3. new Ex_Thread_5(0) ������ ȣ��
			
			// 12. for i=1
			// 13. new Ex_Thread_5(1) ������ ȣ��
			Ex_Thread_5 tt3 = new Ex_Thread_5(i);
			
			//System.out.println("tt3 >>> : " + tt3);
			
			// 7. ������ �Լ� ����
			// 17. ������ �Լ� ����			
			tt3.start();
		}

		System.out.println("main() �� >>> : ");
	}
}