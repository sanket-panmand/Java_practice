package practice;

public class Method {

		int a = 10;            // Instance Variable
		static int  b = 20;   // Static Variable
		
		public static void add()   // Static Method
		{
			int c = 30;  // Local Variable
			int d = 20;  // Local Variable
			
			Method t1 = new Method();
			System.out.println(t1.a+b+c+d);
		}
		
		public void sub()   // Non Static Method
		{
			int c = 20;
			int d = 50;
			System.out.println(a+b+c+d);
		}
		
		public static void main(String[] args) 
		{
			add();
			
			Method t2 = new Method();
			t2.sub();
			
		}

	}

