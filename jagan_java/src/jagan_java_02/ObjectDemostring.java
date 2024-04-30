package jagan_java_02;

public class ObjectDemostring {

	public static void main(String[] args) {
		String s1="jagan";
		String s2="Welcome";
		String s3="welcome";
		String s4="Jagan";
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s4));
		String s=s1.concat(s4);
		boolean d=s2.equalsIgnoreCase(s3);
		System.out.println(s);
		System.out.println(d);
		

	}

}
