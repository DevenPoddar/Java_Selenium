package com.Set;

import java.util.*;


public class Hospital_Records {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    HashMap<Integer, String> patients = new HashMap<>();
	    int choice;
	    	   
        do {
        	System.out.print("Enter choice: ");
	    	choice = sc.nextInt();
	    	sc.nextLine();
	    switch (choice) {
	    	
	    case 1:
	    	
             System.out.print("Enter Patient ID: ");
             int id = Integer.parseInt(sc.nextLine());

             System.out.print("Enter Patient Name: ");
             String name = sc.nextLine();

             System.out.print("Enter Disease: ");
             String disease = sc.nextLine();

             patients.put(id, name + " - " + disease);
	     
	         break;
	         
	    case 2:// view all patients
	    	
	    	System.out.println("\nAll Patients:");
	         for (Map.Entry<Integer, String> entry : patients.entrySet()) {
	             System.out.println(entry.getKey() + "\t" + entry.getValue());
	         }

	         break;
	         
         // Update Patient details
	    case 3:
	    	
         System.out.print("\nEnter ID to update disease: ");
         int updateId = Integer.parseInt(sc.nextLine());
         
         if (patients.containsKey(updateId)) {
        	 
             System.out.print("Enter new disease: ");
             String newDisease = sc.nextLine();
             String name1 = patients.get(updateId).split(" - ")[0];
             patients.put(updateId, name1 + " - " + newDisease);
             System.out.println("Disease updated!");
             for (Map.Entry<Integer, String> entry : patients.entrySet()) {
                 System.out.println(entry.getKey() + "\t" + entry.getValue());
             }
             
         }
         else 
         {
             System.out.println("Patient ID not found!");
         }
         break;
         
	    case 4: // Remove a patient

         System.out.print("\nEnter ID to remove: ");
         int removeId = Integer.parseInt(sc.nextLine());
         
         if (patients.remove(removeId) != null) {
             System.out.println("Patient removed!");
         } 
         else {
             System.out.println("Patient ID not found!");
         }
         break;
         
	    case 5:
         // Clear values but keep IDs
         for (Integer id1 : patients.keySet()) {
             patients.put(id1, null);
         }
         System.out.println("\nAfter clearing values but keeping IDs: " + patients);
		}
	    
        }while (choice != 6);
        sc.close();
	}

}
