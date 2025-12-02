package aggregation;

public class Author {
     String name;
     int pincode;
     public  Author(String name,int pincode) {
    	 this.name =name;
    	 this.pincode=pincode;
    	 
     }
public void display() {
	System.out.println("the name of the author is"+ name);
	System.out.println("the pincode  is"+ pincode);

}


}

