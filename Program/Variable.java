package Program;

public class Variable {
	
	static int a =10;			//Static variable
	
	int b =10;			//instance Variable
	
	public static void main(String argu[])
	{
		int c =10; 		//Local Variable
		
		System.out.println("Static Variable = "+ a);
		
		Variable t1 = new Variable();
		System.out.println("Static Variable = "+ t1.b);
		
		System.out.println("Static Variable = "+ c);
		
	}

}
