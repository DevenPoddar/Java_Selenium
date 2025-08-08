package com.Set;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Appointment {
	
    private String patientName;
    private String doctorName;
    private String visittime;

    public Appointment(String patientName, String doctorName, String visittime ) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.visittime = visittime;
    }

    @Override
    public String toString() {
        return "Patient: " + patientName + ", Doctor: " + doctorName + ", Visit Time: "+ visittime;
    }
}

public class Patient_Appointment_Book {

    public static void main(String[] args) {
        // TreeMap will store appointments sorted by booking time
    	
        TreeMap<String,TreeMap<String, Appointment>> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        while (true) {
        	
            System.out.println("\n---Patient Appointment Scheduler---");
            System.out.println("1. Book Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. View First and Last Appointment");
            System.out.println("5. Exit");
            
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                	
                    System.out.print("Enter Patient Name: ");
                    String patient = sc.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctor = sc.nextLine();
                    System.out.println("Enter Visit time (DD:MM:YY) :");
                    String vtime = sc.nextLine();

                    // Capture current system time
                    String currentTime = LocalDateTime.now().format(dtf);

                    // Store in TreeMap
                    TreeMap<String, Appointment> t1 = new TreeMap<>();
                    t1.put(currentTime, new Appointment(patient, doctor, vtime));
                    
                    appointments.put(vtime, t1);
                    
                    for (Map.Entry<String, TreeMap<Integer, String>> deptEntry : appointments.entrySet()) {
                        System.out.println("Department: " + deptEntry.getKey());
                        for (Map.Entry<Integer, String> empEntry : deptEntry.getValue().entrySet()) {
                            System.out.println("  ID: " + empEntry.getKey() + ", Name: " + empEntry.getValue());
                        }
                    
                    //appointments.put(currentTime, new Appointment(patient, doctor, vtime));
                    System.out.println("Appointment booked at " + currentTime);
                    break;

                
                //    break;

                case 3:
                    System.out.print("Enter Booking Time to remove (yyyy-MM-dd HH:mm:ss): ");
                    String removeTime = sc.nextLine();
                    if (appointments.remove(removeTime) != null) {
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("Appointment not found.");
                    }
                    break;

                case 4:
                    if (!appointments.isEmpty()) {
                        System.out.println("First Appointment: \n Booking time : "+appointments.firstEntry().getKey() + " : " + appointments.firstEntry().getValue());
                        System.out.println("Last Appointment:\n Booking time :  " + appointments.lastEntry().getKey() + " : " +appointments.lastEntry().getValue());

                    } 
                    else {
                        System.out.println("No appointments scheduled.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
                    }
        }
    }
}

 

