package Assignments;

import java.util.Objects;

class Person{
	private String name;
	
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
}

class Employee extends Person{
	
	private double salary;
	private int year;
	private String uan;
	
	
	
	
	public Employee(String name) {
		super(name);
	
	}

	public Employee(String name, double salary, int year, String uan) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.uan = uan;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getUan() {
		return uan;
	}
	public void setUan(String uan) {
		this.uan = uan;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", year=" + year + ", uan=" + uan + ", name=" + getName() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary, uan, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(uan, other.uan) && year == other.year;
	}
	
	
	
	
}

public class EmpPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("Kal");
		Person p2=new Person("Rio");
		Employee emp1=new Employee("Jack",56789.56,5,"110BGHJ7890");
		Employee emp2=new Employee("Rio");
		emp2.setSalary(87654.90);
		emp2.setUan("112HJDA9876");
		emp2.setYear(8);
		Employee emp3=new Employee("Jack",56789.56,5,"110BGHJ7890");
		Employee emp4=emp1;
		System.out.println(emp1);
		System.out.println(emp2);
		
		if(emp1.equals(emp3)) {
			System.out.println("Equal employees !");
		}
		else {
			System.out.println("Not Equal employees!");
		}

		if(p2.getName().equals(emp2.getName())) {
			System.out.println("Person works as employee");
		}
		else{
			System.out.println("Person doesn't works as employee");
		}
		
	}

	
}
