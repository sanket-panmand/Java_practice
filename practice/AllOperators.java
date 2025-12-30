package practice;

public class AllOperators {
	
		static void Arithmetic()    // Arithmetic Operator  + , - , * , / , %
		{
			int a = 10;
			int b = 20;
			
			System.out.println("Add : " + (a+b));
			System.out.println("Sub : " + (a-b));
			System.out.println("Mul : " + (a*b));
			System.out.println("Div : " + (a/b));
			System.out.println("Rem : " + (a%b));
			
		}

		static void Unary()      // Unary Operator  post incr a++ , post decr a-- , pre incr ++a , pre decr --a
		{
			int a= 10;
			
			System.out.println("post incr a++ : " + (a++));
			System.out.println("post decr a-- : " + (a--));
			System.out.println("pre incr ++a : " + (++a));
			System.out.println("pre decr --a : " + (--a));
		}

		static void Relational()   //  Relational Operator < , > , <= , >= , //Equality operator == , !=
		{
			int a = 10;
			int b = 20;
		
			System.out.println("a is less than  b :" + (a < b));
			System.out.println("a is greter than b :" + (a > b));
			System.out.println("a is less than or equal to b :" + (a <= b));
			System.out.println("a is greter than or equal to b :" + (a >= b));
			System.out.println("a is equal to b :" + (a == b));
			System.out.println("a is not equal to b :" + (a != b));
		}

		static void Logical()  //    logical Operatoer && , || 
		{
		 int a = 10; 
		 int b = 20;
		 int c = 30;
		 
		 System.out.println("Logical AND :" +(a < b && b < c ));   // T T -> T other F
		 System.out.println("Logical OR :" +(a > b || b > c ));		// F F -> F other T
		 
		 System.out.println("Logical AND :" +(a > b && b < c ));	   // condition false than next condition not check
		 System.out.println("Logical OR :" +(a < b || b > c ));	   // condition True than next condition not check
		}

		static void Bitwise()  // & , | , ^ 
		{
			int a= 10;
			int b =20;
			int c= 30;
			
			 System.out.println("Logical AND :" +(a < b & b < c ));   // T T -> T other F
			 System.out.println("Logical OR :" +(a > b | b > c ));		// F F -> F other T
			 
			 System.out.println("Logical AND :" +(a > b & b < c & a++ > b ));	   // each and every condition will be check
			 System.out.println("upadate value for a : "+ a);
			 System.out.println("Logical OR :" +(a < b | b < c | b > ++c ));	
			 System.out.println("upadate value for c : "+ c);
		}

		static void Ternary()   // condition ? true : false ;
		{
			int a = 10;
			int b = 20;
			
			String c = a<b ? "a is less than b" : "a is greter than b";
			System.out.println(c);
		}

		static void Assignment()   // a+= , a-= , a*= , a/= , a%= , &= , |= , ^= ,<<= , >>=
		{
			int a = 10;
			int b = 10;
			int c = 10;
			int d = 10;
			int e = 10;
			
			a+=100;
			System.out.println("upadate value for a : "+a);
			b-=100;
			System.out.println("upadate value for b : "+b);
			c*=100;
			System.out.println("upadate value for c : "+c);
			d/=100;
			System.out.println("upadate value for d : "+d);
			e%=100;
			System.out.println("upadate value for e : "+e);
			
		}

		static void shift()  // left shift << Multiplication a*2^n, right shift >> Division a/2^n
		{
			int a = 10;
			
			int  b = a<<4;
			int c = a >> 2;
			System.out.println("Shift operator (multiplication <<): "+b); // a*2^n
			System.out.println("Shift operator (Divvion >>):"+c);         // a/2^n
		}

	public static void main(String[] args) {
		
		Arithmetic();
		Unary();
		Relational();
		Logical();
		Bitwise() ;
		Ternary();
		Assignment();
		shift();
	}

}
