package  a.b.c.ch1;

public class 김바다{

	// 멤버 변수
	public String name;
	public String role;

	// 생성자
	public 김바다(String role){
		this.role = role;
	}
	// main 함수 : 콘솔 어플리케이션의 시작점
	public static void main(String args[]){

		김바다 신랑 = new 김바다("마님을 칭송하는 멘트");
		System.out.println("신랑 >>> : " + 신랑);
		System.out.println("신랑.role >>> : " + 신랑.role);
		
		김바다 학생 = new 김바다("자바 천천히 배우자");
		System.out.println("학생 >>> : " + 학생);
		System.out.println("학생.role >>> : " + 학생.role);
		
		김바다 친구 = new 김바다("잼나게 놀아야지");
		System.out.println("친구 >>> : " + 친구);
		System.out.println("친구.role >>> : " + 친구.role);
	
	} // end of main 함수 
} // end of Ex_5 클래스 