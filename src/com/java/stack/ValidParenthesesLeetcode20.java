package com.java.stack;

import java.util.Stack;

public class ValidParenthesesLeetcode20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "]";
		boolean isValid = isValid(s);
		System.out.println(isValid);
	}

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
			}else {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.peek();
				if(ch == ']' && top == '[')
					// 
					stack.pop();
				else if(ch == '}' && top == '{')
					stack.pop();
				else if(ch == ')' && top == '(')
					stack.pop();
				else
					return false;
			}
		}
		
		return stack.isEmpty();
	}
  
}
