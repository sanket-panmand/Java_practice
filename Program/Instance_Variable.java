package Program;

public class Instance_Variable {


			static int a= 10;			// instance Variable
			float b = 10.55f;		// instance Variable
			long c = 555;		// instance variable
		
			public static void main(String[] args) { // outside the block

				Instance_Variable t1 = new Instance_Variable();

				System.out.println("Value of a = " + a);
				System.out.println("Value of b = " + t1.b);
				System.out.println("Value of c = " + t1.c);

				System.out.println("Addition = " + (a + t1.b + t1.c));

			}

	}

