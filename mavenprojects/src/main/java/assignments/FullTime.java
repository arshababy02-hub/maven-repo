package assignments;

public class FullTime extends Employee {
	FullTime(int payment){
		super(payment);
	}
int calculatesalary() {
	return payment *8;
}
	
}
