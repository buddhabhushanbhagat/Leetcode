package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class TP {

	public static void main(String[] args) {
        // Test cases
        System.out.println(isDuoDigit(123)); // true
        System.out.println(isDuoDigit(-2021)); // false
        System.out.println(isDuoDigit(122)); // true
        System.out.println(isDuoDigit(999)); // true
        System.out.println(isDuoDigit(100)); // true
        System.out.println(isDuoDigit(9)); // true
    }

    public static boolean isDuoDigit(int number) {
    	
    	 int digit1 = -1; // Initialize the first digit to an invalid value
         int digit2 = -2; // Initialize the second digit to a different invalid value

         while (number > 0) {
             int digit = number % 10; // Extract the last digit
             number /= 10; // Remove the last digit

             if (digit1 == -1) {
                 // Assign the first digit if it hasn't been assigned yet
                 digit1 = digit;
             } else if (digit != digit1 && digit2 == -2) {
                 // Assign the second digit if it's different from the first and hasn't been assigned yet
                 digit2 = digit;
             } else if (digit != digit1 && digit != digit2) {
                 // If we find a third different digit, it's not a duodigit
                 return false;
             }
         }

         // If we reach here, it means we found at most two different digits
         return true;
    	
    	
    	
    	
//    	Set<Integer> set = new HashSet<>();
//    	
//    	 while (number > 0) {
//             int digit = number % 10; // Extract the last digit
//             set.add(digit);
//             number /= 10; // Remove the last digit
//    	 }
//    	 
//    	 if(set.size() >2) 
//    		 return false;
//    	
//    	return true;
    	
    	
    	
    	
    	
//    	
    	
//        // Convert the number to string to analyze its digits
//        String numStr = Integer.toString(number);
//        // If the number has only 1 or 2 digits, it's a duodigit by definition
//        if (numStr.length() <= 2) {
//            return true;
//        }
//
//        // Check if all digits are the same
//        char firstDigit = numStr.charAt(0);
//        for (int i = 1; i < numStr.length(); i++) {
//            if (numStr.charAt(i) != firstDigit) {
//                // If a different digit is found, it's not a duodigit
//                return false;
//            }
//        }
//
//        // If all digits are the same, it's a duodigit
//        return true;
    	
     
    }

}
