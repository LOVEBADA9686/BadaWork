package a.b.c.ch8;

public class Ex_Thread_7 {

	public static void main(String args[]) {

		Runnable r = new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}

class BankAccount_1 {

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
class SyncTest_1 implements Runnable {
	BankAccount_1 ac1 = new BankAccount_1();
	
	public void run() {
		System.out.println("run() 함수 시작 >>> : ");
	
		synchronized(this){
			System.out.println("synchronized(this) 블럭 시작 >>> : ");
		
			while(ac1.balance > 0) {
				System.out.println("while(ac1.balance > 0) 블럭 시작 >>> : ");
			
				// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
				int money = (int)(Math.random() * 3 + 1) * 100;
				ac1.withdraw(money);
				
				System.out.println("balance >>> : " + ac1.balance
					               + " : 출금시간 >>> : " 
					               + CurrentTime_1.cTime());
			}
		}
	} 
}

// a.b.c.common.DataUtil.cTime() 으로 이동하기 
abstract class CurrentTime_1 
{
	public static String cTime(){
		
		long time = System.currentTimeMillis();		
		java.text.SimpleDateFormat sdf = 
			new java.text.SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String cTime = sdf.format(new java.util.Date(time));

		return cTime;
	}
}




