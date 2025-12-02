package assignments;

public class User {

	public static void main(String[] args) {
		Bank obj= new Bank();
		obj.setpin(1001);
		if(obj.validatepin()) {
			System.out.println("pin correct");
			obj.withdraw(2000);
		}
		
		else {
			System.out.println("pin incorrect");
		}

	}

}
