package a.b.c.ch8;

import a.b.c.common.DateUtil;

public class Ex_Thread_7_SyncTest implements Runnable {
	
	Ex_Thread_7_BankAccount ac1 = new Ex_Thread_7_BankAccount();
	
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
					               + DateUtil.cTime());
			}
		}
	} 
}
