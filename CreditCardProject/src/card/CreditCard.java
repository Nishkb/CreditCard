package card;

public class CreditCard {

	private String customer;
	private String issuingBank;
	private long accountIdentifier;
	private double creditLimit;
	public double currentBalance;

	public CreditCard() {
	}

	public CreditCard(String customer, String issuingBank, int accountIdentifier, double creditLimit,
			double currentBalance) {
		this.customer = customer;
		this.issuingBank = issuingBank;
		this.accountIdentifier = accountIdentifier;
		this.creditLimit = creditLimit;
		this.currentBalance = currentBalance;
	}

	// Accessor methods
	public String getCustomer() {
		return this.customer;
	}

	public String getIssuingBank() {
		return this.issuingBank;
	}

	public long getAccountIdentifier() {
		return this.accountIdentifier;
	}

	public double getCreditLimit() {
		return this.creditLimit;
	}

	public double getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	// update methods
	public boolean isCharged(double price) {
		if (price + currentBalance > creditLimit) {
			return false;
		} else {
			currentBalance += price;
			return true;
		}
	}
	
	public void pay(double amount) {
		if (amount >= 0) {
			currentBalance -= amount;
		}
	}

	// toString method
	public String toString() {
	
		return "Customer : " + this.customer + "\nBank : " + this.issuingBank + "\nAccount : "
				+ this.accountIdentifier + "\nCredit-Limit : " + this.creditLimit + "\nBalance : "
				+ this.currentBalance;
	}
	
	public String toString(boolean isCharged) {
		if(!isCharged) {
		 return "The credit limit has been reached please pay the bill first!"; 
		}
		
		return toString();
	}

	public boolean isOver() {

		return this.currentBalance >= this.creditLimit ? true : false;
	}

}
