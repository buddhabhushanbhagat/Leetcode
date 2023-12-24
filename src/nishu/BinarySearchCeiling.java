package nishu;

public class BinarySearchCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		int nums[] = {2,3,5,9,14,16,18};
		int target = 17;
		int index = findCeilingBinary(nums,target);
		System.out.println(index);
	}

	private static int findCeilingBinary(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length-1;
		
		while(right >= left) {
			int middle = left+(right-left)/2;
			if(nums[middle] >= target ) {
				if(middle == 0)
				return middle;
				else if(nums[middle-1] < target)
					return middle;
			}
			if(nums[middle] < target) {
				left = middle+1;
			}
			else {
				right = middle-1;
			}
		}
		return -1;
	}

}
