package jagan_java_02;

import jagan_java_01.AccessModifiers_java;

public class Access extends AccessModifiers_java{

	public static void main(String[] args) {
		AccessModifiers_java m=new AccessModifiers_java();
		m.publicmethod();
		Access A=new Access();
		A.protectmethod();
		A.publicmethod();

	}

}
