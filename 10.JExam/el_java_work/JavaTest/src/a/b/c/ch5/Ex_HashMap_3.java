package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;

public class Ex_HashMap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이름", "오재영");
		hm.put("나이", "25");
		hm.put("주소", "의정부 호원동");
		String name = hm.get("이름");
		String age = hm.get("나이");
		String addr = hm.get("주소");
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("addr >>> : " + addr);
		System.out.println("\n#########################\n");
		System.out.println("hm.keySet() >>> : " + hm.keySet());		
		System.out.println("hm.values() >>> : " + hm.values());
		System.out.println("hm.entrySet() >>> : " + hm.entrySet());		
		System.out.println("\n#########################\n");
		
		/*
			hm.keySet() : 이름, 나이, 주소 가 배열로 있음 
			.iterator() : hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를 Iterator keys 참조변수에 대입한다.
		                                    다른 말로 Iterator keys 참조변수가 hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를 가르킨다.
		*/
		Iterator keys = hm.keySet().iterator();
		
		// Iterator 참조변수 keys 를 이용 해서 이터레이터에 들어 있는 데이터를 hasNext() 함수로 확인 한다. 
		while (keys.hasNext()) {
			String key = (String)keys.next();
			String value = "";
			
			if ("이름".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("나이".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("주소".equals(key)) {
				value = (String)hm.get(key);
			}
			System.out.println(key + " : " + value);
		}
	}
}
