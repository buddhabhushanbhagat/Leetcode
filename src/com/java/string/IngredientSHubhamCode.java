package com.java.string;

import java.util.ArrayList;
import java.util.List;

public class IngredientSHubhamCode {

	public static void main(String[] args) {
		// Define the initial ingredient list
		List<String> ingredientListForOnePerson = new ArrayList<>();
		ingredientListForOnePerson.add("2 eggs");
		ingredientListForOnePerson.add("200 grams of flour");
		ingredientListForOnePerson.add("150 grams of sugar");
		ingredientListForOnePerson.add("1 liter(s) of milk");

		// Define the number of persons
		int noPersons = 3;

		// Multiply the quantities in the ingredient list
		List<String> multipliedIngredientList = multiplyIngredients(noPersons, ingredientListForOnePerson);

		// Print the modified ingredient list
		for (String ingredient : multipliedIngredientList) {
			System.out.println(ingredient);
		}
	}

//	public static List<String> multiplyIngredients(int noPersons,List<String> ingredientListForOnePerson) {
//		List<String> multipliedIngredientList = new ArrayList<>();
//	
//		// Iterate through each ingredient in the initial list
//		for (String ingredient : ingredientListForOnePerson) {
//			// Split the ingredient into quantity and product
//			String[] parts = ingredient.split(" ", 2);
//			int quantity = Integer.parseInt(parts[0]); // Extract the quantity
//			String product = parts[1]; // Extract the product
//
//			// Multiply the quantity
//			int multipliedQuantity = quantity * noPersons;
//
//			// Construct the multiplied ingredient and add it to the list
//			multipliedIngredientList.add(multipliedQuantity + " " + product);
//		}
//
//		return multipliedIngredientList;
//	}
//	
	public static List<String> multiplyIngredients(int noPersons,List<String> ingredientListForOnePerson) {
		List<String> multipliedIngredientList = new ArrayList<>();
		
		for(String s:ingredientListForOnePerson) {
			String[] strArray = s.split(" ");
			int newdata = Integer.parseInt(strArray[0])*noPersons;
			strArray[0] = String.valueOf(newdata);
//			String.join(" ",strArray)
			multipliedIngredientList.add(String.join(" ",strArray));
		}
		return multipliedIngredientList;
	} 
}
