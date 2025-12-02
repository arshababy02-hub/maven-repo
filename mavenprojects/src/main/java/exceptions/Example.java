package exceptions;

public class Example {

	public static void main(String[] args) {
		try {   //try-catch,try-finally,try-catch-finally
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println(c);
	}
		catch(ArithmeticException e)
		{    // e is  indicationg error
			
		
	System.out.println("we cannot divide a number by 0");
	}
	finally {
		System.out.println("this block must be executed");
		
	}
	}
}
	


