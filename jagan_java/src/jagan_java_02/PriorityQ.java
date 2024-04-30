package jagan_java_02;

import java.util.*;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(10);
		p.add(30);
		p.add(60);
		p.add(10);
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.poll());
		System.out.println(p);

	}

}
