package basic;
interface Contratual
{
	 String s = "xyz";
	 void mailid();
	
}
interface Permanent
{
	void tranjecton();
	
}

public class Employeeinterface implements Contratual,Permanent 
{

	public static void main(String[] args) 
	{
		
		Employeeinterface e1= new Employeeinterface();
		e1.mailid();
		e1.tranjecton();
	}
	

	@Override
	public void tranjecton() {
		// TODO Auto-generated method stub
		System.out.println("permannet");
	}

	@Override
	public void mailid() {
		System.out.println("contratual");
		
	}
}
	

	
