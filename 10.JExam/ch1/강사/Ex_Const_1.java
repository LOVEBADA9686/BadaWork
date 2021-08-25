package a.b.c.ch1;

public class Ex_Const_1 {

	// 멤버 변수 
	String name;
	int age;

	// 생성자	: 매개변수 없는 생성자 
	public Ex_Const_1(){
		System.out.println("Ex_Const_1() 생성자 >>> : ");
	}
	// 생성자 : 매개변수 String name 한개 있는 생성자 
	public Ex_Const_1(String name){
		System.out.println("Ex_Const_1(String name) 생성자 >>> : ");
		System.out.println("String name >>> : " + name);
	}
	// 생성자 : 매개변수 int age 한개 있는 생성자 
	public Ex_Const_1(int age){
		System.out.println("Ex_Const_1(int age) 생성자 >>> : ");
		System.out.println("int age >>> : " + age);
	}
	// 생성자 : 매개변수 첫번째 String name, 두번째 int age 두개 있는 생성자 
	public Ex_Const_1(String name, int age){
		System.out.println("Ex_Const_1(String name, int agee) 생성자 >>> : ");
		System.out.print("String name >>> : " + name);
		System.out.println(", int age >>> : " + age);
	}

	// 생성자 : 매개변수 첫번째 int age, 두번째 String name 두개 있는 생성자 
	public Ex_Const_1(int age, String name){
		System.out.println("Ex_Const_1(int age, String name) 생성자 >>> : ");
		System.out.print("int age >>> : " + age);
		System.out.println(", String name >>> : " + name);
	}

	public static void main(String[] args){
		
		// 아규먼트가 없는 생성자 Ex_Const_1() 호출 
		Ex_Const_1 ex_c_1 = new Ex_Const_1();
		System.out.println("ex_c_1 주소값 >>> : " + ex_c_1);

		// 아규먼트가 한개 인데 데이터 타입이 String 문자열 Ex_Const_1("현병은")  호출
		Ex_Const_1 ex_c_2 = new Ex_Const_1("현병은");
		System.out.println("ex_c_2 주소값 >>> : " + ex_c_2);

		// 아규먼트가 한개 인데 데이터 타입이 int 정수인 Ex_Const_1(59) 호출
		Ex_Const_1 ex_c_3 = new Ex_Const_1(59);
		System.out.println("ex_c_3 주소값 >>> : " + ex_c_3);

		// 아규먼트가 두개 인데 첫번째 데이터 타입이 String, 두번째 데이터 타입이 int Ex_Const_1("현병은", 59)  호출 
		Ex_Const_1 ex_c_4 = new Ex_Const_1("현병은", 59);
		System.out.println("ex_c_4 주소값 >>> : " + ex_c_4);

		// 아규먼트가 두개 인데 첫번째 데이터 타입이 int, 두번째 데이터 타입이 String Ex_Const_1(59, "현병은")  호출 
		Ex_Const_1 ex_c_5 = new Ex_Const_1(59, "현병은");
		System.out.println("ex_c_5 주소값 >>> : " + ex_c_5);

	} // end of main 함수 

} // end of Ex_Const_1 클래스 

