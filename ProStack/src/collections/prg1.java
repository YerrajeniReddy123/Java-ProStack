package collections;
import java.util.ArrayList;
public class prg1 {

	public static void main(String[] args) {
		ArrayList enames=new ArrayList();
		enames.add("Rahul");		
		enames.add(101);
		enames.add(101);
		enames.add(45.564);
		enames.add(true);
		enames.add(null);
		
		System.out.println(enames);
		System.out.println(enames.size());
		
		for(Object ename:enames) {
			System.out.println(ename);
		}
		
		System.out.println(enames.get(3)); //to read the element value
	//	System.out.println(enames.set(0, "Rahul Gandhi"));
		
		enames.set(0, "Rahul Gandhi"); //to update the value
		System.out.println(enames);
	}

}
