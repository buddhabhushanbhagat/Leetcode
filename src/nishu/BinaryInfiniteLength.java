package nishu;

public class BinaryInfiniteLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 0;
		int length = 2;
		int end = length-1;
		int target = 34;
		int[] arr = {1,2,3,6,8,11,16,20,21,25,29,30,32,34,37,39,44,47,49,52,57};

		while(target > arr[end]) {
			length = length*2;
			start = end+1;
			end = length+1;
				
		
		}
		System.out.println(start+"to"+ end +"=" +length);

		int index = binarySearch(arr,start,end,target);
		System.out.println(index);
	}

	static int binarySearch(int[] arr, int start, int end, int target) {
		// TODO A  uto-generated method stub
		
		while(start <= end) {
			int middle = start +(end-start)/2;
			if(arr[middle] == target) 
				return middle;
			if(arr[middle] > target) {
				end = middle-1;
				
			}
			else {
				start = middle+1;
			}
		}
		return -1;
	}  
	
//	 public int peakIndexInMountainArray(int[] arr) {
//	        if(arr.length == 3)
//	        return 1;
//	        // 1,2,3,4,5,2,3
//	        int left = 0;
//	        int right = arr.length-1;
//	        while(right >= left) {
//	            int middle = right+(left-right)/2;
//	            if(arr[middle] > arr[middle-1] && arr[middle] >arr[middle+1])
//	                return middle;
//
//	            if(arr[middle] < arr[middle+1] && arr[middle] > arr[middle-1])    
//	                left = middle+1;
//	            else 
//	                right = middle-1;
//	            
//	        }
//	   return -1;
//	    }

}
