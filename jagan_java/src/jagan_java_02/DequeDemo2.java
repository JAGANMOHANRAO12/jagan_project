package jagan_java_02;

import java.util.Deque;

import java.util.ArrayDeque;

public class DequeDemo2 {

	public static void main(String[] args) {
		Deque<Integer> D=new ArrayDeque<Integer>();
		D.offer(1);
		D.offerFirst(3);
		D.offerLast(2);
		System.out.println(D);
		System.out.println("The first ELement"+D.peekFirst());
		System.out.println("The peek element in D is"+D.peek());
		System.out.println("The last Element is"+D.getLast());


	}

}
