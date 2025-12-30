package practice;

public class StaticVariable {

		
		int a= 10;			// instance Variable
		
		static float b = 10;		// Static Variable Static keyword are mandatory
		
		

		public static void main(String[] args) {
			
			StaticVariable t1 = new StaticVariable();
			
			System.out.println(t1.a);
			
			System.out.println(b);
			
			System.out.println(t1.a+" "+b);
			
			System.out.println("Addition =" + (t1.a + b)); 

			System.out.println(t1.a+b);
		}

	}


