package collections;

import java.util.*;

public class Setmethods {

	public static void main(String[] args) {
	   Set<String> s1 =new HashSet<String>();
	   s1.add("apple");
	   s1.add("grape");
	   s1.add("banana");
	   System.out.println(s1);
	   
	   
	   Set<String> s2=new HashSet<String>();
	   s2.add("red");
	   s2.add("purple");
	   s2.add("yellow");
	   //all methods in set will work in list
	   //method 1 addAll()
	   
	   s1.addAll(s2);
	   System.out.println(s1);
	   System.out.println(s2);
	   
	   //method 2 containsAll() wether s2 contains all elemnts of s1 & vice cersa
	   
	   System.out.println(s1.containsAll(s2));
	   System.out.println(s2.containsAll(s1));
	   
	   //method 3  removeAll() remove s2 elements from s1
	   s1.removeAll(s2);
	   System.out.println(s1);
	   System.out.println(s2);
	   
	}


}