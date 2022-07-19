package Discussion94;



public class Student {
	
	private String name;
	private int age;
	private String address;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "unknown";
		this.age = 0;
		this.address = "Not available";
	}



	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	void setinfo(String name,int age) {
		this.name=name;
		this.age=age;
	}

	void setinfo(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}

	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student[] stu={new Student(),new Student("Kal",25,"Kormangala"),
		new Student("Jack",34,"Indira Ngar"),new Student()};

stu[0].setinfo("Harry", 32);
stu[3].setinfo("Riya", 41, "Veeranapalya");
for(Student st:stu) {
	System.out.println(st);
}

	}

}
