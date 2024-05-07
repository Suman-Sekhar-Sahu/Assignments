package inheritance;

public class Wildanimal extends Assignment49
{
void lion()
{
	System.out.println("eating");
}

public static void main(String[] args) 
{
	
	Wildanimal w1= new Wildanimal();
	w1.bird();
	w1.lion();
	
}
}