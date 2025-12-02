package superkeywrd;

public class ConstructorC extends ConstructorP{
    public  ConstructorC () {
        super(10);
    	System.out.println("child constructore is called");
   
    }
	public static void main(String[] args) {
		ConstructorC obj=new ConstructorC();
		
	}

}
