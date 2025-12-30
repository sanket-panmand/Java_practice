package duplicates;

public class highetNumber {

	public static void main(String[] args) {
	
		int arr[]= {10,20,50,80,60,60,97,87};
		int max= arr[0]; 
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
		}
		System.out.println("The maximum number is: " + max);
	}
}