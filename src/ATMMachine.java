
public class ATMMachine {
  ATM atm;
  public void SetATM(ATM atm){
		this.atm=atm;
	}
	public void doOperation()
	{
	   atm.Deposit();
	   atm.WithDrawl();
	}
  
	public void BalanceCheck() {
		atm.BalanceEnquiry();
	}
	
	public void GreenOTP() {
		atm.GreenOTP();
	}
  
  public static void main(String args[]){
		ATMMachine atm=new ATMMachine();
		//atm.SetATM(new HDFC());
	    atm.SetATM(new SBI());
		atm.doOperation();
		atm.BalanceCheck();
		atm.GreenOTP();
	}  
}
