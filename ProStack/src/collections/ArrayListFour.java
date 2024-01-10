package collections;

import java.util.ArrayList;

public class ArrayListFour {

	public static void main(String[] args) {
		ArrayList ids=new ArrayList();
		ids.add(10);
		ids.add(12.23);
		ids.add(50);
		ids.add(5.65);
		ids.add(100);
		ids.add(1.01);
		System.out.println(ids);
		
		for(int i=0;i<=ids.size()-1;i++) {
			Object obj=ids.get(i);
			if(obj instanceof Integer) {
				System.out.println(obj);
			}
		}

	}

}
