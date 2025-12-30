package Abstract;

public abstract class calculator1 implements Reqirement_1 {  //abstract keyword mandatory

	public void add(int a, int b) {       //public keyword mandatory
		
		System.out.println("Addition : ");
	}
	public void sub(int a, int b)
	{
		int c = a - b;
		System.out.println("Subtraction : "+ c);
	}
	public void mul(int a, int b)
	{	int c = a * b;
		System.out.println("Multiplication : "+c);
	}
	
	//Hiding information
	public abstract void div(int a, int b);    //abstract keyword mandatory
	public abstract void mod(int a, int b);
}
