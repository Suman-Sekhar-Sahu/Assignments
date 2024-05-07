package basic;

import java.util.Scanner;

public class Assignment62 
{

	

	public static void main(String[] args)
	{
		
		String name[]=new String[3];
		name[0]= "suman";
		name[1]= "Subham";
		name[2]= "Suchi";
		int rollnumber[]=new int[3];
		rollnumber[0]=12;
		rollnumber[1]=23;
		rollnumber[2]= 45;
		char gender[]=new char[3];
		gender[0]='M';
		gender[1]='M';
		gender[2]='F';
		System.out.println("name of student" + " " +"Rollnumber"+ " "+ "Gender");
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i] +"            "+rollnumber[i]+ "         "+gender[i]);
		}

	}

}
