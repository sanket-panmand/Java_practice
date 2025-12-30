package practice;

public class returntype {

	public static int add() {
		
		System.out.println("return type int");
		return 10;
	}
	static double sub() {
		System.out.println("return type double");
		return 10.20;
	}
	public char mul() {
		System.out.println("return type char");
		return 'A';
	}
	String div() {
		System.out.println("return type string");
		return "fusion";
	}
	
	public static void main(String[] args) {
		
		add();
		sub();
		
		returntype t1 = new returntype();
		t1.mul();
		t1.div();
		
		System.out.println("=====================================");
		
		System.out.println(add());
		System.out.println(sub());
		System.out.println(t1.mul());
		System.out.println(t1.div());

	}

}
