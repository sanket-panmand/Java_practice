									// Default Value

package practice;

public class DataType {

	
	// Default Value
		
		                          // Data Type
		// Primitive
		
		int a;
	    short b;
	    long c;
	    byte d;
	    
	    char e;  //   /u0000 = default value
	     
	    float f;
	    double j;
	    
	    boolean g;
	 
	    // Non Primitives
	    
	    String h;
	   	
		public static void main(String[] args) {
			
			DataType t1 = new DataType();
			System.out.println("int = "+t1.a);
			System.out.println("Short = "+t1.b);
			System.out.println("long = "+t1.c);
			System.out.println("byte = "+t1.d);
			
			System.out.println("char = "+t1.e);
			
			System.out.println("Float = "+t1.f);
			System.out.println("Double = "+t1.j);
			
			System.out.println("Boolean = "+t1.g);
			
			System.out.println("String ="+t1.h);
			
		}

	}

