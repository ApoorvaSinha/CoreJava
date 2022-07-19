package Discussion95;

import java.sql.Date;

class Customer{
	private String name;
	private Date dob;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}

class Account{
	
	private String accHolder;
	private int accNumber;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(String accHolder, int accNumber) {
		super();
		this.accHolder = accHolder;
		this.accNumber = accNumber;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
}

class RBI {
	
	
	
	public void setname(){
		Account a=new Account();
		Customer c=new Customer();
		c.setName("Jack");
	}
	
}

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
