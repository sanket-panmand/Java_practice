package duplicates;

public class ReverseStringBuffer {

	public static void main(String[] args) {

		
		String ori="sanket panmand";
		/* option 1 using method
		StringBuilder r = new StringBuilder(original).reverse();
		System.out.println(r);
		*/

		int b = ori.length();
        String rev = "";

        // option 2 Reverse the string using a loop
        for (int i = b- 1; i >= 0; i--) {
            rev = rev + ori.charAt(i);// method return at the given index no
        }

        // Print the reversed string
        System.out.println("Original String: " + ori);
        System.out.println("Reversed String: " + rev);
    }
}
