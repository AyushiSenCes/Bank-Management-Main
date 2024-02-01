package bankManagement;
import java.util.*;
public class Main {
	public static void main(String Args[]) {
		Bank BOI= new Bank(101,"Bank Of India","Govt");
		// taking 5 accounts details for creating accounts
		BOI.getBankDetails();
		boolean flag=true;
		
		while(flag) {
			showInstructions();
			Scanner scan= new Scanner(System.in);
			int inputChoise=scan.nextInt();
			switch(inputChoise) {
			case 1: getAllAccountDetails(BOI.accounts);
			break;
			case 2: createAccount(BOI.accounts);
			break;
			case 3: getAccountdetailsByAccountNumber(BOI.accounts);
			break;
			case 4: depositeMoney(BOI.accounts);
			break;
			case 5: withdrawMoney(BOI.accounts);
			break;
			case 0: flag=false;
			break;
			default : System.out.println("Enter a valid Choise...");
			break;
			}
		}
	}
	
	
	
	public static void showInstructions() { 
		System.out.println("##############Welcome to Bank Of India#############");
		System.out.println("##############Instructions            #############");
		System.out.println("1: for printing all account details.");
		System.out.println("2: to create an account.");
		System.out.println("3: Get Account detail by account Number.");
		System.out.println("4: to Deposite balance.");
		System.out.println("5: to withdraw Money");
		System.out.println("0: to exit the system.");
	}
	public static void getAllAccountDetails(List<Account> accounts) { 
		if(accounts.size()>0) {
			for (Account acc : accounts) {
				acc.getDetails();
			}
		}else {
			System.out.println("Accounts are not available");
		}
			
	}
	public static void createAccount(List<Account> accounts) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Owner Name for Account:");
		String ownerName=scan.nextLine();
		Account acc=new Account(ownerName);
		accounts.add(acc);
		System.out.println("Account Created successfully");
		acc.getDetails();
	}
	public static void getAccountdetailsByAccountNumber(List<Account> accounts) {
		
		System.out.println("geting Account Details....");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Account Number :");
		int accountNumber = scan.nextInt();
		boolean flag = false;
		for(Account obj : accounts) {
		   int a = obj.getAccountNumber();
		   if(accountNumber == a) {
			   obj.getDetails();
			   flag = true;
			  break;
		   }
	   }
	if(flag == false) {
		System.out.println("Account not found");
	}
	
	}
	public static void depositeMoney(List<Account> accounts) { // int arr[5]={1,2,3,4,5,6}
		System.out.println("Deposite money in the account....");// Account arr[5]={acc,acc,acc};
		Scanner scan= new Scanner(System.in);//  for(int i:arr){}
		System.out.println("Enter Account Number :");
		int accountNumber = scan.nextInt();
		System.out.println("Enter Depositing Amount:");
		double amount = scan.nextDouble();
		
		boolean flag = false;
		if(amount>0) {
			for(Account acc : accounts) {
				   int a = acc.getAccountNumber();
				   if(accountNumber == a) {
					   acc.deposite(amount);
					   flag = true;
					  System.out.println("Deposite succfull");
					  acc.getDetails();
					  break;
				   }
			   }
		}
		else {
			System.out.println("amount can't be negative,please enter possitive amount");
		}
	if(flag == false) {
		System.out.println("Account not found");
	}
	}
	public static void withdrawMoney(List<Account> accounts) { 
		System.out.println("Withdraw money in the account....");
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Account Number :");
		int accountNumber = scan.nextInt();
		System.out.println("Enter Withdrawl Amount:");
		double amount = scan.nextDouble();
		
		boolean flag = false;
		if(amount>0) {
	   for(Account acc : accounts) {
		   int a = acc.getAccountNumber();
		   if(accountNumber == a) {
			   acc.withdraw(amount);
			   flag = true;
			  acc.getDetails();
			  break;
		   }
	   }
		}
		else {
			System.out.println("amount can't be negative,please enter possitive amount");
		}
	if(flag == false) {
		System.out.println("Account not found");
	}
	}
	
}
