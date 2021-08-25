package a.b.c.ch8;

import a.b.c.common.DateUtil;

public class Ex_Thread_7_SyncTest implements Runnable {
	
	Ex_Thread_7_BankAccount ac1 = new Ex_Thread_7_BankAccount();
	
	public void run() {
		System.out.println("run() �Լ� ���� >>> : ");
	
		synchronized(this){
			System.out.println("synchronized(this) �� ���� >>> : ");
		
			while(ac1.balance > 0) {
				System.out.println("while(ac1.balance > 0) �� ���� >>> : ");
			
				// 100, 200, 300���� �� ���� ������ �����ؼ� ���(withdraw)
				int money = (int)(Math.random() * 3 + 1) * 100;
				ac1.withdraw(money);
				
				System.out.println("balance >>> : " + ac1.balance
					               + " : ��ݽð� >>> : " 
					               + DateUtil.cTime());
			}
		}
	} 
}
