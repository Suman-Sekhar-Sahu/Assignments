package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment75 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		if(s1.length()!= s2.length())
		{
			System.out.println("not Anagram");
		}
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		Arrays.sort(c2);
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		if(Arrays.equals(c1, c2)==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
