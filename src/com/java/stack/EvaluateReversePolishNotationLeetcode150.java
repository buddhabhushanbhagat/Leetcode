package com.java.stack;

import java.util.Stack;

public class EvaluateReversePolishNotationLeetcode150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = { "4"};
		int result = evalRPN(tokens);
		System.out.println(result);
	}

	public static int evalRPN(String[] tokens) {
		int result = 0;
		Stack<Integer> intStack = new Stack<>();
		for (String s : tokens) {
			switch (s) {
			case "+": {
				int second = intStack.pop();
				int first = intStack.pop();
				result = first + second;
				intStack.add(result);
				break;
			}
			case "-": {
				int second = intStack.pop();
				int first = intStack.pop();
				result = first - second;
				intStack.add(result);
				break;
			}
			case "*": {
				int second = intStack.pop();
				int first = intStack.pop();
				result = first * second;
				intStack.add(result);
				break;
			}
			case "/": {
				int second = intStack.pop();
				int first = intStack.pop();
				result = first / second;
				intStack.add(result);
				break;
			}
		
			default:
				intStack.add(Integer.parseInt(s));
			}
		}

		return intStack.peek();

	}

}
