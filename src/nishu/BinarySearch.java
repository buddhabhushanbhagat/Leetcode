package nishu;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,6,8,11,16};
		int target = 2;
		int index = binarySearch(arr,target);

		if(index == -1) {
			System.out.println("Target element not exist in array");
		}
		else {
			System.out.println("Target element "+target +" is at "+index+" indexs");

		}
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int startIndex = 0;
		int endIndex = arr.length-1;
		while(startIndex <= endIndex) {
			int midIndex = (startIndex+(endIndex-1))/2;
			if(arr[midIndex] == target) {
				return midIndex;
			}
			if(arr[midIndex] > target) {
				endIndex = midIndex-1;
				
			}else {
				startIndex = midIndex+1;
			}
		}
		return -1;
	}

}
