package assignments;

public class HDFC implements RBI{
	
  public  void recurringdeposit(int year,double amount){
	  int n=year*12;
	  double p=amount;
	  double r=InterestRate;
	  double maturityamount =p*n+(p*n*(n+1)/2.0)*(r/(12*100));
	  System.out.println("maturity amount is "+maturityamount);
  }
  public static void main(String[] args) {
	  RBI obj=new HDFC();
	  obj.reccurringDeposit(1, 1000);
  }
  
}
