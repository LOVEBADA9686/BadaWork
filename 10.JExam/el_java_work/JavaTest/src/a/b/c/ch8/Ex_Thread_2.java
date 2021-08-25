package a.b.c.ch8;

public class Ex_Thread_2 extends Thread{

	public static void a(){
		System.out.println("난 a() 함수 이다. ");
		try{
			// 2초 동안 자다가 2초가 되면 자동으로 깨세요 
			Thread.sleep(2000);;			
		}
		catch (InterruptedException i){
		}		
	}

	public void run(){
		System.out.println("run() >>> : start() 함수를 호출하면  run() 함수가 호출된다.");

		System.out.println("run() 함수 블럭에 내가 제어하고자 하는 일을 시킨다.");
		try{
			// 3초 동안 자다가 3초가 되면 자동으로 깨세요 
			Thread.sleep(3000);			
		}catch (InterruptedException i){
		}

		System.out.println("3초 자고 일어나세요"); // awake
		
		Ex_Thread_2.a();

		System.out.println("ThreadTest.a() 호출 하고 나서 >>> : ");
	}
	
	public static void main(String args[]){
	
		new Ex_Thread_2().start();
	}
}