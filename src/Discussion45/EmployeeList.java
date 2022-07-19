package Discussion45;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee {
    protected long   employeeId;
    protected String firstName;
    protected String lastName;
       
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(long employeeId, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public long getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public int hashCode() {
		return Objects.hash(employeeId, firstName, lastName);
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
		return employeeId == other.employeeId && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
    
    
    
}

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1, "Jack", "william"));
		emp.add(new Employee(2, "Bill", "Thomas"));
		emp.add(new Employee(1, "Jack", "william"));
		emp.add(new Employee(3, "Tom", "Thomas"));
		
		emp.forEach(System.out::println);
		System.out.println(emp.get(0).equals(emp.get(2)));

	}

}
