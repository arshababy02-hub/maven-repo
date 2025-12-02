package assignments;

public class Contract extends Employee{
	private int workinghrs;
	Contract(int payment,int workinghrs) {
		super(payment);
		this.workinghrs=workinghrs;
		
	}
	int calculatesalary() {
		return payment*workinghrs;
	}

}
