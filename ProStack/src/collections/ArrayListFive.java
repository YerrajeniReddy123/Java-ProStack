//Print only the Double Objects

package collections;

import java.util.ArrayList;

public class ArrayListFive {

	public static void main(String[] args) {
		ArrayList ids=new ArrayList();
		ids.add(10);
		ids.add(10.3);
		ids.add(50);
		ids.add(222.220);
		ids.add(89);
		
		System.out.println(ids);
		
		for(int i=0;i<=ids.size()-1;i++) {
			Object obj=ids.get(i);
			if(obj instanceof Double) {
				System.out.println(obj);
			}
		}

	}

}
