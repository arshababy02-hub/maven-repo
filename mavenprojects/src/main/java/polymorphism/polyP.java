package polymorphism;
//this contains examble for over riding and over loading..display for overriding..and sum for overloading
public class polyP {
	public void display() {//methode overriding
		System.out.println("parent class");
		
	}
public void sum(int a,int b) {//method overloading
	int c= a+b;
    System.out.println("sum of a & b is"+c);
}
}
