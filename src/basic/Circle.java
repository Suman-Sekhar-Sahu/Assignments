package basic;

public class Circle {
	final double pi= 3.14;
	int r= 5;
	void area()
	{
		System.out.println("area of circe is" + pi*r*r);
	}
	void Circumference()
	{
		System.out.println("Circumference of circle is" + 2*pi*r);
	}

	public static void main(String[] args) 
	{
		
		Circle c1=new Circle();
		c1.r=10;
		c1.area();
		c1.Circumference();
	}

}
