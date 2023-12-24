package nishu;

import java.util.Arrays;

public class MergeSortedArray {
	//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	//Output: [1,2,2,3,5,6]
	
	public static void main(String[] args) {
		 int nums1[] = {5,7,9,10,0,0,0}; //{5,0,5,6,7,9,10}
		 int m = 4;
		 int nums2[] = {2,5,6};
		 int n = 3;
		 merge(nums1,m,nums2,n);
		 
	}
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 int last= nums1.length-1;
		int i = m-1;
		int j= n-1;
	        while( j>=0) {
	        	
	        	if( i>=0 && nums1[i] > nums2[j]  ) {
	        		
	        		nums1[last] = nums1[i];
	        		
	        		System.out.println(i+":"+j+"="+nums1[last]);
	        		i--;
	        		
	        	}else {
	        		nums1[last] = nums2[j];
	        		System.out.println("=="+i+":"+j+"="+nums1[last]);

	        		j--;
	        	}
	        	System.out.println(last+"----");
        		last--;
        		
	        }
	        System.out.println(Arrays.toString(nums1));
	    }

}
