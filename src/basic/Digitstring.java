package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Digitstring
{
static int digit=0;
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		char[] c1= s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(c1[i])==true)
			{
				digit++;
			}
			
		}
		System.out.println(digit);

	}

}
