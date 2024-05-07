package basic;
abstract class Wallmart
{
	abstract void myntra();
	abstract void flipkart();
	 void amazone()
	{
		System.out.println("Amazone");
	}
}

abstract class Onlineshopping extends Wallmart
{
abstract void clothes();
abstract void electronic();
void shopping()
{
	System.out.println("buying thrugh online");
}
class Suman extends Onlineshopping
{
void myntra()
{
	System.out.println("buying through myntra");
}
void flipkart()
{
	System.out.println("buying through flipkart");
}
@Override
void clothes() {
	System.out.println("buying clothss");
	
}
@Override
void electronic() {
	System.out.println("buying electronic online");
	
}
}
class Mainclass
{
		

	
	public static void main(String[] args) 
	{
		Suman s1= new Suman();
		s1.amazone();
	}
}
}
