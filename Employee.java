package Class28;

public class Employee {
	
	int id;String name;double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}

	public static void main(String[] args) {
		// 
		Employee c1=new Employee(11,"Sarathi",30000);
		System.out.println("Employee Details:");
		c1.display();
	}

}
