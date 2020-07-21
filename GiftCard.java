package Assignment3;

public class GiftCard {
	private long cardnumber;
   	private double balance;
    	private boolean active;
    
	public GiftCard(long cardnumber, double balance, boolean active) {
		super();
		this.cardnumber = cardnumber;
		this.balance = balance;
		this.active = active;
	}
	public GiftCard()
	{
	 this.balance=0;
	}
	public long getcardnumber() {
		return cardnumber;
	}
	public void setcardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void rechargeCard(double amount) {
		if(this.active==true)
			this.balance+=amount;
			
	}
	public void swipeCard(double amount) {
		if(this.active==true)
			this.balance-=amount;
	}
}