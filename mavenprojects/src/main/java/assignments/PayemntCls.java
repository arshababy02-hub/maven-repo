package assignments;

public class PayemntCls {

	public static void main(String[] args) {
		Contract c= new Contract(200,6);
		FullTime f =new FullTime(500);
		System.out.println("contract employee slary "+c.calculatesalary());
		System.out.println("full time employee salary "+f.calculatesalary());
	}

}
