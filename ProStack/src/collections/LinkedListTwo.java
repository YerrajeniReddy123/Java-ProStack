package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTwo {

	public static void main(String[] args) {
		LinkedList<Integer> ids=new LinkedList<Integer>();
		ids.add(10);
		ids.add(20);
		ids.add(30);
		ids.add(40);
		System.out.println(ids);
		
//		int i=0;
//		while(i<=ids.size()-1) {
//			System.out.println(ids.get(i));
//		}
		
//		for(Integer id:ids) {
//			System.out.println(id);
//		}
		
		Iterator itr=ids.iterator();
		//System.out.println(itr);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
