package basic;

public class Assignment97 
{
void start()
{
	System.out.println("veichele start with kick");
}
class car extends Assignment97
{
	void start()
	{
		System.out.println("car start with battery");
	}
}
class bike extends car
{
	void start()
	{
		System.out.println("bike start with self start");
	}
}
class mainclas
{
	public static void main(String[] args) 
	{
		Assignment97 A1= new Assignment97();
		A1.start();

	}
}
	

}
