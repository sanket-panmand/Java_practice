package duplicates;

 class Demo1 {

	public int[] findLongest(int[]nums) {
		int n=nums.length;
		if(n==0) {
			return new int[0];
		}
		int maxLength=1;
		int startindex=0;
		int currentlength=1;
		int currentStart=0;
		
		for(int i=1;i<n;i++) {
			if(nums[i]>nums[i-1]) {
				currentlength++;
			}else {
				if(currentlength > maxLength ) {
					maxLength=currentlength;
					startindex=currentStart;
				}
				currentlength=1;
				currentStart=i;
			}
		}
		
		if(currentlength > maxLength) {
			maxLength=currentlength;
			startindex=currentStart;
		}
		int[]longestSubsequence=new int[maxLength];
		for(int i=0;i< maxLength;i++) {
			longestSubsequence[i]=nums[startindex+i];
		}
		return longestSubsequence;
	}
}
public class Demo{
	public static void main(String[] args) {
		int[]nums= {12, 12, 15, 9, 46, 58, 60, 62, 68, 19, 7, 9, 12};
		
		Demo1 demo=new Demo1();
		int[]result=demo.findLongest(nums);
		
		System.out.println("longest");
		for(int num : result) {
			System.out.print(num+" ");
		}
	}
}
