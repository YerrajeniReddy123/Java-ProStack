package collections;

import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("Rahul Gandhi");
		enames.add("Priyanka Gandhi");
		enames.add("Priyanka");
		System.out.println(enames);
		
		ArrayList<String> new_Enames1=new ArrayList<String>();
		ArrayList<String> new_Enames2=new ArrayList<String>();
		new_Enames1.add("YDR");
		new_Enames1.add("YVR");
		enames.addAll(new_Enames1);
		
		System.out.println(enames);
		
		new_Enames2.add("Venky");
		new_Enames2.add("Tharun");
		enames.addAll(new_Enames2);
		
		System.out.println(enames);
		

	}

}
