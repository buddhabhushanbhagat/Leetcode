package com.java.array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random random = new Random();
		
		for(int i=0; i<array.length;i++) {
			int randomIndex = random.nextInt(array.length);
			int temp = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = temp;
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
