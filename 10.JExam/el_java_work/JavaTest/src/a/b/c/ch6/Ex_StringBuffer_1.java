package a.b.c.ch6;

abstract class SqlQueryMap{
	
	public static String getSelectQuery(){	
	
		// SQL 
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT					\n");
		sb.append("       A.NAME AS NAME	\n");
		sb.append("       A.ID   AS ID		\n");
		sb.append("       A.PW   AS PW		\n");
		sb.append("       A.HP   AS HP		\n");
		sb.append("       A.ADDR AS ADDR	\n");
		sb.append("FROM   MEMBER A			\n");

		return sb.toString();
	}
	
	// 추상클래스에 있는 추상함수
	public abstract void aM();
}

public class Ex_StringBuffer_1 extends SqlQueryMap{

	@Override
	public void aM() {
		// TODO Auto-generated method stub
		System.out.println(   " SqlQueryMap 추상클래스에서 "
		                   	+ "\n aM() 추상함수를 "
		                   	+ "\n StringBufferTest_1 클래스로 "
		                   	+ "\n 오버라이드해서 구현체를 만들었음 "
		                   	+ "\n 구현체를 만든다는 의미는 {} 을 만든다는 것임 ");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String selectQuery = SqlQueryMap.getSelectQuery();
		System.out.println("\n" + selectQuery);
		
		new Ex_StringBuffer_1().aM();
	}
}
