package Program;

public class Non_static_method {

	 int a = 10;
	 int b =20;
	
	public void Add()
	{
		int c =a+b;
		System.out.println("Addition ="+c);
	}
	
	public void Sub()
	{
		int c =a-b;
		System.out.println("Subtraction ="+c);
	}
	
	public void Mul()
	{
		int c =a*b;
		System.out.println("Multiplication ="+c);
	}
	
	public void Div()
	{
		int c =a/b;
		System.out.println("Division ="+c);
	}
	
	public void Remainder()
	{
		int c =a%b;
		System.out.println("Reminder ="+c);
	}
	
	public static void main(String[] args) {
		
		Non_static_method t1 = new Non_static_method();
		t1.Add();
		t1.Sub();
		t1.Mul();
		t1.Div();
		t1.Remainder();

	}

}
