package bankManagement;

import java.util.ArrayList;
import java.util.List;

public class Bank {
		// properties
		private int bankCode;
		public String name;
		List<Account> accounts = new ArrayList<>();
		public String type;
		// constructor
		public Bank(int bankCode, String name,String type) {
			this.bankCode=bankCode;
			this.name=name;
			this.type=type;
		}
		public int getBankCode() {
			return this.bankCode; 
		}
		public void getBankDetails() {
			System.out.println("Bank Name: "+ this.name+"\nBank Code: " +this.bankCode);
		}
}
