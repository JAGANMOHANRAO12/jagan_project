package jagan_java_02;

public class TestThis {
	int id;
	String name;
	TestThis(int id,String name){
		this.id=id;
		this.name=name;
	}
	void print() {
		System.out.println(id+" "+name);
	}
	
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		TestThis t=new TestThis(1,"jagan");
		t.print();
		t.display();

	}

}
