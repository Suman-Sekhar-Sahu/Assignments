package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name[]= new String[4];
		for(int i=0;i<4;i++)
		{
		
			name[i]=sc.next();
			
		}
		System.out.println(Arrays.toString(name));
	}
	
	
	

}
