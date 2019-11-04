
class Money {
	private int amount;
	private String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	static public Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	static public Money franc(int amount) {
		return new Money(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}

}
