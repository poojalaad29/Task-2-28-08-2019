
public class SBI implements ATM {

	@Override
	public void WithDrawl() {
		System.out.println("Withdrawl from SBI ATM");

	}

	@Override
	public void Deposit() {
		System.out.println("Deposit from SBI ATM");

	}

	@Override
	public void BalanceEnquiry() {
		System.out.println("Balance Enquiry from SBI ATM");
		
	}
	
	@Override
	public void GreenOTP() {
		System.out.println("Green OTP from SBI ATM");
		
	}
	
}
