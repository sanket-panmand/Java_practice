package duplicates;

public class Palindrom {

	public static void main(String[] args) {
		int a=5;
		
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=a-i;j++) 
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

//package duplicates;
//
//public class Palindrom {
//
//    public static void main(String[] args) {
//        int a = 5;
//        
//        for (int i = 1; i <= a; i++) {
//            // Loop for spaces to center the pattern
//            for (int j = 1; j <= a - i; j++) {
//                System.out.print(" ");
//            }
//            
//            // First half (descending numbers)
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j);
//            }
//            
//            // Second half (ascending numbers)
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j);
//            }
//            
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//}
