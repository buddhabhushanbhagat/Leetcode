package com.java.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperaturesLeetcode739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperatures = {73,74,75,71,69,72,76,73};
		int[] result = dailyTemperatures(temperatures); 
		System.out.println(Arrays.toString(result));
	}

	private static int[] dailyTemperatures(int[] temperatures) {
		// TODO Auto-generated method stub
		int[] result = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i < temperatures.length;i++) {
			while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				result[stack.peek()] = i-stack.pop();
			}
			stack.add(i);
		}
		
		
		return result;
	}

}
