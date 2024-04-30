package jagan_java_02;

import java.util.Deque;

import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> D=new ArrayDeque<Integer>();
		D.addFirst(123);
		D.addLast(3212);
		int f1=D.removeFirst();
		int f2=D.removeLast();
		System.out.println("first"+f1+"last num is"+f2);


	}

}
