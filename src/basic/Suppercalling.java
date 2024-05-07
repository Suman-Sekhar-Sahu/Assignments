package basic;
class Class1
{
	Class1(int a)
	{
		System.out.println("grand parent");
	}
}
class Class2 extends Class1
{
	Class2(String b)
	{
		super(100);
		System.out.println("parent");
	}
}
class Class3 extends Class2
{
	Class3(int a, int b)
	{   
		super("Suman");
		System.out.println("child");
		
	}

	
}

public class Suppercalling {

	public static void main(String[] args) {
		new Class3(12,67);
		

	}

}
