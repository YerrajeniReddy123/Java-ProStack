package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListFour {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(7676);
		ll.add("hkh");
		ll.add(034);
		ll.add(464);
		ll.add(4865);
		
		System.out.println(ll);
		
/*		Collections.sort(ll);
		System.out.println(ll);*/
		
		for(Object ele:ll) {
			System.out.println(ele);
		}
	}

}
