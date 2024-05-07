package basic;

import java.util.Scanner;

public class Assignment12
{

	public static void main(String[] args)
	{
	Scanner s1= new Scanner(System.in);
	int a= s1.nextInt();
	System.out.println(a);
	byte b= s1.nextByte();
	System.out.println(b);
	short c= s1.nextShort();
	System.out.println(c);
	long d= s1.nextLong();
	System.out.println(d);
	boolean e= s1.nextBoolean();
	System.out.println(e);
	String f= s1.next();
	System.out.println(f);
	float g= s1.nextFloat();
	System.out.println(g);
	double h= s1.nextDouble();
	System.out.println(h);
	s1.close();
	}

}
