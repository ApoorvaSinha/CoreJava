package Discussion89;

import java.util.Objects;

class Person {
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

class Employee extends Person {

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
		return "Employee [name=" + getName()+" salary=" + salary + ", year=" + year + ", uan=" + uan  + "]";
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

public class EmpArray {

	public static void bubbleSort(Employee[] emp) {
	    int len = emp.length;
	    for (int i = 0; i < len - 1; ++i) {
	        for (int j = 0; j < len - i - 1; ++j) {
	            if (emp[j + 1].getSalary() < emp[j].getSalary()) {
	                Employee swap = emp[j];
	                emp[j] = emp[j + 1];
	                emp[j + 1] = swap;
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = {new Employee("Rio",76983.23,2020,"ADG110KLS198"),new Employee("Kal",56983.23,2019,"11HGDSH877"),
				new Employee("Jack",86983.23,2021,"98WEQU215321")};
		bubbleSort(emp);
		for(Employee em:emp) {
			System.out.println(em);
		}
		

	}

}
