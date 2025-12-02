package assignments;

public class Bank {
	private int pin;
	private int  balance=  5000;
	public void setpin(int pin) {
		this.pin=pin;
		
	}
public boolean validatepin() {
	if (pin == 1001 || pin == 1234 || pin == 1212) {
		return true;
	}
	else {
		return false;
	}
}

public void withdraw(int amount) {
	if(amount<= balance) {
		balance= balance - amount;
		System.out.println("withdrawal successfull");
	}
	else {
		System.out.println("insufficient balance");
	}
}

}

