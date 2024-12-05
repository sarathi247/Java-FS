package Java_Test;

abstract class Shap{
	abstract double Area();
	abstract double Parimeter();
}




class Rectangle extends Shap{
	double base,hight;
	
	public Rectangle(double base,double hight){
		this.base=base;
		this.hight=hight;
	}
	double Area() {
		return base*hight;
	}
	double Parimeter() {
		return 2*(base+hight);
	}
	
	
}


class circle extends Shap{
	
	double radios;
	
	public circle(double radios){
		this.radios=radios;
		
	}
	
	double Area(){
		return Math.PI*radios*radios;
	}
	double Parimeter() {
		return 2*Math.PI*radios;
	}
	
}

class trainagle extends Shap{
	double a,b,c;
	public trainagle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	double Area(){
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	double Parimeter() {
		return a+b+c;
	}
}



public class Area_Parimeter {

	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle(2,3);
		System.out.println("Ractangle:");
		System.out.println("Area of rectangle:"+obj.Area());
		System.out.println("Parimeter of rectangle:"+obj.Parimeter());
		
		circle obj2=new circle(4);
		System.out.println("Circle:");
		System.out.println("Area of Cricle:"+obj2.Area());
		System.out.println("Parimeter of Cricle:"+obj2.Parimeter());
		
		
		trainagle obj3=new trainagle(2,3,4);
		System.out.println("Trainagle:");
		System.out.println("Area of trainagle:"+obj3.Area());
		System.out.println("Parimeter of trainagle"+obj3.Parimeter());
		
	}

}
