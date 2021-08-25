package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		    try - catch - finally 구문 : 예외 처리 구문 
		   
			try {
				예외 발생이 예상되는 구문 작성하는 블럭 
			}catch(예외 클래스 참조변수) {
				예외를 처리하는 블럭 : 예외 클래스 계층 구조상 하위에 있는 예외 클래스 
			}catch(예외 클래스 참조변수) {
				예외를 처리하는 블럭 : 예외 클래스 계층 구조상 상위에 있는 예외 클래스 
			}finally {
				예외 발생과 관계없이 실행 되는 블럭 
			}
		*/
		
		try {

			int arr[] = new int[3]; // 방 3개 
//			i < arr.length : [0] [1] [2] : 방 3개
//			i <= arr.length : [0] [1] [2] [3] : 방 4개		
			for (int i=0; i <= arr.length; i++) {
				System.out.println("arr["+i+"] >>> : " + arr[i]);
			}			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException 에러가 :: a.getMessage() >>> : " 
								+ a.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception 에러가 :: e.getMessage() >>> : " 
								+ e.getMessage());
		}finally {
			System.out.println("예외 발생과 관계없이 실행 되는 블럭 >>> : ");
		}
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println("date >>> : " 
					+ new SimpleDateFormat().format(new Date()));
		
	}
}
