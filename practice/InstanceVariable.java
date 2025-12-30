package practice;

public class InstanceVariable {


			int a= 10;			// instance Variable
			float b = 10;		// instance Variable
			long c = 555;		// instance variable
		
		public static void main(String[] args) {
			
			InstanceVariable t1 = new InstanceVariable();
			
			System.out.println(t1.a);
			System.out.println(t1.b);
			System.out.println(t1.c);

			System.out.println(t1.a+t1.b+t1.c);
			
			
		}

	}

