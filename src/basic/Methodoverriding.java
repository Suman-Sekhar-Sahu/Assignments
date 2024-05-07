package basic;
class Flipkart
{
	void login(int q) 
	{
		System.out.println("log in through mobile number");
	}
	
	
}
class Amazon extends Flipkart
{
	void login() 
	{   
		
		System.out.println("Login through email");
		super.login(100);
		
	}
	
}



public class Methodoverriding
{

	public static void main(String[] args) 
	{
		Amazon a1= new Amazon();
		a1.login();
		
	}

}
