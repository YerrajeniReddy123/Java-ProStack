package UpAndDownCasting;

public class UpCastingOne {

	public static void main(String[] args) {
		double b=10; //implicit upcasting
		System.out.println(b);
		
		double c=(double)100;
		System.out.println(c); //Explicit UpCasting
		
		char d=(char)1000;
		System.out.println(d);
		
		int i=10;
		double db=i;
		System.out.println(db);
		
		double db1=100.32;
		int i1=(int)db1;
		System.out.println(i1);
		
	}

}
