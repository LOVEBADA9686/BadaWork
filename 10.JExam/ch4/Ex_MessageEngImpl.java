// Ex_MessageEngImpl.java

package a.b.c.ch4;

// public class Ex_MessageEngImpl implements Ex_MessageInterface
public class Ex_MessageEngImpl implements Ex_MessageInterface
{
	@Override
	public void sayHello(String name){
		System.out.println("Hello, " + name + "!!");
	}
}