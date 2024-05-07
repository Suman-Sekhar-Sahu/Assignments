package basic;
import java.util.Scanner;
public class Assignment46
{
Scanner s1= new Scanner(System.in);
int n1= s1.nextInt();
int n2= s1.nextInt();
void add() 
{
	int sum= n1+n2;
	System.out.println(sum);
}
void mul()
{
	int mul= n1*n2;
	System.out.println(mul);
}
void sub()
{
	int sub= n1-n2;
	System.out.println(sub);
}
void div()
{
	int div= n1/n2;
	System.out.println(div);
}
void mod()
{
	int mod = n1%n2;
	System.out.println(mod);
}
	public static void main(String[] args) 
	{
		Assignment46 a1= new Assignment46();
		a1.add();
		a1.mul();
		a1.sub();
		a1.div();
		a1.mod();
	}

}
