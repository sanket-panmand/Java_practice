package Program;

public class Static_Variable {

	    int a = 20;
		static float b = 10;		// Static Variable is mandatory to Static keyword 
	
		public static void main(String[] args) {
			
			Static_Variable t1 = new Static_Variable();			 //not static keyword then created object
			System.out.println("Value of a = " + t1.a);                        
			
			System.out.println("Value of b = " + b); 
			
			System.out.println("Addition = " + (t1.a + b));
		}

	}


