package basic;

public class Assignment48 
{
	int a=100;
	int b=200;
	int c= 300;
	
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-c);
	}
	 void mul()
	{
		System.out.println(b*c);
	}
	 void modulos()
	 {
		 System.out.println(a%c);
	 }
	public static void main(String[] args)
	{
		
		Assignment48  g1= new Assignment48();
		g1. a=90;
		g1.add();
		g1.sub();
		g1.mul();
		g1.modulos();
		

	}

}
