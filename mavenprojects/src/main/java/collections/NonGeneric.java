package collections;

import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
	List li= new LinkedList();//ArrayList same as LinkedList
	li.add("hello");
	li.add(3);
	li.add("b");
		
	System.out.println(li);
	
	Set se= new HashSet();//TreeSet only works in generic
	se.add("Hi");
	se.add(5);
	se.add('v');
	System.out.println(se);
	
	}

}
