// package
package a.b.c.ch5;

// import


public class Ex_Refer_1 
{
	// ��� 
	// �������
	// ������
	public Ex_Refer_1(){
		System.out.println("Ex_Refer_1() ������ >>> : ");
	}
	// �Լ� 
	public void rederMethod(TestVO tvo){
		System.out.println("Ex_Refer_1.rederMethod() �Լ� ���� >>> : ");
		System.out.println("rederMethod :: tvo >>> : " + tvo);	
		System.out.println("rederMethod :: tvo.getSval() >>> : " + tvo.getSval());
		System.out.println("rederMethod :: tvo.getIval() >>> : " + tvo.getIval());
	}

	public void primerMethod(int i, int i1){
		System.out.println("Ex_Refer_1.rederMethod() �Լ� ���� >>> : ");
		System.out.println("i >>> : " + i);
		System.out.println("i1 >>> : " + i1);
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// ��������, �����ڷ���
		int i = 11;
		int i1 = 22;
		
		Ex_Refer_1 ef1 = new Ex_Refer_1();
		System.out.println("ef1 >>> : " + ef1);
		ef1.primerMethod(i, i1);
		
		// ��������, �����ڷ���
		TestVO tvo = new TestVO();
		System.out.println("main :: tvo >>> : " + tvo);
		System.out.println("main :: tvo.getSval() >>> : " + tvo.getSval());
		System.out.println("main :: tvo.getIval() >>> : " + tvo.getIval());
		tvo.setSval("test");
		tvo.setIval("test00");
		ef1.rederMethod(tvo);
	}
}
