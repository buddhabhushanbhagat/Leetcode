package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestConsecutiveSequenceLeetcode128 {

	// You must write an algorithm that runs in O(n) time.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0,3,7,2,5,8,4,6,0,1};
		int longestConsecutiveCount = longestConsecutive(nums);
//		int longestConsecutiveCount2 = longestConsecutive2(nums);
		System.out.println("Result:" + longestConsecutiveCount);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		if(nums.length == 0){
            return 0;
        }
		
		SortedSet<Integer> set = new TreeSet<>();
		for(int i:nums) {
			set.add(i);
		}
		Object[] setArr= set.toArray();
		int pre  =0;
		int count =1;
		for(int i = 1; i < setArr.length; i++) {
//			int preValue =   setArr[i];
			
//		    System.out.println(i + ": " + setArr[i]);
		   Integer preValue = (Integer) setArr[pre];
		   Integer currValue = (Integer) setArr[i];
		    if(currValue - preValue == 1) {
				count++;
			}else {
				return count;
			}
		   
		   pre++;
		}
		return count;
	}

	
}
