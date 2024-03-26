package com.java.stack;

import java.util.Stack;

public class EvaluateReversePolishNotationLeetcode150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		int result = evalRPN(tokens);
		System.out.println(result);
	}

	public static int evalRPN(String[] tokens) {
		int result = 0;
		Stack<Integer> intStack = new Stack<>();
		for (String s : tokens) {
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				int second = intStack.pop();
				int first = intStack.pop();
				result = solve(first, second, s);
				intStack.add(result);

			} else {
				intStack.add(Integer.parseInt(s));
			}
		}
		return intStack.peek();

	}

	private static int solve(int first, int second, String s) {
		// TODO Auto-generated method stub
		int result = 0;
		switch (s) {
		case "+": {

			result = first + second;
			break;
		}
		case "-": {

			result = first - second;
			break;
		}
		case "*": {

			result = first * second;
			break;
		}
		case "/": {

			result = first / second;
			break;
		}

		}
		return result;
	}

}
