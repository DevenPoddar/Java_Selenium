package com;
import java.util.Scanner;

public class Form_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String age = "25";
        String price = "150.75";
		
     // Input: Age
        System.out.print("Enter age: ");
		String ageStr = sc.nextLine();
		System.out.println(age.getClass().getName());
		
        try {
        	// Wrapper class
            Integer obj1 = Integer.parseInt(ageStr);
            System.out.println(obj1.getClass().getName());
            
            if (obj1 >= 0 && obj1 <= 120) {
                System.out.println("Valid age");
            } else {
                System.out.println("Age must be between 0 and 120");
            }
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid age format");
        }

        // Input: Price
        System.out.print("Enter product price: ");
        String priceStr = sc.nextLine();
        System.out.println(price.getClass().getName());
        
        try 
        {
            Double obj2 = Double.valueOf(priceStr);  // Wrapper class
            System.out.println(obj2.getClass().getName());
            
            if (obj2 >= 0) {
                System.out.println("Valid price");
            } 
            else {
                System.out.println("Price cannot be negative");
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid price format");
        }

	        
	        
	}

}
