package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequenceLeetcode128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		int longestConsecutiveCount = longestConsecutive(nums);
		System.out.println("Result:" + longestConsecutiveCount);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		
		int result = 0;
		int count = 0;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
		int previous = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) - previous == 1) {
				count++;
				System.out.println(i+":"+count);

				
			} else {
				if (result < count)
					result = count;
					count = 0;
			}
			previous = list.get(i);
		}
		result = count>result?count:result;

		System.out.println(list);
		return result+1;
	}

}
