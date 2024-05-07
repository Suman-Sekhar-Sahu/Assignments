package basic;

public class constructoroverloading
{
	constructoroverloading()// method
	{
		int a=100;
		int b=200;
		int sum= a+b;
		System.out.println(sum);
	}
	constructoroverloading(String a)// method
	{
		System.out.println("Suman");
	
	}
	constructoroverloading(int a,float b,int i,double e,boolean f)// method
	{
		System.out.println("charters");
	}
	
		
	
	public static void main(String[] args) // method
	{
		
		new constructoroverloading();//non pra
		new constructoroverloading("suman");// para
		new constructoroverloading(12345,12.56f,23,2.3,true);// para
		
	}
	
}
