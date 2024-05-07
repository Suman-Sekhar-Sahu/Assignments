package basic;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment99 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int n1=sc.nextInt();
			String name[]=new String[n1];
			name[0]="Ram";
			name[1]="Sita";
			name[2]="Laxman";
			name[3]="Hanuman";
			System.out.println(Arrays.toString(name));
		}
		catch(InputMismatchException a1)
		{
			System.out.println("input should be intiger");
		}
		catch(ArrayIndexOutOfBoundsException a2)
		
		{
			System.out.println("input handeled");
		}
		finally
		{
			System.out.println("thanks for visiting us");
		}
		}
	

	}