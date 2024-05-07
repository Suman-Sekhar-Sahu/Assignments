package basic;

import java.util.Scanner;

public class Sumanscanner
{
	static int n1;
	static byte n2;
	static short n3;
	static long n4;
	static boolean n5;
	static String n6;
	static float n7;
	static double n8;
	public static void main(String[] args) 
	{
	
		Scanner sc= new Scanner(System.in);
		n1= sc.nextInt();
		n2= sc.nextByte();
		n3= sc.nextShort();
		n4= sc.nextLong();
		n5= sc.nextBoolean();
		n6= sc.next();
		n7= sc.nextFloat();
		n8= sc.nextDouble();
		sc.close();
		
		int sum =n1 + n2;
		System.out.println(sum);
		System.out.println(n5);
		System.out.println(n6);
		
		
		
	}

}
