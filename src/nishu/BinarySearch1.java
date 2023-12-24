package nishu;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,7,8,9,12,15,16};
		int target = 10;
		int index = binarySearch(arr,target);
		System.out.println(index);
		
		//Binary Search with recursion
		int indexNumber = binarySearchRecursion(arr,0,arr.length-1,target);
		System.out.println(indexNumber+"hehehe");
		
	}

	private static int binarySearchRecursion(int[] arr, int i, int j, int k) {
		// TODO Auto-generated method stub
		if(j>=i) {
			int middle = i+(j-i)/2;
			if(arr[middle] == k) 
				return middle;
			else if(arr[middle] > k)
				return binarySearchRecursion(arr,i,middle-1,k);
			else
				return binarySearchRecursion(arr,middle+1,j,k);
		}
		return -1;
	}

	private static int binarySearch(int[] arr,int target) {
		int index = -1;
		int firstIndex = 0;
		int lastIndex=arr.length-1;
		
		while(lastIndex >=firstIndex) {
			int middle = firstIndex+(lastIndex-firstIndex)/2;
			if(arr[middle] == target) {
				return middle;
			}
			if(arr[middle] > target) {
				lastIndex = middle-1;
			} else {
				firstIndex = middle+1;
			}
		}
		
		return index;		
	}

}
