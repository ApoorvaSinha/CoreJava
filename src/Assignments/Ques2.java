package Assignments;

import java.time.*;
import java.sql.*;

class Account {
	double accBalance;
	String accHolder;
	final int rateOfInterest = 9;
	String pan_no;
	boolean optedforMobilebanking,optedfornetbanking;
	@Override
	public String toString() {
		return "Banks [accBalance=" + accBalance + ", accHolder=" + accHolder + "]";
	}
	private Timestamp getCurrentTimestamp() {
		long datetime=System.currentTimeMillis();
		return new Timestamp(datetime);
	}
	
	void debit(double amt) {
		if(amt<=accBalance && amt>0) {
			
		accBalance=accBalance-amt;
		// System.out.println("Debit amt: "+ amt+ "\tBalance: "+accBalance);
		sendTransaction(amt,0);
		}
		else {
			System.out.println("Debit amount exceeds account balance or invalid!!");
		}
		
	}
	void credit(double amt) {
		//return amt>0?accBalance+amt:accBalance;
		//accBalance=accBalance+amt;
		 //System.out.println("Credit amt: "+ amt+ "\tBalance: "+accBalance);
		if(amt>0)
			accBalance+=amt;
		sendTransaction(0,amt);
	}
	public double getAccBalance(){
		
		return accBalance;
	}
	
	 private void sendTransaction(double debit,double credit){
		 
		
		 
		if(debit>0)
			System.out.println("Debit Amount : "+ debit+ "\tCurrent Balance : "+accBalance+" on " + getCurrentTimestamp().toString().split(" ")[0]+" at time "+ getCurrentTimestamp().toString().split(" ")[1]
					+" Opted for Mobile Banking: "+ optedforMobilebanking +" Opted for Net Banking: "+optedfornetbanking );
		else
			System.out.println("credit Amount : "+ credit+ "\tCurrent Balance : "+accBalance + "\tTime: "+ getCurrentTimestamp() +" Opted for Mobile Banking: "+ optedforMobilebanking +" Opted for Net Banking: "+optedfornetbanking);
		
	}
	 double calculateInterest(double amt) {
		 accBalance*=0.09;
		 return accBalance;
		 
	 }
	public Account(boolean optedforMobilebanking, boolean optedfornetbanking) {
		super();
		this.optedforMobilebanking = optedforMobilebanking;
		this.optedfornetbanking = optedfornetbanking;
	}
	
}

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account(true,true);
		Account ac2 = new Account(false,true);
		
		ac1.accBalance=56972.34;
		ac1.accHolder="Priya";
		
		ac2.accBalance=87323.31;
		ac2.accHolder="Riya";
		
		System.out.println("Banks details : "+ ac1.accBalance +"\t"+ac1.accHolder);
		System.out.println("Banks details : "+ ac2.accBalance +"\t"+ac2.accHolder);
		
		System.out.println(ac1.toString());
		System.out.println(ac2);
		ac1.debit(3400);
		ac1.credit(3200);
		ac2.debit(4500);
		//System.out.println(ac1.credit(-250));
		
		System.out.println(ac2.getAccBalance());
		System.out.println(ac1.calculateInterest(56972.34));
		
		
		
	}

}
//rateofInterest calculateInterest optedformobilebanking boolean optedfornetbanking boolean string panno.
