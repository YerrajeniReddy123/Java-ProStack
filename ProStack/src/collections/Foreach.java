package collections;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
		ArrayList<String> enames=new ArrayList<String>();
		
		enames.add("YDR");
		enames.add("YVR");
		enames.add("YSR");
		enames.add("YDR");
		enames.add(null);
		
		System.out.println(enames);
		System.out.println(enames.isEmpty());
		System.out.println(enames.contains("YDR"));
		System.out.println(enames.size()); //it gives length of an array
		System.out.println(enames.remove(0));
		System.out.println(enames.remove("YDR"));
		System.out.println(enames);
//		for(String ename:enames) {
//			System.out.println(ename);
//		}
//		

	}

}
