package collections;

import java.util.ArrayList;

public class Prg2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("YDR");
		System.out.println(a1);
		
		ArrayList<Integer> ids=new ArrayList<Integer>();
		ids.add(108);
	//	ids.add("YDR"); Error!!!
		System.out.println(ids);
		
		ArrayList<String> enames=new ArrayList<String>();
		enames.add("YDR");
		enames.add("Rahul");
		enames.add("YDR");
		enames.add(null);
		System.out.println(enames);
		

	}

}
