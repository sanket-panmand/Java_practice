package Program;

public class Unary_Operator {

	public static void main(String[] args) {

		int a= 10;
		int b =20;
		
		System.out.println("Post increment = "+ (a++));
		
		System.out.println("Post Decrement = "+(a--));
		
		System.out.println("pre Increment = "+(++a));
		
		System.out.println("Pre Decrement = "+(--a));
 
		System.out.println("Addition of pre & post increment ="+(++a + b++));
		System.out.println("Addition of pre & post Decrement ="+(--a + b--));
		System.out.println("Addition of pre & pre increment ="+(++a + ++b));
		System.out.println("Addition of post & post increment ="+(a++ + b++));
		
	}

}
