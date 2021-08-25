package a.b.c.ch5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex_HashMap_4 {

	public ArrayList hashMap() {
		
		HashMap hm0 = new HashMap();
		hm0.put("이름", "김바다");
		hm0.put("나이", "29");
		hm0.put("주소", "광명시 소하동");
	
		HashMap hm1 = new HashMap();
		hm1.put("이름", "윤종서");
		hm1.put("나이", "33");
		hm1.put("주소", "관악구 신림동");
		
		HashMap hm2 = new HashMap();
		hm2.put("이름", "최현준");
		hm2.put("나이", "29");
		hm2.put("주소", "양천구 신월동");
		
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public ArrayList<HashMap<String, String>> hashMapGeneric() {
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("이름", "조준휘");
		hm0.put("나이", "33");
		hm0.put("주소", "부천시 상동");
	
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("이름", "전용구");
		hm1.put("나이", "27");
		hm1.put("주소", "금천구 가산동");
		
		HashMap <String, String> hm2 = new HashMap<String, String>();
		hm2.put("이름", "김찬기");
		hm2.put("나이", "34");
		hm2.put("주소", "양평구 신정동");
		
		ArrayList<HashMap<String, String>> aList = 
				new ArrayList<HashMap<String, String>>();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex_HashMap_4 ex4 = new Ex_HashMap_4();
		ArrayList aList = ex4.hashMap();
		
		for (int i=0; i < aList.size(); i++) {
			
			HashMap hm = (HashMap)aList.get(i);	
			
			Iterator keys = hm.keySet().iterator();
			System.out.println("keys >>> : " + keys);
			
			boolean bool = keys.hasNext();
			System.out.println("keys.hasNext() >>> : " + bool);
			
			while (keys.hasNext()) {
//			while (bool) {
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
		
		ArrayList<HashMap<String, String>> aList1 = ex4.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			Iterator<String> keys = hm.keySet().iterator();
			
			// Iterator 참조변수 keys 를 이용 해서 이터레이터에 들어 있는 데이터를 hasNext() 함수로 확인 한다. 
			while (keys.hasNext()) {
				String key = (String)keys.next();
				String value = "";
				
				if ("이름".equals(key)) {
					value = hm.get(key);
				}
				if ("나이".equals(key)) {
					value = hm.get(key);
				}
				if ("주소".equals(key)) {
					value = hm.get(key);
				}
				
//				if ("이름".equals(key) || "나이".equals(key) || "주소".equals(key)) {
//					value = hm.get(key);
//				}
				System.out.println(key + " : " + value);
			}
		}		
	}
}
