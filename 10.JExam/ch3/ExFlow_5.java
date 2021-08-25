// package
package a.b.c.ch3;

// import


public class ExFlow_5 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 지역변수, 기초자료형변수 
		int ranking = 1;
		// 지역변수, 기초자료형변수
		char medalColor = '\u0000'; // 유니코드로 초기화 

		// switch 키워드 : 케이스를 분기하는 분기문 : if 문과 동일한 기능을 한다. 
		// () : 조건식 : jdk 1.7 이전에는 숫자만 사용 가능 했다.
		//               jdk 1.7 부터는 숫자 및 문자열도 사용 가능하다.
		// case : 조건식에 있는 값이 case 키워드에 있는 값과 동일하면 그 표현식이 수행 된다. 
		//  if (ranking == 1) case 1 수행 된다. 
		//  else if (ranking == 2) case 2 수행 된다. 
		// break 키워드는 그 구문을 또는 그 절을 나가시오 : switch 블럭을 나가시오 
		switch (ranking)
		{
			case 1: medalColor = 'G';					
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
		}

		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "입니다.");

		ranking = 3;
		// 지역변수, 참조변수
		String mColor = "";
		switch (ranking)
		{
			case 1: mColor = "금메달";
					break;
			case 2: mColor = "은메달";
					break;
			case 3: mColor = "동메달";
					break;
			default:
					mColor = "일반메달";
		}

		System.out.println(ranking + "등 메달의 색깔은 " + mColor + "입니다.");

		String medal = "GOLD";
		switch (medal)
		{
			case "GOLD": 
					System.out.println("금메달입니다.");
					break;
			case "SILVER": 
					System.out.println("은메달입니다.");
					break;
			case "BRONZE": 
					System.out.println("동메달입니다.");
					break;
			default:
					System.out.println("노메달입니다.");
					break;
		}
	}
}
