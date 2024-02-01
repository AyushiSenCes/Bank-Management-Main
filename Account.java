package bankManagement;
import java.util.*;
public class Account {
	// instance variable
	private String owner;
	private int accountNo;
	private double balance;
	//static variable
	static int newAccountNumber=1000;
	//constructor
	public Account(String owner) {
		this.owner=owner;
		this.accountNo=Account.newAccountNumber;
		this.balance=100d;
		Account.newAccountNumber++;
	}
	//get account details
	public void getDetails() {
		System.out.println("########Account Detaiils########\nAccount Owner:"+this.owner+"\nAccount Number:"+this.accountNo+"\n"+"Balance:"+this.balance);
	}
	public void deposite(double amount) {
		this.balance=this.balance+amount;
		System.out.println("Accout No. "+this.accountNo+" has credited "+amount+"\nCurrent balance:"+this.balance);
	}
	public void withdraw(double amount) {
		if(amount<=this.balance) {
		this.balance=this.balance-amount;//withdraw
		System.out.println("Accout No. "+this.accountNo+" has debited "+amount+"\nCurrent balance:"+this.balance);
	}
		else {
			System.out.println("amount should be smaller or equal to current balanch");
		}
	}
	public int getAccountNumber() {
		return this.accountNo;
	}
	
}
