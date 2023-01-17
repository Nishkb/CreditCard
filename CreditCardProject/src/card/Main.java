package card;

public class Main {
	
	public static void main(String[] args) {
		
		CreditCard visa = new CreditCard("Nishk", "Scotia Bank", 11241241, 1000000.00, 9999.99);
		
		if(visa.isOver()) {
			System.out.println("The balance is over limit!");
		}
		
		System.out.println(visa.toString());
		
		visa.setCreditLimit(1000.00);
		
		System.out.println(visa.toString());
		
		System.out.println(visa.isCharged(50));
		
		double payAmount =101;
		if(payAmount < 0) {
			throw new IllegalArgumentException("Payment amount cannot be negative");
		}
		
		visa.pay(payAmount);
		
		boolean isCharge = visa.isCharged(100);
		
		System.out.println(isCharge);
		
		System.out.println(visa.toString(isCharge));
		
	}
	
}
