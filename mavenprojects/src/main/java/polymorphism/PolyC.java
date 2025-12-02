package polymorphism;

public class PolyC extends polyP{
	public void display() {//methode overriding
		System.out.println("child class");
		super.display();
	}
public void sum(int a,int b,int c) {//method overloading
	int d= a+b+c;
    System.out.println("sum of a , b& c is"+d);
    super.sum(10, 20);
}
	public static void main(String[] args) {
		PolyC pc= new PolyC();
		pc.display();
		
		pc.sum(10, 20,30);
	}

}
