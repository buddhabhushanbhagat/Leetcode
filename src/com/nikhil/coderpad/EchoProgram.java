package com.nikhil.coderpad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EchoProgram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text (type 'exit' to quit):");
        String input = scanner.nextLine();
        
        while (!input.equals("exit")) {
            System.out.println("You entered: " + input);
            System.out.println("Enter text (type 'exit' to quit):");
            input = scanner.nextLine();
        }
        
        System.out.println("Exiting the program. Goodbye!");
        scanner.close();
    }

}