package Java_Test;

public class Person {

	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.print("Person name:"+name+"\nPerson age:"+age);
	}



	public static void main(String[] args) {
		
		Person obj=new Person("Sarathi",21);
		obj.display();
	}

}
