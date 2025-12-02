package accessmodifier;

public class Access2 extends Acess1{

	public static void main(String[] args) {
		Acess1 a=new Acess1();
		a.display1();
		//a.display2();//its a private methode
		a.display3();
		a.display4();
	}

}
