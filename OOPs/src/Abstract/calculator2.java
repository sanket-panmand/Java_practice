package Abstract;

public  class calculator2 extends calculator1 {

	public void div(int a, int b) {
		int c = a / b;
		System.out.println("Division : "+c);
	}
	public void mod(int a, int b) {
		int c = a % b;
		System.out.println("Remainder : "+c);
	}
}
