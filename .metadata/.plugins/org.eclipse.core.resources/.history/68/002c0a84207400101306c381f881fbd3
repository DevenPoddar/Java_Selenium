package com;
import java.util.*;

public class Patient_Managaement_System {
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        
        
        patients.add(new Patient("Jack", 45,"Male","fever"));
        patients.add(new Patient("Rose", 40,"Female","Cough"));
        patients.add(new Patient("Celvin", 30,"Male","Pain"));
        
        int choice;

        do {
        	
            System.out.println("\n1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Check if List is Empty");
            System.out.println("11. Exit");
            
            System.out.print("Choose option: ");
            
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
            	
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine(); 
                
                System.out.print("Enter gender: ");
                String gender = sc.nextLine();
                
                System.out.print("Enter disease: ");
                String disease = sc.nextLine();

                patients.add(new Patient(name, age, gender, disease));
                System.out.println("Patient added successfully!");

            } 
            else if (choice == 2) {
                if (patients.size() == 0) {
                    System.out.println("No patients found.");
                    
                } 
                else {
                    System.out.println("Index\tName\tAge\tGender\tDisease");
                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println(i + "\t" + patients.get(i).Display());
                    }
                }

            } 
            else if (choice == 3) {
            	
                System.out.print("Enter index: ");
                int index = sc.nextInt();
                
                if (index >= 0 && index < patients.size()) {
                    System.out.println("Patient: " + patients.get(index).Display());
                } else {
                    System.out.println("Invalid index.");
                }

            } 
            
            
            else if (choice == 4) {
            	
                System.out.print("Enter index to update disease: ");
                int index = sc.nextInt();
                sc.nextLine();
                
                if (index >= 0 && index < patients.size()) {
                    System.out.print("Enter new disease: ");
                    String disease = sc.nextLine();
                    patients.get(index).setDisease(disease);
                    System.out.println("Disease updated.");
                } 
                else {
                    System.out.println("Invalid index.");
                }

            } 
            else if (choice == 5) {
                System.out.print("Enter index to remove: ");
                int index = sc.nextInt();
                
                if (index >= 0 && index < patients.size()) {
                    patients.remove(index);
                    System.out.println("Patient removed.");
                } else {
                    System.out.println("Invalid index.");
                }

            } else if (choice == 6) {
            	
                System.out.print("Enter patient name to remove: ");
                String name = sc.nextLine();
                
                boolean found = false;
                for (int i = 0; i < patients.size(); i++) {
                	
                    if (patients.get(i).getName().equalsIgnoreCase(name)) {
                        patients.remove(i);
                        System.out.println("Patient removed.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Patient not found.");
                }

            } 
            
            else if (choice == 7) {
                System.out.print("Enter name to check: ");
                String name = sc.nextLine();
                
                boolean exists = false;
                for (int i = 0; i < patients.size(); i++) {
                	
                    if (patients.get(i).getName().equalsIgnoreCase(name)) {
                        exists = true;
                        break;
                    }
                }
                System.out.println("Exists: " + exists);

            } 
            else if (choice == 8) {
                System.out.println("Total patients: " + patients.size());

            } 
            else if (choice == 9) {
                patients.clear();
                System.out.println("All records cleared.");

            }
            else if (choice == 10) {
                System.out.println("List empty: " + patients.isEmpty());

            } 
            else if (choice == 11) {
                System.out.println("Exiting...");
            } 
            else {
                System.out.println("Invalid option.");
            }

        } 
        while (choice != 12);

        }
}