package superkeywrd;

public class MethodC extends MethodP {
        public void draw() {
        	System.out.println("child draw");
        	super.write();
        }
	public static void main(String[] args) {
	
		MethodC obj= new MethodC();
		obj.draw();
	}

}
