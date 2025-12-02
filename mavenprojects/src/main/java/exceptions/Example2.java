package exceptions;

public class Example2 {
	public void age(int a)throws ArithmeticException {
		if (a>=18) {
			System.out.println("eligible to vote");
	}
	else {
		throw new ArithmeticException("Access Denied");//custom exception
	}
}

	public static void main(String[] args) {
		
		Example2 e=new Example2();
		e.age(17);
	}

}
