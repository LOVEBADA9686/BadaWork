package a.b.c.ch1;

public class 현병은 {

	// 멤버 변수 
	public String name;
	public String role;

	// 생성자 
	public 현병은(String role){
		this.role = role;
	}
	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){

		현병은 신랑 = new 현병은("마님을 칭송하는 멘트");
		System.out.println("신랑 >>> : " + 신랑);
		System.out.println("신랑.role >>> : " + 신랑.role);
		현병은 강사 = new 현병은("자바 천천히 가르키자");
		System.out.println("강사 >>> : " + 강사);
		System.out.println("강사.role >>> : " + 강사.role);
		현병은 친구 = new 현병은("잼나게 놀아야지");
		System.out.println("친구 >>> : " + 친구);
		System.out.println("친구.role >>> : " + 친구.role);
	
	} // end of main 함수 
} // end of Ex_5 클래스 