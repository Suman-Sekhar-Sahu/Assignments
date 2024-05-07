package basic;

import java.util.Scanner;

public class Assignment73 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		if(s1.toUpperCase().equals(reverse.toUpperCase()))
		{
			System.out.println("Entered string is paliendrom");
		}
		else
		{
			System.out.println("entered string is not paliendrom");
		}

	}

}
