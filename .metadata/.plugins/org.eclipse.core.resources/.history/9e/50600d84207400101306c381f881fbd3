package com;

import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Patient_Queue {

	public static void main(String[] args) {  
	
		LinkedList<String> patient_Queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
    
		int choice = 0;
		int option = 0;

		patient_Queue.add("Jack");
		patient_Queue.add("Rose");
		patient_Queue.add("Celvin");
    
    
		do {
			try {
			System.out.println("\nHospital Queue Menu");
			System.out.println("1. Add Patient (Normal)");
			System.out.println("2. Add Emergency Patient");
			System.out.println("3. Remove Patient");
			System.out.println("4. View All Patients");
			System.out.println("5. Check First Patient & Check Last Patient");
			System.out.println("6. Search Patient by Name");
            System.out.println("7. Count Total Patients");
            System.out.println("8. Clear All Patients");
			System.out.println("9. Exit");
			
			System.out.print("Enter your choice: \n");
			choice = sc.nextInt();
			sc.nextLine(); 

			if (choice == 1) {
				
				System.out.print("Enter patient name: ");
				String name = sc.nextLine();
				System.out.println("\nPatinet Arrived and wait for their Tuen");
				
				patient_Queue.addLast(name);
				
				System.out.println("\n"+ name + " added to the queue.");
				} 
			else if (choice == 2) {
				System.out.print("Enter emergency patient name: ");
				String emergencyName = sc.nextLine();
				
				System.out.println("\nEmergency patients are inserted at the front of the queue");
				patient_Queue.addFirst(emergencyName);
				
				System.out.println("\n"+ emergencyName + " added as emergency.");
				} 
			else if (choice == 3) {
				
				if (!patient_Queue.isEmpty()) {
					String removed = patient_Queue.removeFirst();
					
					System.out.println("1. cancel his Appoinment");
					System.out.println("2.done with treatment");
					
					System.out.print("Enter your option: \n");
					option = sc.nextInt();
					sc.nextLine(); 
					
					switch (option) {
						case 1:
							System.out.println(removed+ " cancel his Appoinment so he was removed");
							break;
					
						case 2: 
							System.out.println(removed +" Patient done with his treatment so he was removed");
							
						}
							
				} 	
				else {
					System.out.println("Queue is empty. No patient to remove.");
					}
				} 
			else if (choice == 4) {
				if (patient_Queue.isEmpty()) {
					System.out.println("No patients in the queue.");
				} 	
				else {
					System.out.println("Patients in Queue:");
					for (String patient : patient_Queue) {
						
						System.out.println("- " + patient);
						}
					}
				} 
			else if (choice == 5) {
				if (!patient_Queue.isEmpty()) {
					
					System.out.println("First patient in queue: " + patient_Queue.getFirst());
					System.out.println("Last patient in queue: " + patient_Queue.getLast());
				} 	
				else {
					System.out.println("Queue is empty.");
					}
				}
			else if (choice == 6) {
                
				System.out.print("Enter patient name to search: ");
                String searchName = sc.nextLine().toLowerCase();
                boolean found = false;
                
                for (String patient : patient_Queue) {
                    if (patient.toLowerCase().contains(searchName)) {
                        System.out.println("Found: " + patient);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Patient not found.");
                }
            }
            else if (choice == 7) 
            {
                
            	System.out.println("Total patients: " + patient_Queue.size());
            }
            else if (choice == 8) { 
            	patient_Queue.clear();
                System.out.println("All patients have been cleared from the queue.");
            }
            else if (choice == 9) 
            {
                System.out.println("Exiting... Stay healthy!");
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
		}
			
			catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
			}
		}
			while (choice != 9);
		
		sc.close();

    
	}

}
