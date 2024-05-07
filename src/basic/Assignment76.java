package basic;

import java.util.Arrays;

public class Assignment76 {

	public static void main(String[] args)
	{
		String name[]= new String[4];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		name[3]="Hanuman";
		String namecoppy[]= new String[name.length];
		/*for(int i=0;i<name.length;i++)
		{
			namecoppy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));	
		System.out.println(Arrays.toString(namecoppy));*/
		for(int i=name.length;i>=0;i--)
		{
			namecoppy[i]=name[i];
		}
		System.out.println(Arrays.toString(namecoppy));

	}

}
