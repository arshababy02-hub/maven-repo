package superkeywrd;

public class InstanceC extends InstantP{
	int ip= 2010;
	public void print() {
		System.out.println(ip);
		System.out.println(super.ip);
	}
	public static void main(String[] args) {
		InstanceC obj= new InstanceC();
		obj.print();

	}

}
