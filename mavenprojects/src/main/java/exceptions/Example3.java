package exceptions;

public class Example3 {
	public void age(int a)throws ArithmeticException {
	if (a>=18) {
		System.out.println("eligible to vote");
}
else {
	throw new ArithmeticException("Access Denied");//custom exception
}
}

public static void main(String[] args) {
	
	Example2 ex=new Example2();
	try {
	ex.age(17);
}

catch(ArithmeticException e) {
	System.out.println("age exception handles");
}
}
}