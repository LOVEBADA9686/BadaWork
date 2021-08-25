package a.b.c.ch8;

public class Ex_Thread_4 extends Thread {

	int seqNum;

	public Ex_Thread_4(int seqNum){
		this.seqNum = seqNum;
	}

	@Override
	public void run(){
		System.out.println(this.seqNum + " Thread Start >>> : ");
		try{			
			Thread.sleep(3000);			
		}
		catch (Exception e){}

		System.out.println(this.seqNum + " Thread End >>> : ");
	}
	
	public static void main(String args[]){
	
		for (int i=0; i < 20; i++ ){
			
			Ex_Thread_4 tt2 = new Ex_Thread_4(i);
			
			//System.out.println("tt2 >>> : " + tt2);
			
			tt2.start();
		}

		System.out.println("main() ³¡ >>> : ");
	}
}