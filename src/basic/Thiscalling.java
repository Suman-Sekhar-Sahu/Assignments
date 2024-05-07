package basic;

public class Thiscalling 
{
Thiscalling()
{   
	this(0.1);
	System.out.println("non");
}
Thiscalling(int a)
{
	System.out.println("int");
}
Thiscalling(double b)
{	
	this(89);
	System.out.println("double");
	
}
	public static void main(String[] args) 
	{
		new Thiscalling();
	}

}
