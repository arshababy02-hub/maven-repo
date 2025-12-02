package accessmodifier;

public class Acess1 {
	public void display1() {
System.out.println("public");
		
	}
private void display2() {
		System.out.println("private");
	}
protected void display3() {
	System.out.println("protected");
	
}
 void display4() {
	 System.out.println("default");
	
}
	public static void main(String[] args) {
		Acess1 a=new Acess1();
		a.display1();
		a.display2();
		a.display3();
		a.display4();
	}

}
