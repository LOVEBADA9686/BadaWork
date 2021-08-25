/*
1. 사칙연산 프로그램 만들기 
2. 사칙 연산자 : +, -, *, /
3. 변수 : main함수 지역변수 int x, int y 초기화는 20, 10 으로 한다.
4. 더하기 함수 : public int addM(int x, int y)
5. 빼기 함수 : public int subM(int x, int y)
6. 곱하기 함수 : public int mulM(int x, int y)
7. 나누기 함수 : public int divM(int x, int y)
8. 각 연산자 함수 블럭에서 하고 결과는 int sum 으로 받는다.
9. 각 연산자 함수 블럭에서 리턴은 지역변수 int sum 으로 한다.
10. main() 함수 각 연산자 함수를 호출해서  결과 값을 
    하기 지역변수로 받아서 콘솔에 출력한다.
    int addV, int subV, int mulV, int divV
	각 연산자 함수 호출은 참조변수를 이용한다. 
11. 패키지는 a.b.c.ch3; 으로 한다. 
*/
// package
package a.b.c.ch3;

// import


public class ExData_6 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// 더하기
	public int addM(int x, int y) {
		System.out.println("\nExData_6.addM() 함수 시작 >>> : \n");
		System.out.println("ExData_6.addM() x >>> : " + x);
		System.out.println("ExData_6.addM() y >>> : " + y);

		int sum = x + y;
		System.out.println("ExData_6.addM() >>> : " + x + " + " + y +" = " + sum);

		System.out.println("\nExData_6.addM() 함수 끝 >>> : \n");
		
		return sum;
	}

	// 빼기
	public int subM(int x, int y)  {
		System.out.println("\nExData_6.subM() 함수 시작 >>> : \n");
		System.out.println("ExData_6.subM() x >>> : " + x);
		System.out.println("ExData_6.subM() y >>> : " + y);

		int sum = x - y;
		System.out.println("ExData_6.subM() >>> : " + x + " - " + y +" = " + sum);

		System.out.println("\nExData_6.subM() 함수 끝 >>> : \n");
		
		return sum;
	}

	// 곱하기
	public int mulM(int x, int y)  {
		System.out.println("\nExData_6.mulM() 함수 시작 >>> : \n");
		System.out.println("ExData_6.mulM() x >>> : " + x);
		System.out.println("ExData_6.mulM() y >>> : " + y);

		int sum = x * y;
		System.out.println("ExData_6.mulM() >>> : " + x + " * " + y +" = " + sum);

		System.out.println("\nExData_6.mulM() 함수 끝 >>> : \n");
		
		return sum;
	}

	// 나누기
	public int divM(int x, int y)  {
		System.out.println("\nExData_6.divM() 함수 시작 >>> : \n");
		System.out.println("ExData_6.divM() x >>> : " + x);
		System.out.println("ExData_6.divM() y >>> : " + y);

		int sum = x / y;
		System.out.println("ExData_6.divM() >>> : " + x + " / " + y +" = " + sum);

		System.out.println("\nExData_6.divM() 함수 끝 >>> : \n");
		
		return sum;
	}
	
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_6.main() 함수 시작 >>> : \n");

		// 지역변수 초기화 
		int x = 20;
		int y = 10;

		// 참조변수 선언
		ExData_6 ed6 = new ExData_6();
		System.out.println("ed6 주소값 >>> : " + ed6);

		/*
		ExData_6 ed6_1 = new ExData_6();
		System.out.println("ed6_1 주소값 >>> : " + ed6_1);

		ExData_6 ed6_2 = new ExData_6();
		System.out.println("ed6_2 주소값 >>> : " + ed6_2);
		*/

		// 더하기 결과값 구하기 
		int addV = ed6.addM(x, y);
		System.out.println("ExData_6.main() : addV >>> : " + addV);

		// 빼기 결과값 구하기
		int subV = ed6.subM(x, y);
		System.out.println("ExData_6.main() : subV >>> : " + subV);

		// 곱하기 결과값 구하기
		int mulV = ed6.mulM(x, y);
		System.out.println("ExData_6.main() : mulV >>> : " + mulV);

		// 나누기 결과값 구하기
		int divV = ed6.divM(x, y);
		System.out.println("ExData_6.main() : divV >>> : " + divV);

		System.out.println("\nExData_6.main() 함수 끝 >>> : \n");
	}
}
