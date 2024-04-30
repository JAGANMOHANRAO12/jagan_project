package jagan_java_02;

import java.util.ArrayList;

public class UnboxingDemo {

	public static void main(String[] args) {
		java.util.ArrayList<Character> l=new ArrayList<Character>();
		l.add('d');
		l.add('e');
		char d=l.get(1);
		System.out.println(d);
		

	}

}
