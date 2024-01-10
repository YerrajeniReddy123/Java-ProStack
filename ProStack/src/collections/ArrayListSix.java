package collections;

import java.util.ArrayList;

public class ArrayListSix {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("YDR");
		a1.add('Y');
		a1.add('D');
		a1.add('R');
		a1.add(null);
		a1.add(545.15);
		
		System.out.println(a1);
		
		int count=0;
		for(int i=0;i<=a1.size()-1;i++) {
			Object obj=a1.get(i);
			if(obj instanceof Character) {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
