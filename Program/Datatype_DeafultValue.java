package Program;

public class Datatype_DeafultValue {


		// Default Value

	int a;
	short b;
	long c;
	byte d;
	char e;  //   /u0000 = default value
	float f;
	double j;
	boolean g;

	// Non Primitives
	String h;

	public static void main(String[] args) {

		Datatype_DeafultValue t1 = new Datatype_DeafultValue();
		
		System.out.println("int = "+t1.a);
		System.out.println("Short = "+t1.b);
		System.out.println("long = "+t1.c);
		System.out.println("byte = "+t1.d);
		System.out.println("char = "+t1.e);
		System.out.println("Float = "+t1.f);
		System.out.println("Double = "+t1.j);
		System.out.println("Boolean = "+t1.g);
		System.out.println("String ="+t1.h);

	}

}
