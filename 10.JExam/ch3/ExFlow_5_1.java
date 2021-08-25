// package
package a.b.c.ch3;

// import
import java.util.Scanner;


public class ExFlow_5_1
{
	// 상수 
	public static final char MEDAL_CLOLOR_GOLD = 'G';
	public static final char MEDAL_CLOLOR_SILVER = 'S';
	public static final char MEDAL_CLOLOR_BRONZE = 'B';
	public static final char MEDAL_CLOLOR_A = 'A';
	// 멤버변수
	// 생성자
	

	// 함수 
	public String rankFun(int ranking){
		System.out.println("\nExFlow_5_1.rankFun() 함수 진입 >>> : \n");
		System.out.println("ExFlow_5_1.rankFun() :: ranking >>> : " + ranking);

		// 지역변수, 기초자료형변수
		char medalColor = '\u0000'; // 유니코드로 초기화 
		
		switch (ranking)
		{
			case 1: medalColor = ExFlow_5_1.MEDAL_CLOLOR_GOLD;					
					break;
			case 2: medalColor = ExFlow_5_1.MEDAL_CLOLOR_SILVER;
					break;
			case 3: medalColor = ExFlow_5_1.MEDAL_CLOLOR_BRONZE;
					break;
			default:
					medalColor = ExFlow_5_1.MEDAL_CLOLOR_A;
			/*
			case 1: medalColor = 'G';					
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
			*/
		}

		System.out.println("\nExFlow_5_1.rankFun() 함수 끝 >>> : \n");
		return ranking + "등 메달의 색깔은 " + medalColor + "입니다.";		
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("\nExFlow_5_1.main() 함수 진입 >>> : \n");
		System.out.println("등수를 입력하시오 !!");
		
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();

		if (1 <= ranking && ranking <= 100)
		{
			ExFlow_5_1 ef1 = new ExFlow_5_1();
			String msg = ef1.rankFun(ranking);

			System.out.println("" + msg);
				
		}else{
			System.out.println("순위를 잘 입력하시오 !!");
		}

		System.out.println("\nExFlow_5_1.main() 함수 끝 >>> : \n");
	}
}
