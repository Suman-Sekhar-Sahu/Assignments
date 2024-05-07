package basic;

public class Accessspecifier
{
	public void add()
	{
		System.out.println(1);
	}
	protected void sub()
	{
		System.out.println(2);
	}
	private void mod()
	{
		System.out.println(3);
	}
	 void div()
	{
		System.out.println(4);
	}

	public static void main(String[] args) 
	{
		Accessspecifier a1= new Accessspecifier();
		a1.mod();
		a1.add();
		a1.sub();
		a1.div();
	}

}
