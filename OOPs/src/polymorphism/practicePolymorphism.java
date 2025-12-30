package polymorphism;

public class practicePolymorphism {
	
	public static void add() {
		System.out.println("method overloding11111111");
	}

    static int add(int a) {
		System.out.println("method overloding"+a);
    	return 0;
	}
	public static void main(String[] args) {
		

		add();
		add(10);
	}

}
