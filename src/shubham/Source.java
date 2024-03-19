package shubham;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Source {
	public static void main(String[] args) {
		  String[] strings = {"aab", "abc","bbb","cc"};
		  int N = 4;
	      int result = countPalindromePairs(strings,N);
	        System.out.println(result);
		
	}

	private static int countPalindromePairs(String[] input1,int input2) {
		// TODO Auto-generated method stub
		 int count = 0;

		    for (int i = 0; i < input2; i++) {
		        for (int j = i + 1; j < input2; j++) {
		            // Concatenate the current pair of strings
		            String concatenated = input1[i] + input1[j];
		            
		            // Check if the concatenated string can form a palindrome
		            Map<Character, Integer> charCount = new HashMap<>();
		            for (char c : concatenated.toCharArray()) {
		                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		            }
		            
		            int oddCount = 0;
		            for (int count2 : charCount.values()) {
		                if (count2 % 2 != 0) {
		                    oddCount++;
		                }
		            }
		            
		            if (oddCount <= 1) {
		                count++;
		            }
		        }
		    }

		    return count;
	}

}