package assignments;

public abstract class Employee {
	int payment;
	Employee(int payment){
	this.payment=payment;
	}
	abstract int calculatesalary();

}
