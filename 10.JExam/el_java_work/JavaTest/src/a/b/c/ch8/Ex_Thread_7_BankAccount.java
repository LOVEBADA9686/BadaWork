package a.b.c.ch8;

public class Ex_Thread_7_BankAccount {

	int balance = 1000;
	// int balance = 1000000;
	
	/*
		synchronized 키워드 :  동기화는 객체에 대한 동기화로 이루어 짐
		                                                                                  같은 객체에 대한 모든 동기화 블럭은 한 시점에 
							 오직 한 쓰레드만이 블럭 안으로 접근(실행) 하도록 한다. 
							 블럭에 접근을 시도하는 다른 쓰레드들은 
							 블럭 안의 쓰레드가 실행을 마치고 블럭을 벗어날 때까지
							 블록(blocked) 상태가 된다. 

		사용방법
		1. synchronized void 함수()
		2. static synchronized void 함수() 
		3. synchronized(this){}
		4. static synchronized(this){}
	*/
	public synchronized void withdraw(int money){
		System.out.println("synchronized void withdraw(int money) 함수 시작 >>> : ");
		if(balance >= money) {
			try { Thread.sleep(1000);} catch(Exception e) {}
			balance -= money;
		}
	} // withdraw
}
