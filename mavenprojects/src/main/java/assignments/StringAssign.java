package assignments;

public class StringAssign {

	public static void main(String[] args) {
		String s="java";
		StringBuilder str=new StringBuilder(s);
		String rev=str.reverse().toString();
		if (rev.equals(s)) {
			System.out.println(s+ " is a palindrome");
		}
		else
		{
			System.out.println(s+ " not a palindrome");
		}
	}

}
