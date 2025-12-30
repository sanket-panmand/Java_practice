package duplicates;

public class floydsTringle {

	public static void main(String[] agru) {
		
		int a=5;
		int number =1;
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i ;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
}
