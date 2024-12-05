package Java_Test;


class course{
	String course_name;
	String instructor;
	int crdits;
	
	course(String course_name,String instructor,int crdits){
		this.course_name=course_name;
		this.instructor=instructor;
		this.crdits=crdits;
	}
	public void display() {
		System.out.println("Course Name:"+course_name);
		System.out.println("Instructor :"+instructor);
		System.out.println("Crdits :"+crdits);
	}
	
}

class OnlineCourse extends course{
	String platform;
	int duration;
	
	OnlineCourse(String course_name,String instructor,int crdits,String platform,int duration){
		super(course_name,instructor,crdits);
		this.platform=platform;
		this.duration=duration;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Platform :"+platform);
		System.out.println("Duraton :"+duration);
		
	}
	
	public boolean ifeligible() {
		return duration>=4;
	}
	
	
	
}


public class Course_ {
	public static void main(String args[]) {
		
		OnlineCourse obj=new OnlineCourse("Python","MohanaPiriya",3,"Guvi",6);
		
		obj.display();
		
		if (obj.ifeligible()) {
			System.out.println("This course is eligible for certificate.");
		}
		else {
			System.out.println("This course is not eligible for certificate.");
		}
		
	}

}
