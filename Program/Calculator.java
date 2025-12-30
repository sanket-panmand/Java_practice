package Program;

public class Calculator {
	
	static int a =10;   // Static variable
	int b =20;           // Instance variable
	
	public static void add()                    // Static Method
	{
		Calculator t = new Calculator();
		System.out.println("Addition : " + (a+t.b));
	}
	public static void sub()
	{
		int a=30;            // Local Variable
		int b=20;
		int c=a-b;
		System.out.println("Sub : "+ c);
	}
	public void mul(int a, int b)			// Non Static Method
	{
				System.out.println("Multiplication : " + (a*b));
	}
	public static void div(double a, double b)
	{
		System.out.println("Division :"+ (a/b));
	}
	public void mod()
	{
		int mod = a % b;
		System.out.println("modulus : "+ mod);
	}
	
	public static void main(String[] args) {
		
		add();
		
		Calculator.sub();
		
		Calculator t1 = new Calculator();
		t1.mul(10,20);
		
		div(20, 9);
		
		t1.mod();
		
	}

}
