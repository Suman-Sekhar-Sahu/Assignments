package basic;

import java.util.Arrays;

public class Assignment74 
{
static int count=0;
	

	public static void main(String[] args)
	{
		int n[]=new int[4];
		n[0]=21;
		n[1]=23;
		n[2]=78;
		n[3]=78;
		int givenumber=78;
		System.out.println(Arrays.toString(n));
		for(int i=0;i<n.length;i++)
		{
			if(givenumber==n[i])
			{
				System.out.println("present");
				count++;
				
			}
			else
			{
				System.out.println("not present");
			}
		}
		System.out.println("count of present number is"+" "+count);
		
	}

}
