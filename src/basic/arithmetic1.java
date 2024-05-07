package basic;

import java.util.Scanner;

public class arithmetic1
{
	void add()
	{
		Scanner s1= new Scanner(System.in);
		int n1 = s1.nextInt();
		int n2 = s1.nextInt();
	
		System.out.println(n1+n2);
		
	}
	void sub()
	{
		Scanner s2= new Scanner(System.in);
		int a1= s2.nextInt();
		int a2= s2.nextInt();
		System.out.println(a1-a2);
	}
	public static void main(String[] args) 
	{
		arithmetic1 w1= new arithmetic1();
				w1.add();
				w1.sub();
	}

}
