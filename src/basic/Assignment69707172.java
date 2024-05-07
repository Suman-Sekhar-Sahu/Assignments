package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment69707172
{
	static int count=0;
	static int digit=0;
	static int space=0;
	static int speciachar=0;

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
			
		
			if(Character.isAlphabetic(c1[i])==true)
			{
				count++;
			}
			if(Character.isSpaceChar(c1[i])==true)
			{
				space++;
			}
		
	}
		System.out.println("count of Alphabet is->"+" "+count);
		System.out.println("count of digit is->"+" "+digit);
		System.out.println("count of space is->"+" "+space);
		int a= count;
		int b= digit;
		int c= space;
		int d=(s1.length())-(a+b+c);
		System.out.println("count of specialchar is->"+" "+d);



	}
}


