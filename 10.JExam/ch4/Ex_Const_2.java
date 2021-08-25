// package
package a.b.c.ch4;

// import

/*
콘솔에서 외부데이터 입력 받는 방법
java.util.Scanner sc = new java.util.Scanner(System.in);
명령행 인수 
main(String args[]){}
String args[] = {"aa", "bb", "cc", "dd"};
args[0] = "aa";
args[1] = "bb";
args[2] = "cc";
args[3] = "dd";
*/
public class  Ex_Const_2
{
	// 상수 
	// 멤버변수
	String name;
	String id;
	String pw;
	String juso;

	// 생성자
	// 생성자를 이용해서 외부에서 입력된 데이터를 멤버변수에 초기화 하는 방법 
	public Ex_Const_2(String name, String id, String pw, String juso){
		System.out.println("Ex_Const_2() 생성자 >>> : ");
		System.out.println("name >>> : " + name);
		System.out.println("id >>> : " + id);
		System.out.println("pw >>> : " + pw);
		System.out.println("juso >>> : " + juso);

		// 메인 함수에 있는 지역변수 데이터를
		// 생성자를 통해서 메인 함수 밖으로 가지고 나와서 
		// 멤버변수에 값을 대입을 한다. 
		// 멤버변수에 있는 데이터를 가지고 다른 클래스에서 사용한다. 
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.juso = juso;		
	}

	// 함수 
	public void printThis(){
		System.out.println("this >>> : " + this);
		System.out.println("this : 인스턴스 스스로를 가르키는 keyword(예약어) 이다.");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 지역변수, 참조변수 
		String name = "";
		String id = "";
		String pw = "";
		String juso = "";

		if (4 == args.length)
		{
			name = args[0];
			id = args[1];
			pw = args[2];
			juso = args[3];

			Ex_Const_2 ec2 = new Ex_Const_2(name, id, pw, juso);
			System.out.println("ec2 주소값 >>> : " + ec2);
			System.out.println("ec2 >>> : 인스턴스가 생성한 주소는 실제 주소가 아닌 JVM이 생성한 주소이다.");
			ec2.printThis();
			
			System.out.println("ec2.name >>> : " + ec2.name);
			System.out.println("ec2.id >>> : " + ec2.id);
			System.out.println("ec2.pw >>> : " + ec2.pw);
			System.out.println("ec2.juso >>> : " + ec2.juso);

		}else{
			System.out.println("데이터을 잘 입력하시오 !!!!");
		}
	}
}


/*
C:\00.KOSMO93\10.JExam\ch4>java a.b.c.ch4.Ex_Const_2 오재영 ojy ojy00 "의정부시 호원2동"
Ex_Const_2() 생성자 >>> :
name >>> : 오재영
id >>> : ojy
pw >>> : ojy00
juso >>> : 의정부시 호원2동
ec2 >>> : a.b.c.ch4.Ex_Const_2@15db9742
*/