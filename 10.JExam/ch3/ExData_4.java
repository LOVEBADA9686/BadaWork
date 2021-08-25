// package
package a.b.c.ch3;

// import


public class ExData_4 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// 리턴형이 없고, 스태틱 키워드 없고, 매개변수 2개있는 함수 
	public void add_0(int x, int y){
		System.out.println("ExData_4.add_0() 함수 시작 >>> : \n");
		System.out.println("매개변수 지역변수 int x 에 아규먼트 x로 넘어온 값을 대입 int x = x >>> : " + x);
		System.out.println("매개변수 지역변수 int y 에 아규먼트 y로 넘어온 값을 대입 int y = y >>> : " + y);
		
		// 매개변수 지역변수 int x 를 add_0() 함수 블럭에서 사용
		// 매개변수 지역변수 int y 를 add_0() 함수 블럭에서 사용
		// x + y 연산 결과를 콘솔에 출력
		System.out.println(x + y);
		
		System.out.println("\nExData_4.add_0() 함수 끝 >>> : ");
	}

	// 리턴형이 없고, 스태틱 키워드 없고, 매개변수 2개있는 함수
	public void add_1(int x, int y){
		System.out.println("ExData_4.add_1() 함수 시작 >>> : \n");
		System.out.println("매개변수 지역변수 int x 에 아규먼트 x로 넘어온 값을 대입 int x = x >>> : " + x);
		System.out.println("매개변수 지역변수 int y 에 아규먼트 y로 넘어온 값을 대입 int y = y >>> : " + y);
		
		// 매개변수 지역변수 int x 를 add_1() 함수 블럭에서 사용
		// 매개변수 지역변수 int y 를 add_1() 함수 블럭에서 사용
		// x + y 연산 결과를 int형 지역변수 sum 에 대입
		int sum = x + y;
		// int형 지역변수 sum을 호출해서 콘솔에 출력
		System.out.println("sum >>> : " + sum);

		System.out.println("\nExData_4.add_1() 함수 끝 >>> : ");
	}

	// 리턴형이 있고 : 리턴형은 int형, 스태틱 키워드 없고, 매개변수 2개있는 함수
	public int add_2(int x, int y){
		System.out.println("ExData_4.add_2() 함수 시작 >>> : \n");
		System.out.println("매개변수 지역변수 int x 에 아규먼트 x로 넘어온 값을 대입 int x = x >>> : " + x);
		System.out.println("매개변수 지역변수 int y 에 아규먼트 y로 넘어온 값을 대입 int y = y >>> : " + y);
	
		// 매개변수 지역변수 int x 를 add_2() 함수 블럭에서 사용
		// 매개변수 지역변수 int y 를 add_2() 함수 블럭에서 사용
		
		// x + y 연산 결과를 변수를 사용하지 않고 return 값을 호출한 곳으로 직접 넘김 
		
		System.out.println("\nExData_4.add_2() 함수 끝 >>> : ");
		return x + y;
	}

	// 리턴형이 있고 : 리턴형은 int형, 스태틱 키워드 없고, 매개변수 2개있는 함수
	public int add_3(int x, int y){
		System.out.println("ExData_4.add_3() 함수 시작 >>> : \n");
		System.out.println("매개변수 지역변수 int x 에 아규먼트 x로 넘어온 값을 대입 int x = x >>> : " + x);
		System.out.println("매개변수 지역변수 int y 에 아규먼트 y로 넘어온 값을 대입 int y = y >>> : " + y);
		
		// 매개변수 지역변수 int x 를 add_2() 함수 블럭에서 사용
		// 매개변수 지역변수 int y 를 add_2() 함수 블럭에서 사용
		// x + y 연산 결과를 int형 지역변수 sum 에 대입
		int sum = x + y;
		
		// int형 지역변수 sum을 호출해서 콘솔에 출력
		System.out.println("sum >>> : " + sum);

		System.out.println("\nExData_4.add_2() 함수 끝 >>> : ");
		
		// int형 지역변수 sum을 호출해서 return value 로 호출한 곳으로 값을 넘김 
		return sum;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("ExData_4.main() 함수 시작 >>> : \n");

		// 콘솔에 1 + 1 더하기 출력 
		System.out.println(1 + 1);
		System.out.println("1+1=" + 1 + 1); // 문자 숫자
		System.out.println("1+1=" + (1 + 1)); // 문자 숫자

		// int i = 0;
		// 함수 블럭에서 int i = 0  하위 라인에서 
		// 함수 호출의 결과 값, 연산의 결과 값을 재 사용할 때 초기화 해서 사용한다.

		// int형 지역변수 x 선언 후 값(리터럴) 1 로 초기화 
		int x = 1;
		// int형 지역변수 y 선언 후 값(리터럴) 1 로 초기화 
		int y = 1;

		// 지역변수 x, y 호출한 후 x+y 연산 결과 콘솔에 출력 
		System.out.println(x + y);

		// 지역변수 x, y 호출한 후, x + y 연산 결과 값을 
		// int형 지역변수 sum 에 대입
		int sum = x + y;
		// 지역변수 sum을 호출해서 sum의 결과 값을 콘솔에 출력 
		System.out.println(sum);

		// 참조변수 사용
		// ExData_4  클래스 선언 
		// ed4 참조변수 선언
		// = : 대입연산자 선언
		// new 키워드 선언
		// ExData_4() 생성자 선언 
		ExData_4 ed4 = new ExData_4();

		// 참조변수 ed4 로 add_0() 함수 호출
		// 함수 아규먼트 2개 전달
		// 첫번째 아규먼트 인트형 x 지역변수 값 전달
		// 두번째 아규먼트 int형 y 지역변수 값 전달
		ed4.add_0(x, y);

		// 참조변수 ed4 로 add_1() 함수 호출
		// 함수 아규먼트 2개 전달
		// 첫번째 아규먼트 인트형 x 지역변수 값 전달
		// 두번째 아규먼트 int형 y 지역변수 값 전달
		ed4.add_1(x, y);

		// 참조변수 ed4 로 add_2() 함수 호출
		// 함수 아규먼트 2개 전달
		// 첫번째 아규먼트 인트형 x 지역변수 값 전달
		// 두번째 아규먼트 int형 y 지역벼수 값 전달
		// 함수의 결과 값 (return value)를 int형 sum2 지역변수에 대입
		int sum2 = ed4.add_2(x, y);
		// 지역변수 sum2을 호출해서 sum2의 결과 값을 콘솔에 출력 
		System.out.println(sum2);

		// 참조변수 ed4 로 add_3() 함수 호출
		// 함수 아규먼트 2개 전달
		// 첫번째 아규먼트 인트형 x 지역변수 값 전달
		// 두번째 아규먼트 int형 y 지역벼수 값 전달
		// 함수의 결과 값 (return value)를 int형 sum3 지역변수에 대입
		int sum3 = ed4.add_3(x, y);
		// 지역변수 sum3을 호출해서 sum3의 결과 값을 콘솔에 출력 
		System.out.println(sum3);

		System.out.println("\nExData_4.main() 함수 시작 >>> : ");
	}
}
