package jagan_java_02;

public class FinalizeDemo {

	public static void main(String[] args) {
		FinalizeDemo obj=new FinalizeDemo();
		System.out.println(obj.hashCode());
		obj=null;
		System.gc();
		System.out.println("End");

	}
	protected void finalize() {
		System.out.println("final garbage collector called");
	}
	
}
