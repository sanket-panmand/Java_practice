package polymorphism;

//Class 4
//Main class
class Run_main {

	// Main driver method
	public static void main(String[] args) {

		// Creating object of class 1
		 Runtime_poly D = new Runtime_poly();

		// Now we will be calling print methods
		// inside main() method

		D = new Run_child();
		D.Print();
		
		D = new Run_child1();
		D.Print();
	}
}
