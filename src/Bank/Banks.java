package Bank;

import java.util.Scanner;

class Account {
	private String accHolder;
	private double accBalance;
	private int accNumber = 0;
	static double rateOfInterest = 5.65;
	private String pan;
	

	public Account() {
		super();
	}


	public Account(String accHolder, double accBalance, int accNumber, String pan) {
		super();
		this.accHolder = accHolder;
		this.accBalance = accBalance;
		this.accNumber = accNumber;
		this.pan = pan;
	}



	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	@Override
	public String toString() {
		return "Account [accHolder=" + accHolder + ", accBalance=" + accBalance + ", accNumber=" + accNumber + ", PAN="
				+ pan + "]";
	}

	double withdraw(double amount) {

		if (amount <= accBalance && amount > 0) {

			accBalance -= amount;
			
		} else {
			System.out.println("Debit amount exceeds account balance or invalid!!");
		}
		return accBalance;
	}

	double deposit(double amount) {
		if (amount > 0)
			accBalance += amount;
		return accBalance;
	}

	double calculateYearlyInterest(double amount) {
		accBalance *= 0.09;
		return accBalance;

	}

	boolean panLinked() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you have pancard linked[Y/N]: ");
		String decision=sc.next();
		if(decision.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
		
	}

}

class SBIAccount extends Account {
	
	Account ac1=new Account();
	public SBIAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void linkPan() {
		
			ac1.setAccBalance(ac1.getAccBalance()+500);
			System.out.println("Pancard linked. Amount 500/- credited to acc : "+ ac1.getAccNumber()+" Current balance: "+ac1.getAccBalance());
		
	}

	void displayFeatures(){
		System.out.println("Panlinked bonus 1000/- !\nLink Pan now and get 500/- as bonus !");
		
	}

	public SBIAccount(String accHolder, double accBalance, int accNumber, String pan) {
		super(accHolder, accBalance, accNumber, pan);
		// TODO Auto-generated constructor stub

		if(ac1.panLinked())
		{
			ac1.setAccBalance(ac1.getAccBalance()+1000);
		}

	}
	
	
	

}

class ICICIAccount extends Account {

	

}

public class Banks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account();
		SBIAccount sbiac1=new SBIAccount("Tom",45678.09,123456,"GHJ1234KL");
		System.out.println("Balance: "+ sbiac1.getAccBalance());
		System.out.println("Withdrawn amount current balance: "+sbiac1.withdraw(3400));
		System.out.println("Deposited amount current balance: "+sbiac1.deposit(3200));
		System.out.println("Calculated interest: "+sbiac1.calculateYearlyInterest(sbiac1.getAccBalance()));
		sbiac1.linkPan();
		sbiac1.displayFeatures();
	}

}
