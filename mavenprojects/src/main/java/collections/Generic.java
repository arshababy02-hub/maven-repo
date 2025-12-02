package collections;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class Generic {

	public static void main(String[] args) {
		List<String> color = new ArrayList<String>();
		color.add("orange");
		color.add("green");
		color.add("pink");
		color.add("green");
		System.out.println(color);//list prints in same order
		//all list methds not work in set
		Set<String>fruit= new HashSet<String>();
		fruit.add("banana");//all set methods works in list
		fruit.add("orange");
		fruit.add("grapes");
		fruit.add("pineapple");
		fruit.add("pineapple");
		System.out.println(fruit);}

}
