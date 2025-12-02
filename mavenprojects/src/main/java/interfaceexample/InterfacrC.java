package interfaceexample;

public class InterfacrC  implements InterfaceP{//
	public void print() {
		System.out.println("abstract methode in child from parent");
	}
	public void  display(String c) {
		System.out.println("parameterized Abstract method"+c);
	}

	public static void main(String[] args) {
		InterfaceP obj=new InterfacrC();
		obj.print();
		obj.display("in child cls");
	}
	

}
