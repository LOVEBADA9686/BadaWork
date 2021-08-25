package a.b.c.ch6;

import java.text.DecimalFormat;

public class Ex_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E : 자연로그의 밑인 e 값 : 2.718
		System.out.println("E : " + Math.E);
		
		// PI : 원주율 값 : 3.14159
		System.out.println("PI : " + Math.PI);
		
		// max : 큰값
		int max = Math.max(2, 2);
		System.out.println("max >>> : " + max);
		
		// min : 작은 값
		int min = Math.min(2, 2);
		System.out.println("min >>> : " + min);
		
		// random() : 0.0 ~ 1.0 사이 난수 (0.0 ~ 0.9)
		// greater than or equal to 0.0 and less than 1.0.
		double random = Math.random(); // java.util.Random
		System.out.println("random >>> : " + random);
		
		// abs() : 절대값 (-, + 부호비트 제거)
		int abs = Math.abs(-10);
		System.out.println("abs >>> : " + abs);
		
		// round : 소수점 첫 번째 자리 반올힘
		System.out.println("round >>> : #######################");		
		double round = Math.round(1.12345);
		System.out.println("round >>> : " + round);
		double d = 3.123456789;
		System.out.println("Math.round(d) >>> : " + Math.round(d));
		System.out.println("Math.round(d*100)/100.0 >>> : " + Math.round(d*100)/100.0);
		System.out.println("Math.round(d*1000)/1000.0 >>> : " + Math.round(d*1000)/1000.0);
		System.out.println("Math.round(d*1000000)/1000000.0 >>> : " + Math.round(d*1000000)/1000000.0);

		System.out.println("String.format(\"%.2f\", d) >>> : " + String.format("%.2f", d));
		System.out.println("String.format(\"%.3f\", d) >>> : " + String.format("%.3f", d));
		System.out.println("String.format(\"%.5f\", d) >>> : " + String.format("%.5f", d));

		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("포맷 >>> : " + df.format(1.234567));
		
		System.out.println("round >>> : #######################");
		
		// ceil : 전달 받은 실수보다 작은 정수 중 가장 정수 정수 반환
		double ceil = Math.ceil(10.1);
		System.out.println("ceil >>> : " + ceil);
		
		// floor : 전달 받은 실수보다 작은 정수 중 가장 큰 정수 반환
		double floor = Math.floor(10.9);
		System.out.println("floor >>> : " + floor);
		
		// pow : 제곱연산 : (5, 2) -> 25
		double pow = Math.pow(5, 2);
		System.out.println("pow >>> : " + pow);		

	}

}
