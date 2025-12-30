package polymorphism;

//Java Program for Method overloading
//By using Different Types of Arguments

//Class 1
class Com_poly1 {

	// Method with 1 integer parameters
	static int add(int a)
	{
		// Returns product of integer numbers
		return a ;
	}

	void add() {
		System.out.println("Method oveloading not check the return type only method name will be ssamw and parameter will be different");
	}
	// Method with 2 integer parameters
	static int add(int a, int b)
	{
		// Returns product of integer numbers
		return a + b;
	}

	// Method 2   With same name but with 2 double parameters
	static double add(double a, double b)
	{
		// Returns product of double numbers
		return a + b;
	}

//Class 2
//Main class

	
	public static void main(String[] args)
	{
		// Calling method by passing
		// input as in arguments
		System.out.println("Compile time polymorphism");
		System.out.println(Com_poly1.add(10));
		System.out.println(Com_poly1.add(2, 4));
		System.out.println(Com_poly1.add(5.5, 6.3));
		
		Com_poly1 obj = new Com_poly1();
		obj.add(10);
		obj.add(10, 20);
		obj.add(5.50, 12.30);
		
		Com_poly1.add(10);
		
		obj.add();
	}
}
