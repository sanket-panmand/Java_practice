package duplicates;
//import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {4,3,7,1,5};
		
		//option 1 use in sort method
		//Arrays.sort(array);
		//System.out.println(Arrays.toString(number));	
	
		// option 2 using Bubble sort
		 
		for (int i = 0; i <  arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap array[i] and array[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		for(int k : arr) {
			System.out.print(k+" ");
		}
    }
}
