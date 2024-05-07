package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rollnumber[]= new int[3];
		System.out.println("strting of Array1");
		for(int i=0;i<3;i++)
		{
			System.out.println("rollnuber->"+i);
			
		rollnumber[i]=sc.nextInt();
	

	}
		System.out.println(Arrays.toString(rollnumber));
		
		int rollnumber1[]= new int[3];
		System.out.println("strting of Array2");
		for(int i=0;i<3;i++)
		{
			System.out.println("rollnuber->"+i);
			
		rollnumber1[i]=sc.nextInt();

	}
		System.out.println(Arrays.toString(rollnumber1));
		if(Arrays.equals(rollnumber,rollnumber1)==true)
		{
			System.out.println("entered Array are same");
		}
		else
		{
			System.out.println("entered array are not same");
		}
	}

}
