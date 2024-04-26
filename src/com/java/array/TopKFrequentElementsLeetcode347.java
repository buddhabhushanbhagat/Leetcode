package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class TopKFrequentElementsLeetcode347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,2,2,3};
		int k = 3;
		int[] topKFrequent = topKFrequent(nums,k);
		
		for(Object i:topKFrequent) {
			System.out.println(i);
		}
	}

	private static int[] topKFrequent(int[] nums, int k) {
		// TODO Auto-generated method stub
		int[] result = new int[k];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0,count = 0;i < nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				
				map.put(nums[i],0);
			}
			map.put(nums[i], map.get(nums[i])+1);
			System.out.println(nums[i]+":" +map.get(nums[i]));
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		list.sort((a,b)->map.get(b).compareTo(map.get(a)));
		for(int i=0;i<k;i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
