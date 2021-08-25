// package
package a.b.c.ch4;

// import


public class Interface_AImpl implements Interface_A 
{
	// @ : 자바에서 사용하는 어노테이션 기술이다. 
	// 어노테이션 기술은 두 가지 기능 
	// 1. 함수를 설명하는 기능 
	// 2. 실제로 구현하는 기능 
	
	// @Override : 오버라이드 어노테이션 이라고 부른다.
	// 함수를 설명하는 기능 : interface_a() 함수를 
	// Interface_A 인터페이스에서 Interface_AImpl 클래스로 오버라이딩 했다는 설명
	@Override
	public void interface_a(){
		System.out.println("Interface_AImpl.interface_a() 함수 >>> : ");
	}

	@Override
	public int interface_b(){
		return 100;
	}

	@Override
	public String interface_c(){
		return "interface_c()";
	}

	@Override
	public boolean interface_d(){
		return false;
	}
}
