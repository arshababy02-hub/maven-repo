package collections;

import java.util.ArrayList;
import java.util.List;

public class Listmethods {

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		//method 1 add()
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("green");
		System.out.println(color);
		//method 2 get() .get elements at specified index
		System.out.println(color.get(2));
  //method 3 set() replace element in specified index
		color.set(2,"pink");
		System.out.println(color);
		//method 4 indexof() index of first occurance of element
		System.out.println(color.indexOf("green"));
		//method 5 lastindexof() last occurance of element
		System.out.println(color.lastIndexOf("green"));
		//mthod 6 remove ()
		color.remove(3);
		System.out.println(color);
		
		//method 7 contains() check wether elemnt is contained or not
		System.out.println(color.contains("pink"));
		System.out.println(color.contains("red"));
		
		//method 8 isempty() to check array empty or not
		System.out.println(color.isEmpty());
		
		//method 9 size() to find the size of list
		System.out.println(color.size());
	}

}
