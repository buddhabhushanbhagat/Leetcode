package com.java.array;

import java.util.Scanner;

public class PrintThePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=n*n;j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
