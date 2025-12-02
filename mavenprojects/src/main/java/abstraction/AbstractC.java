package abstraction;

public class AbstractC extends AbstractP{

	public  void print() {//no need to use abstract keyword in child
		System.out.println("absttract method in parent from child cls");
	}
	public static void main(String[] args) {
		/*AbstractC obj=new AbstractC();
		obj.print();
		obj.display();
	*/
		//other methode to create an object
		AbstractP obj =new AbstractC();
		obj.print();
		obj.display();
	}

}
