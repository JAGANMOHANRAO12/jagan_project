package jagan_java_02;

import java.util.Iterator;

import java.util.TreeSet;


public class IteratorDemo {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>();
		t.add("jagan");
		t.add("rama");
		t.add("sravanthi");
		Iterator itr=t.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
