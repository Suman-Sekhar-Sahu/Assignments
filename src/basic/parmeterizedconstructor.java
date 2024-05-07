package basic;

public class parmeterizedconstructor 
{
	parmeterizedconstructor() // non para
	{
		int a=100;
		int b=200;
		int sum= a+b;
		System.out.println(sum);
	}
	parmeterizedconstructor(double b)//para
	{
		System.out.println(3.1);
	}
	public static void main(String[] args) 
	{
		new parmeterizedconstructor();// calling non para
		new parmeterizedconstructor(4.1);// calling para
	}

}
