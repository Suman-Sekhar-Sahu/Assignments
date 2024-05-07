package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment69

{
	static int Count=0;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		char[] c1= s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(c1[i])==true)
			{
				Count++;
			}
			
		}
		System.out.println(Count);


	}

}
