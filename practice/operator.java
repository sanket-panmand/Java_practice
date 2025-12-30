package practice;

public class operator {
	 
		static int a = 10;   //Static Variable
		int b = 20 ;            // instance Variable
		
		public void values2() //non static method
		{
			int e = 50;            //local variable
			int f = 60;
			
			System.out.println("Value of e =" + e );
			System.out.println("Value of f =" + f );
		}
		
		public static void values()   //static Method
		{
			int c = 30;   //Local variable
			int d = 40;    //Local Variable 
			
			System.out.println("Value of c =" + c );
			System.out.println("Value of d =" + d );
			
			//Local or instance variable
			System.out.println("Addition of a & c ="+(a+c));
		    System.out.println("Subtraction of a & d ="+ (a-d));
			System.out.println("Multiplication of a & d ="+ (a*d));
			System.out.println("Divison of d & a ="+(double)(d/a));
		
		}
		
		//operators
		
		public void operation()         //Arithmetic operators
		{												
			System.out.println("Addition of a & b ="+(a+b));
			System.out.println("Subtraction of a & b ="+ (a-b));
			System.out.println("Multiplication of a & b ="+ (a*b));
			System.out.println("Divison of a & b ="+(double)(a/b));
			System.out.println("module of a & b ="+ (b % a));
			
		}
		
		public void operation2()  // unary operators
		{

			System.out.println("post increment ="+(a++)); //print 10 & incr 11
		    System.out.println("post decrement ="+ (a--)); //print 11 & decr 10
			System.out.println("pre increment ="+ (++a));  //1+a a=10 1+10=11 print 11
			//System.out.println("pre decrement ="+(--a));   //1-a a=11 11-1=10 print 10
			
			//example
			System.out.println("pre increment ="+(++b)); // 1+b 1+20 print 21
		    System.out.println("pre decrement ="+ (--b)); //1-b 1-21 print 20
			System.out.println("post increment ="+ (b++));  // print 20 & 1 incr 21
			//System.out.println("post decrement ="+(b--));   // print 21 & decr 20
			
			//Addition pre & post
			System.out.println("Addition of pre & post increment ="+(++a + b++));
			//1+a 1+10 + 20 print 31
			
			//line no 3 comment  1+a (1+11 + 21) print 33 12+21 33
		}
		
		public void Addition()  // Add Calculator
		{
			int x =50;
			int y = 100;
			int sum;
			int sub;
			System.out.println("value of X ="+ x);
			System.out.println("Value of Y ="+ y);
			
			sum = x+y;
			sub = x-y;
			System.out.println("Sum of two number ="+ sum);
			System.out.println("Sub of two number ="+ sub);
		}
		
		public static void main(String agru[])   //Main method
		{
			
			System.out.println("Value of a =" +a);	
			
			operator t1 = new operator();
			System.out.println("Value of b =" + t1.b);
			
			//Call  Method
			operator t2 = new operator();
			t2.values2();
			
			values();
			
			operator t3 = new operator();
			t3.operation();
			
			operator t4 = new operator();
			t4.operation2();
			
			operator t5 = new operator();
			t5.Addition();
		}
	}

