package collections;

import java.util.ArrayList;

public class ArrayListThree {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		System.out.println(enames);
		
		enames.add("YDR");
		enames.add("YVR");
		enames.add("YSR");
		System.out.println(enames);
		
		enames.add("Modi");
		enames.add("Jagan");
		enames.add("Vijay");
		System.out.println(enames);
		
		for(int i=0;i<=enames.size()-1;i++) {
			System.out.println(enames.get(i));
		}

	}

}
