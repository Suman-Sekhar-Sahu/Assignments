package basic;

public class constructor 
{
	constructor()// Non parameterized constructor, name same as class name.
	{
		int a=100;
		int b=200;
		int sum= a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		new constructor();// caling non para method.
	}

}
