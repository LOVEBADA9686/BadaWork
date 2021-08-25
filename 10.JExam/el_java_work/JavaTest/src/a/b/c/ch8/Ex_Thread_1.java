package a.b.c.ch8;

public class Ex_Thread_1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable 인터페이스에서 오버라이딩된 run 함수");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex_Thread_1 ex1 = new Ex_Thread_1();
		
		Thread t = new Thread(ex1);
		System.out.println("t >>> : " + t);
		System.out.println("t.getId() >>> : " + t.getId());
		System.out.println("t.getName() >>> : " + t.getName());
		System.out.println("t.getPriority() >>> : " + t.getPriority());
		t.start();
		
		Thread t1 = new Thread(new Ex_Thread_1());
		System.out.println("\nt1 >>> : " + t1);
		System.out.println("t1.getId() >>> : " + t1.getId());
		System.out.println("t1.getName() >>> : " + t1.getName());
		System.out.println("t1.getPriority() >>> : " + t1.getPriority());
		t1.start();
	}
}
