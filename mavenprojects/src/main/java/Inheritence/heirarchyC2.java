package Inheritence;

public class heirarchyC2 extends HeirachyP {
	public void write() {
		System.out.println("c2 write");
	}

	public static void main(String[] args) {
		
		heirarchyC2 obj=new heirarchyC2();
		obj.dance();
		obj.write();
		
	}

}
