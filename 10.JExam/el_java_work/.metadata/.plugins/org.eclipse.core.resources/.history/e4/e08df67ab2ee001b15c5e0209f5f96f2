package a.b.c.ch7;

public class Ex_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Properties p = System.getProperties();
		// System.out.println("System.getProperties() \n" + p);
		
		for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
			String key = (String)e.nextElement();
			String value = p.getProperty(key);	
			//System.out.println(key + "=" + value);
		}
		
		p.list(System.out);
	}

}
