package com.Set;

import java.util.*;

class Doctor{
	private int l_no;
	private String name;
	private String dept;
	
	public Doctor(int l_no, String name, String dept) {
		this.l_no = l_no;
		this.name = name;
		this.dept = dept;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Doctor)) return false;
		
		Doctor other = (Doctor) obj;
		//return l_no.equalsIgnoreCase(other.l_no);
		
		return String.valueOf(this.l_no).equalsIgnoreCase(String.valueOf(other.l_no));
	}
	
	
	public int hashCode() {
		
		//return l_no.toLowerCase().hashCode();
		
		return String.valueOf(l_no).toLowerCase().hashCode();
	}
	
	public String toString() {
		return "License : "+l_no +", Name : "+name+",Department : "+ dept;
	}
}


public class Doctor_Registration_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashSet<Doctor> doctors = new HashSet<>();
		
		doctors.add(new Doctor(1, "Dr. Abdul Masood", "surgeon "));
        doctors.add(new Doctor(2, "Dr. Jack", "Neurology"));
        doctors.add(new Doctor(3, "Dr. Simran", "Anesthesia"));
		
		int choice;
		
		do {
            System.out.println("\n---Doctor Registration Menu ---");
            System.out.println("1. Register New Doctor");
            System.out.println("2. View All Registered Doctors");
            System.out.println("3. Exit");
            
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            	case 1:
            		
            		System.out.print("Enter License Number: ");
                    int l_no = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter Doctor Name: ");
                    String name = sc.nextLine();
                    
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    
            		Doctor newDoctor = new Doctor(l_no, name, dept);
            		
            		if (doctors.add(newDoctor)) {
                        System.out.println("Doctor registered successfully.");
                    } 
            		else {
                        System.out.println("Doctor already registered with License: " + l_no);
                    }
                    break;
                    
            	 case 2:
                     if (doctors.isEmpty()) {
                         System.out.println("No doctors registered yet.");
                     } else {
                         System.out.println("Registered Doctors:");
                         for (Doctor d : doctors) {
                             System.out.println(d);
                         }
                     }
                     break;
            	 default:
                     System.out.println("Invalid choice. Try again.");
             }
         } while (choice != 3);

         sc.close();
                  
                   
	}

}
