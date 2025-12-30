package practice;

//First Class
public class A {               

	public static void add() {    // Static Method
		
		System.out.println("First class Static Method");
		
	}
     void sub() {					// Non-Static Method
    	 
    	 System.out.println("First class Non-Static Method");
		
	}
	public static void main(String[] args) {
		
//        add();				// Call first class static method in first class
//		
//		A t1 = new A();
//		t1.sub();         			 // Call first class Non-static method in first class
		
		B.mul();            // Call second class static method in call first class
		
		B t2 = new B();
		t2.div(); 				 // Call second class Non-static method in call first class
	}

}

//Second Class

class B {     
	
public static void mul() {    // Static Method
		
	System.out.println("Second class Static Method");
	
	}
     void div() {					// Non-Static Method
	
    	 System.out.println("Second class Non-Static Method");
    	 
	}

	public static void main(String[] args) {
		
//		mul();				//call second class static method in second class 
		
//		B t1 = new B();
//		t1.div();				//call second class non static method in second class 
		
		A.add();			//call first class static method in second class 
		
		A t2 =new A();			//call first class non static method in second class 
		t2.sub();
	}

}
