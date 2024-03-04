package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class LongestConsecutiveSequenceLeetcode128 {

	// You must write an algorithm that runs in O(n) time.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 100, 4, 200, 1, 2, 3 };
		int longestConsecutiveCount = longestConsecutive(nums);
//		int longestConsecutiveCount2 = longestConsecutive2(nums);
		System.out.println("Result:" + longestConsecutiveCount);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		int maxCount = 0;
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}

		for (int i : nums) {
			int nextNum = i + 1;
			int preNum = i - 1;
			int count = 1;

			while (set.remove(nextNum)) {
				System.out.println(nextNum);

				count++;
				nextNum++;
			}

			while (set.remove(preNum)) {
				System.out.println(preNum);

				count++;
				preNum--;
			}

			if (maxCount < count)
				maxCount = count;
		}

		return maxCount;
	}

	// not efficient solution
	private static int longestConsecutive2(int[] nums) {
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
				System.out.println(i + ":" + count);

			} else {
				if (result < count)
					result = count;
				count = 0;
			}
			previous = list.get(i);
		}
		result = count > result ? count : result;

		System.out.println(list);
		return result + 1;
	}

}
