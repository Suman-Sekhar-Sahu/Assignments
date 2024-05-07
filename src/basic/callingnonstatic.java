package basic;

public class callingnonstatic 
{
	void add() {
		int a=100;
		int b=200;
		int sum= a+b;
		System.out.println(sum);
	}
	void sub() {
		int a=200;
		int b=100;
		int sum=a-b;
		System.out.println(sum);
	}
	void mul() {
		int a=200;
		int b=100;
		int sum=a*b;
		System.out.println(sum);
	}
	void div() {
		int a=200;
		int b=100;
		int sum=a/b;
		System.out.println(sum);
	}
	void mod() {
		int a=200;
		int b=100;
		int sum=a%b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callingnonstatic c1= new callingnonstatic ();
		c1.add();
		c1.sub();
		c1.div();
		c1.mul();
		c1.mod();
		
	}

}
