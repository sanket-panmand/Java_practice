package Program;

public class Static_method {

	static int a = 10;
	static int b =20;
	
	public static void Add()
	{
		int c =a+b;
		System.out.println("Addition ="+c);
	}
	
	public static void Sub()
	{
		int c =a-b;
		System.out.println("Subtraction ="+c);
	}
	
	public static void Mul()
	{
		int c =a*b;
		System.out.println("Multiplication ="+c);
	}
	
	public static void Div()
	{
		int c =a/b;
		System.out.println("Division ="+c);
	}
	
	public static void Remainder()
	{
		int c =a%b;
		System.out.println("Reminder ="+c);
		
	}
	
	public static void main(String[] args) {
		
		Add();
		Sub();
		Mul();
		Div();
		Remainder();

	}

}
