package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayequal{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name[]= new String[4];
		System.out.println("starting of string 1");
		for(int i=0;i<4;i++)
		{
		
			name[i]=sc.next();
			
		}
		System.out.println(Arrays.toString(name));
		
		String name1[]= new String[4];
		System.out.println("statring of string 2");
		for(int a=0;a<4;a++)
			
		{
		
			name1[a]=sc.next();
			
		}
		
		System.out.println(Arrays.toString(name1));
		if(Arrays.equals(name, name1)==true)
				
				{
			System.out.println("entered strings are same");
				}
		else
		{
			System.out.println("entered strings are not same");
		}
	}

}
