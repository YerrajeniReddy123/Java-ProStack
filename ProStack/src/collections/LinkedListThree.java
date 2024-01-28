package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListThree {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(434);
		ll.add(4647);
		ll.add(89743);
		ll.add(5464);
		
		System.out.println(ll);
		
		Collections.sort(ll);
		System.out.println(ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
	
	}

}
