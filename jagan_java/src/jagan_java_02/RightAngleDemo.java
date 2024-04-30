package jagan_java_02;

public class RightAngleDemo {

	public static void main(String[] args) {
		int h=6;
		System.out.println("*");
		for(int i=1;i<h;i++) {
			System.out.println("*"+" ".repeat(i)+"*");
		}
		System.out.println("* ".repeat(h-1));

	}

}
