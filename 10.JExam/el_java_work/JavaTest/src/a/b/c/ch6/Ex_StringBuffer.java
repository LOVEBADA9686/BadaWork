package a.b.c.ch6;

public class Ex_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. StringBuffer 하고 String 은 전혀 다른 객체 이다. 
//		2. 상호간에 데이터를 사용할 때는 형변환을 해야 한다. 
//		3. StringBuffer 불변성을 가지고 있지 않는다. 
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println("sb >>> : " + sb);
		System.out.println("sb >>> : " + System.identityHashCode(sb));

		sb.append(" and");
		sb.append(" android");
		sb.append(" programming is fun!!!");
		System.out.println("sb >>> : " + sb);
		System.out.println("sb >>> : " + System.identityHashCode(sb));

		String str = sb.toString();
		System.out.println("str >>> : " + str);
		System.out.println("str >>> : " + System.identityHashCode(str));

		String str1 = str + "\n스트링클래스 불변성 이해하기 ㅋ";
		System.out.println("str1 >>> : " + str1);
		System.out.println("str1 >>> : " + System.identityHashCode(str1));
	}

}
