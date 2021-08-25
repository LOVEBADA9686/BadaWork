package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			제너릭 에서의 타입 : 제너릭에서 선언한 Object의 역활을 타입이라고 한다. 
			
			<T> : Type
			<E> : Element
			<K> : Key
			<V> : Value
			<N> : Number
			
			public V put(K key, V value) // jdk 1.8 // 두번째오는 매개변수가 리턴형이다. 
			public V get(Object key) // Value 리턴형을 받는다. 
			
			public Object put(Object key, Object value) // jdk 1.4 
			public Object get(Object key)
		*/
		
		ArrayList aList = new ArrayList(); // [] : 배열 
		System.out.println("aList >>> : " + aList);
		System.out.println("aList >>> : " + System.identityHashCode(aList));
		
		// HashMap 에 저장하는 데이터는 모두 Object 이다. 
		// HashMap 데이터를 꺼내서 사용할 때는 데이터의 원래 형태대로 형변환을 해야 한다.
		HashMap hp = new HashMap(); // {} : 배열이 아니다 
		System.out.println("hp >>> : " + hp);
		System.out.println("hp >>> : " + System.identityHashCode(hp));	
		
		hp.put("이름", "장수옥");
		System.out.println("hp >>> : " + hp);
		
		hp.put("나이", 29);
		System.out.println("hp >>> : " + hp);
		
		hp.put('a', "오재영");
		System.out.println("hp >>> : " + hp);
		
		hp.put('이', 25);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		
		// key 가 같으면 데이터를 나중것이 나온다. 
		hp.put("나이", 23);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		hp.put('이', 21);
		System.out.println("hp >>> : " + hp);
		System.out.println("hp.size() >>> : " + hp.size());
		
		
//		String s0 = hp.get("이름");
		Object obj0 = hp.get("이름");
		String s0 = (String)obj0; // hp.put("이름", "장수옥");		
		String s0_1 = hp.get("이름").toString();
		String s0_2 = String.valueOf(hp.get("이름"));	
		String s0_3 = hp.get("이름") + "";	
		
		System.out.println("obj0 >>> : " + obj0);
		System.out.println("s0 >>> : " + s0);
		System.out.println("s0_1 >>> : " + s0_1);
		System.out.println("s0_2 >>> : " + s0_2);
		System.out.println("s0_3 >>> : " + s0_3);		

//		Integer s1 = hp.put("나이");
		Object obj1 = hp.get("나이");
		Integer s1 = (Integer)obj1; // hp.put("나이", 29);
		String s1_1 = hp.get("나이").toString();
		String s1_2 = String.valueOf(hp.get("나이"));	
		String s1_3 = hp.get("나이") + "";
		
		System.out.println("obj1 >>> : " + obj0);
		System.out.println("s1 >>> : " + s1);
		System.out.println("s1_1 >>> : " + s1_1);
		System.out.println("s1_2 >>> : " + s1_2);
		System.out.println("s1_3 >>> : " + s1_3);	
		
		// hp.put('a', "오재영");
//		String s2 = hp.put('a');
		Object obj2 = hp.get('a');
		String s2 = (String)obj2; // hp.put('a', "오재영");
		String s2_1 = hp.get('a').toString();
		String s2_2 = String.valueOf(hp.get('a'));	
		String s2_3 = hp.get('a') + "";
		
		System.out.println("obj1 >>> : " + obj0);
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2_1 >>> : " + s2_1);
		System.out.println("s2_2 >>> : " + s2_2);
		System.out.println("s2_3 >>> : " + s2_3);	
		
		// hp.put('이', 25);
//		Integer s3 = hp.put('이');
		Object obj3 = hp.get('이');
		Integer s3 = (Integer)obj3; // hp.put('이', 25);
		String s3_1 = hp.get('이').toString();
		String s3_2 = String.valueOf(hp.get('이'));	
		String s3_3 = hp.get('이') + "";
		
		System.out.println("obj3 >>> : " + obj3);
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3_1 >>> : " + s3_1);
		System.out.println("s3_2 >>> : " + s3_2);
		System.out.println("s3_3 >>> : " + s3_3);			
	}

}
