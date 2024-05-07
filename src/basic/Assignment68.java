package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment68 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean statment[]= new boolean[3];
		System.out.println("strting of Array1");
		for(int i=0;i<3;i++)
		{
			System.out.println("statment->"+i);
			
		statment[i]=sc.nextBoolean();
	

	}
		System.out.println(Arrays.toString(statment));
		
		boolean statment1[]= new boolean[3];
		System.out.println("strting of Array2");
		for(int i=0;i<3;i++)
		{
			System.out.println("statment->"+i);
			
		statment1[i]=sc.nextBoolean();

	}
		System.out.println(Arrays.toString(statment1));
		if(Arrays.equals(statment, statment1)==true)
		{
			System.out.println("entered Array are same");
		}
		else
		{
			System.out.println("entered array are not same");
		}
	}



	}


