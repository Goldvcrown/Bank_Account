package bank_account;

public class account {
	public account(String name, int acc_num, int balance) {
		super();
		this.name = name;
		this.acc_num = acc_num;
		this.balance = balance;
	}
	 
	
	
	private String name;
	private int acc_num;
	private int balance;
	public String getName() {
		return name;
	}
	public int getAcc_num() {
		return acc_num;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
