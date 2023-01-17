package card;

public class PredatoryCreditCard extends CreditCard{
	private double apr;
	
	public PredatoryCreditCard() {}
	
	public PredatoryCreditCard(String customer, String issuingBank, int accountIdentifier, double creditLimit,
			double currentBalance, double rate) {
		
		super(customer, issuingBank, accountIdentifier, creditLimit, currentBalance);
		this.apr = rate;
	}
	
	public void processMonth() {
		if(currentBalance > 0) {
			double monthlyFactor = Math.pow(1 + apr,  1.0/12);
			currentBalance *= monthlyFactor;
		}
	}
	
	public boolean charge(double price) {
		boolean isSuccess = super.isCharged(price);
		if(!isSuccess)
			currentBalance += 5;
			
		return isSuccess;
	}
}
