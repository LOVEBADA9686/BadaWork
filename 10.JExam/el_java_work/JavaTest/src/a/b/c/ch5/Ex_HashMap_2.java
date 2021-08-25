package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_HashMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이름", "이근희");
		hm.put("나이", "27");
		hm.put("주소", "고양시 일산");
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
		
		// iterator()
		Iterator<String> keys = hm.keySet().iterator();
		
		//  hasNext() 함수 : 커서 함수 라고 부른다. 
		while (keys.hasNext())
		{
			String key = keys.next();
			String value = hm.get(key);
			System.out.println("iterator() >>> : " + key + " : " + value);
		}
		System.out.println();
		
		// keySet()
		for (String key1 : hm.keySet())
		{
			String value1 = hm.get(key1);
			System.out.println("keySet() >>> : " + key1 + " : " + value1);
		}
		System.out.println();
		
		// entrySet()
		for (Map.Entry<String, String> entry : hm.entrySet())
		{
			System.out.println("entrySet() >>> : " + entry.getKey() + " : " + entry.getValue());
		}
	}
}
