
public class LeetCode26 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 1, 2 };
		assert (removeDuplicates(nums1) == 2);
		int[] nums2 = { 0,0,1,1,1,2,2,3,3,4 };
		assert (removeDuplicates(nums2) == 5);
		
		
	}

	public static int removeDuplicates(int[] nums) {
	     int curr = 0;
	     for(int i = 0; i < nums.length; i++){
	         if(nums[curr] != nums[i]){
	            nums[curr + 1] = nums[i];
	            curr++;
	         }
	     }
	     return ++curr;
	    }

}
