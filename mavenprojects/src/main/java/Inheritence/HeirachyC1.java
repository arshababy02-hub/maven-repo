package Inheritence;

public class HeirachyC1 extends HeirachyP {
public void draw() {
	System.out.println("c1 draw");
}
	public static void main(String[] args) {
		
		HeirachyC1 obj= new HeirachyC1();
		obj.dance();
		obj.draw();
	}

}
