// package
package a.b.c.ch3;

// import


public class ExOper_2 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// 관계 연산자는 연산의 결과를 논리 값(true, false)으로 반환 한다. 
		System.out.println("관계연산 >>>>>>>>>>>>>>");
		System.out.println( 3 < 5 );
		System.out.println( 3 > 5 );
		System.out.println( 3 <= 5 );
		System.out.println( 3 >= 5 );
		System.out.println( 3 == 5 ); // == : 상등연산자 : 같은지 비교하는 연산자, 
		System.out.println( 3 != 5);

		boolean bool = false;
		
		bool = 3 < 5;
		System.out.println("bool >>> : " + bool);
		System.out.println("3 < 5 = " + bool);
		bool = 3 > 5;
		System.out.println("3 > 5 = " + bool);
		bool = 3 <= 5;
		System.out.println("3 <= 5 = " + bool);
		bool = 3 >= 5;
		System.out.println("3 >= 5 = " + bool);
		bool = 3 == 5;
		System.out.println("3 == 5 = " + bool);
		bool = 3 != 5;
		System.out.println("3 != 5 = " + bool);

		bool = 'a' < 'b';
		System.out.println(bool);
		bool = 'A' < 'B';
		System.out.println(bool);
		bool = 'A' < 40;
		System.out.println(bool);
		bool = 'A' < 0x65; // 0x65 는 16진수 
		System.out.println(bool);
		
		bool = 'a' < '가';
		System.out.println(bool);

		bool = '가' < '나';
		System.out.println(bool);
		
		//bool = '가나' < '나라';
		//System.out.println(bool);
		
		//bool = "가" < "나";
		//System.out.println(bool);

		// 논리 연산 : &&, ||, !
		/*
			T AND T = T
			T AND F = F
			F AND T = F
			F AND F = F

			T OR T = T
			T OR F = T
			F OR T = T
			F OR F = F
		*/
		System.out.println("논리연산 >>>>>>>>>>>>>>");
		// 논리연산은 관계연산의 결과값으로 연산을 한다. 
		boolean bVal = 5 > 3 && 5 > 2;
		boolean bVa11 = 5 > 3;
		System.out.println(bVa11);
		boolean bVa12 = 5 > 2;
		System.out.println(bVa12);
		System.out.println(bVal);
		boolean bVal3 = true && true;
		System.out.println(bVal3);

		boolean bV  = 5 > 3 || 5 > 2;
		boolean bV1 = 5 > 3;
		System.out.println(bV1);
		boolean bV2 = 5 > 2;
		System.out.println(bV2);
		System.out.println(bV);
		boolean bV3 = true && true;
		System.out.println(bV3);

		// 자바 논리연산의 단축평가 : short-circuit 현상
		System.out.println("자바 논리연산의 단축평가 : short-circuit >>>>>>>>>>>>>>");
		int num1 = 10;
		int i = 2;

		boolean v = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) < 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v);
		System.out.println(num1);
		System.out.println(i);

		boolean v1 = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v1);
		System.out.println(num1);
		System.out.println(i);


		boolean v2 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v2);
		System.out.println(num1);
		System.out.println(i);

		boolean v3 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) < 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v3);
		System.out.println(num1);
		System.out.println(i);



		// 복합 대입 연산자
		System.out.println("복합 대입 연산자 >>>>>>>>>>>>>>>>>>>>>>>>>");
		int s = 10;
		System.out.println(s += 10);
		System.out.println(s -= 10);
		System.out.println(s *= 10);

		// 삼항 연산자 : 조건 연산자 
		System.out.println("삼항 연산자 : 조건 연산자 >>>>>>>>>>>>>>");
		// (조건식) ? 결과1 : 결과2;

		int n = (5 > 3) ? 10 : 20;
		System.out.println(n);
		// 5 < 3 이 T일 경우 10 을 콘솔에 표시, 5 < 3 이 F일 경우 20 을 콘솔에 표시
		// 콘솔에 10 표시됨

		int n1 = (5 < 3) ? 10 : 20;
		System.out.println(n1);
		// 5 < 3 이 T일 경우 10 을 콘솔에 표시, 5 < 3 이 F일 경우 20 을 콘솔에 표시
		// 콘솔에 20 표시됨

		boolean b = (true) ? true : false;
		System.out.println(b);
		// ture 이 T일 경우 true 을 콘솔에 표시, ture 이 F일 경우 false 을 콘솔에 표시
		// 콘솔에 true 표시됨
		
		boolean b1 = (false) ? true : false;
		System.out.println(b1);
		// ture 이 T일 경우 true 을 콘솔에 표시, ture 이 F일 경우 false 을 콘솔에 표시
		// 콘솔에 false 표시됨

	}
}
