package Inheritence;

public class SingleC extends SingleP{

	public void sing() {
		System.out.println("child sing");
	}

	public static void main(String[] args) {
	
     SingleC obj=new SingleC();
     obj.write();
     obj.draw();
     obj.sing();
	}

}
