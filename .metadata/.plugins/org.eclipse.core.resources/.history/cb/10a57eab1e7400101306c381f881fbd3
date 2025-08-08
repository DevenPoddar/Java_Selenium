package com.Set;

import java.util.*;

class Doctor_Info{
	private int appoin_no;
	private String p_name;
	private String d_name;
	private String date;
	private String time;
	
	
	public Doctor_Info(int appoin_no, String p_name, String d_name, String date, String time) {
		this.appoin_no = appoin_no;
		this.p_name = p_name;
		this.d_name = d_name;
		this.date = date;
		this.time = time;
	}
	
    public int getAppoin_no() {
        return appoin_no;
    }

    public String getP_name() {
        return p_name;
    }

    public String getD_name() {
        return d_name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
    
    public void setAppoin_no(int appoin_no) {
        this.appoin_no = appoin_no;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
     	
    public int compareTo(Doctor_Info other) {
        String thisDateTime = this.date + " " + this.time;
        String otherDateTime = other.date + " " + other.time;
        return thisDateTime.compareTo(otherDateTime);
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Doctor_Info)) return false;
        Doctor_Info other = (Doctor_Info) obj;
        return Objects.equals(this.p_name, other.p_name) &&
               Objects.equals(this.d_name, other.d_name) &&
               Objects.equals(this.date, other.date) &&
               Objects.equals(this.time, other.time);
    }

    public int hashCode() {
        return Objects.hash(p_name, d_name, date, time);
    }
    
    
    public String toString() {
        return "Appointment No: " + appoin_no +", Patient Name: " + p_name + ", Doctor Name: " + d_name +", Date: " + date +", Time: " + time;
    }
	
	
	
}


public class HospitalAppointments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        TreeSet<Doctor_Info> appointments = new TreeSet<>();
	
		int choice;
		
		  while (true) {
	            
			  System.out.println("\n--- Hospital Appointment Management ---");	            
			  System.out.println("1. Add Appointment");	            
			  System.out.println("2. View All Appointments");
	          System.out.println("3. Exit");
	          System.out.print("Enter choice: ");
	          
	          try {
	            	
	        	  choice = Integer.parseInt(sc.nextLine());

	        	  switch (choice) {
	        	  
	        	  case 1:
	        		  
	        		  try {
	        			  
	        			  System.out.print("Enter Appointment No: ");
	        			  int appNo = Integer.parseInt(sc.nextLine());

	        			  System.out.print("Enter Patient Name: ");
	        			  String pName = sc.nextLine();

	        			  System.out.print("Enter Doctor Name: ");
	        			  String dName = sc.nextLine();

	        			  System.out.print("Enter Date (yyyy-mm-dd): ");
	        			  String date = sc.nextLine();

	                      System.out.print("Enter Time (HH:mm): ");
	                      String time = sc.nextLine();

	                          
	                      Doctor_Info newApp = new Doctor_Info(appNo, pName, dName, date, time);

	                      if (appointments.add(newApp)) {
	                                
	                    	  System.out.println("Appointment Added Successfully!");
	                    	  
	                    	  }
	                      else {
	                    	  
	                    	  System.out.println("Duplicate Appointment! Not Added.");
	                    	  }
	                        } 
	        		  catch (NumberFormatException e) {
	        			
	        			  System.out.println("Invalid number format. Please enter numbers where required.");
	        			  
	        		  }
	        		  break;

	        	  case 2:
	        		  
	        		  if (appointments.isEmpty()) {
	        			  
	        			  System.out.println("No appointments scheduled.");
	        			  } 
	        		  else {
	        			  
	        			  System.out.println("\n--- All Appointments (Sorted) ---");
	        			  for (Doctor_Info d : appointments) {
	        				  
	        				  System.out.println(d);
	        				  }
	        			  }
	        		  break;
	                        
	        	  case 3:
	        		  System.out.println("Exiting...");
	        		  sc.close();
	        		  return;

	        	  default:
	        		  
	        		  System.out.println("Invalid choice. Please enter 1, 2, or 3.");
	        		  
	        	  }
	        	  
	          } 
	          
	          catch (NumberFormatException e) {
	        	  
	        	  System.out.println("Please enter a valid numeric menu choice.");
	        	  }
		  
	          sc.close();
		  }
		  
                  
                   
	}

}
