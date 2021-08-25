package a.b.c.ch8;

public class Ex_Thread_5 extends Thread{

	// 6. int seqNum = 0;
	// 16. int seqNum = 1;	
	int seqNum;

	// 4. 생성자 호출 Ex_Thread_5(0)
	// 14. 생성자 호출 Ex_Thread_5(1)
	public Ex_Thread_5(int seqNum){
		
		// 5. 멤버변수 초기화 this.seqNum = 0;
		// 15. 멤버변수 초기화 this.seqNum = 1;
		this.seqNum = seqNum;
	}

	// 8. start() 호출한 링크로 run() 함수 시작 
	// 18. start() 호출한 링크로 run() 함수 시작 
	public void run(){
		
		// 9. synchronized(this) 함수 시작 
		// 19. synchronized(this) 함수 시작 
		synchronized(this){
			
			// 10. 콘솔 출력
			// 20. 콘솔 출력
			System.out.println(this.seqNum + " Thread Start >>> : ");
			
			try{		
				// 11.  sleep() 함수 시작 3초 대기
				// 21.  sleep() 함수 시작 3초 대기
				Thread.sleep(3000);			
			}
			catch (Exception e){}
			
			System.out.println(this.seqNum + " Thread End >>> : ");
		}
	}
	
	public static void main(String args[]){
		// 1. 메인함수 시작 
		for (int i=0; i < 20; i++ ){
			
			// 2. for i=0
			// 3. new Ex_Thread_5(0) 생성자 호출
			
			// 12. for i=1
			// 13. new Ex_Thread_5(1) 생성자 호출
			Ex_Thread_5 tt3 = new Ex_Thread_5(i);
			
			//System.out.println("tt3 >>> : " + tt3);
			
			// 7. 스레드 함수 시작
			// 17. 스레드 함수 시작			
			tt3.start();
		}

		System.out.println("main() 끝 >>> : ");
	}
}