package basic;

public class methodoverloading 
{
	void add()
	{
		System.out.println("1234");
	}
	void add(double a)
	{
		System.out.println(a+3);
	}
	 int add(int v)
	{
		return 5;
		
	}
	public static void main(String[] args)
	{
		
		
		methodoverloading m1=new methodoverloading ();
		m1.add();
		m1.add(2.1);
		m1.add(6);
	}

}
