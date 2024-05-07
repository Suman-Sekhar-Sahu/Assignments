package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment64 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int rollnumber[]= new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("rollnuber->"+i);
			
		rollnumber[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(rollnumber));
			
	

	}

}
