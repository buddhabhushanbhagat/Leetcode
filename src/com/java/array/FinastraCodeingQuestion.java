package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FinastraCodeingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 2, 3, 4, 5, 2, 2, 2, 4, 4, 2, 2, 1, 1, 4, 5 };
		int[] result = WinnerAndRunner(arr);
		System.out.println("winner and runner candidates are:" + Arrays.toString(result));
	}

	private static int[] WinnerAndRunner(int[] arr) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr)
			map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);

		Set<Integer> keySet = map.keySet();

		int[] result = keySet.stream().sorted((a, b) -> map.get(b) - map.get(a)).limit(2).mapToInt(i -> i).toArray();
		return result;
	}

//	
//	private static int[] WinnerAndRunner(int[] arr) {
//		// TODO Auto-generated method stub
//		int[] result = new int[2];
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i:arr) {
//			if(map.containsKey(i)){
//				map.put(i,map.get(i)+1);
//			}else {
//				map.put(i, 1);
//			}
//		}
//		
//		
//		List<Integer> list = new ArrayList<>(map.keySet());
//		
//		System.out.println(list);
//		List<Integer> res = list.stream().sorted((a,b)-> map.get(b).compareTo(map.get(a))).limit(2).collect(Collectors.toList());
//		System.out.println(res);
//
//		result[0] = res.get(0);
//		result[1] = res.get(1);
// 		return result;
//	}

}
