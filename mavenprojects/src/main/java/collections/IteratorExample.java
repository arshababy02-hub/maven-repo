package collections;

import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String>color =new HashSet<String>();
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("purple");
		System.out.println(color);
		
		/*for(String s:color){
		 System.out.println(s);
		 }
		 */
		
		Iterator<String>i =color.iterator();//creating an iterator to travel
		while (i.hasNext()) {//to check element exist
        System.out.println(i.next());
		}
		i.remove();//remove last element in the set
		System.out.println(color);
		
	}

}
