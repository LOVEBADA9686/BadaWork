package a.b.c.ch8;

public class Ex_Thread extends Thread{

	@Override
	public void run() {
		System.out.println("run() 함수 ");
		System.out.println("Thread 클래스에 있는 start() 를 시작하면 ");
		System.out.println("바로 run() 함수를 호출한다.  ");
		System.out.println("Thread 클래스에 있는 start() 함수와  run() 함수는 링크가 걸려있다. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new Ex_Thread().start();
		
		Ex_Thread ex = new Ex_Thread();
		Thread t = new Thread(ex);
		System.out.println("t >>> : " + t);
		System.out.println("t.getId() >>> : " + t.getId());
		System.out.println("t.getName() >>> : " + t.getName());
		System.out.println("t.getPriority() >>> : " + t.getPriority());
		t.start();
	}
}
