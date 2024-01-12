package UpAndDownCasting;

public class Child extends Parent {
	int x=10;
	public void m2() {
		System.out.println("In the child class");
	}
	
	public static void main(String[] args) {
		Child a1=new Child();
		a1.m1();
		a1.m2();
		
		//UpCasting
		Parent a2=new Child(); //Implicitly
		a2.m1();
		System.out.println(a2.a);
		
		Parent a3=(Parent)new Child();

	}

}
