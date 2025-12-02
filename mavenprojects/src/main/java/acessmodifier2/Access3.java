package acessmodifier2;

import accessmodifier.Acess1;

public class Access3 extends Acess1{

	public static void main(String[] args) {
		Acess1 a=new Acess1();
		a.display1();
		/*a.display2();
		a.display3();
		a.display4();*/
		Access3 a3= new Access3();
		a3.display1();
		//a3.display2(); private
		a3.display3();
		//a3.display4();  default
	}

}
