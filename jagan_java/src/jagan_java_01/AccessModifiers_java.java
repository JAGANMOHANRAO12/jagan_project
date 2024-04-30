package jagan_java_01;

public class AccessModifiers_java {
	private void privatemethod() {
		System.out.println("this is private method");
	}
	
	public void publicmethod() {
		System.out.println("this is public method");
	}
	
	protected void protectmethod() {
		System.out.println("this is protected method");
	}
	
	void defaultmethod() {
		System.out.println("this is default method");
	}

	public static void main(String[] args) {
		AccessModifiers_java m=new AccessModifiers_java();
		m.defaultmethod();
		m.privatemethod();
		m.protectmethod();
		m.publicmethod();

	}

}
