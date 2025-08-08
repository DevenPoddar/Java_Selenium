package com.JDBC;

import java.util.Scanner;
import java.sql.*;

public class DB_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		Scanner sc = new Scanner(System.in);
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Shaikmasood2212!");		
	
		//Creating table
		/*
		Statement stmt=con.createStatement();

		String createsql="CREATE TABLE IF NOT EXISTS patientInfo("+"Id INT PRIMARY KEY AUTO_INCREMENT,"+"Name VARCHAR(100),"+"Age INT,"+"Disease VARCHAR(100),"+"Admission_Date VARCHAR(20),"+"Doctor_Assigned VARCHAR(100))";
	
		stmt.executeUpdate(createsql);
		System.out.println("Table patient created successfully");
		*/
		
		while (true) {
            System.out.println("\n===== Hospital Management Menu =====");
            System.out.println("1. Insert Patient");
            System.out.println("2. Update Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. View Patient Records");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1: // Inserting data
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Disease: ");
                String disease = sc.nextLine();
                System.out.print("Enter Admission Date (dd/MM/yyyy): ");
                String admissionDate = sc.nextLine();
                System.out.print("Enter Doctor Assigned: ");
                String doctor = sc.nextLine();
                
                String insertSql = "INSERT INTO patientinfo (Name, Age, Disease, Admission_Date, Doctor_Assigned) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pstmtInsert = con.prepareStatement(insertSql);
                
                pstmtInsert.setString(1, name);
                pstmtInsert.setInt(2, age);
                pstmtInsert.setString(3, disease);
                pstmtInsert.setString(4, admissionDate);
                pstmtInsert.setString(5, doctor);
                pstmtInsert.executeUpdate();
                
                System.out.println("");
                System.out.println("Patient inserted successfully.");
                
                break;
                
            case 2: // Update values
            	
            	System.out.print("Enter Patient ID to update: ");
                int updateId = sc.nextInt();
                sc.nextLine();
                
                System.out.println("\n--- Update Menu ---");
                System.out.println("1. Update Age");
                System.out.println("2. Update Disease");
                System.out.println("3. Update Age, Disease & Doctor Together");
                
                System.out.print("Enter your choice: ");
                int updateChoice = sc.nextInt();
                sc.nextLine();
                
                int rowsUpdated = 0;
                switch (updateChoice) {
                case 1: // Update Age
                    System.out.print("Enter new Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    
                    String updateAgeSql = "UPDATE patientinfo SET Age = ? WHERE Id = ?";
                    PreparedStatement pstmtAge = con.prepareStatement(updateAgeSql);
                    
                    pstmtAge.setInt(1, newAge);
                    pstmtAge.setInt(2, updateId);
                    rowsUpdated = pstmtAge.executeUpdate();
                    
                    break;
                    
                case 2: // Update Disease
                    System.out.print("Enter new Disease: ");
                    String newDisease = sc.nextLine();
                    
                    String updateDiseaseSql = "UPDATE patientinfo SET Disease = ? WHERE Id = ?";
                    PreparedStatement pstmtDisease = con.prepareStatement(updateDiseaseSql);
                    
                    pstmtDisease.setString(1, newDisease);
                    pstmtDisease.setInt(2, updateId);
                    pstmtDisease.executeUpdate();
                    
                    rowsUpdated = pstmtDisease.executeUpdate();
                    break;
                    
             
                   
               case 3: // Update all three fields
                    System.out.print("Enter new Age: ");
                    int updAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Disease: ");
                    String updDisease = sc.nextLine();
                    System.out.print("Enter new Doctor Assigned: ");
                    String updDoctor = sc.nextLine();
                    
                    String updateAllSql = "UPDATE patientinfo SET Age = ?, Disease = ?, Doctor_Assigned = ? WHERE Id = ?";
                    PreparedStatement pstmtAll = con.prepareStatement(updateAllSql);
                    
                    pstmtAll.setInt(1, updAge);
                    pstmtAll.setString(2, updDisease);
                    pstmtAll.setString(3, updDoctor);
                    pstmtAll.setInt(4, updateId);
                    pstmtAll.executeUpdate();
                    
                    rowsUpdated = pstmtAll.executeUpdate();
                    break;
                    
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
               
            if (rowsUpdated>0) {
            
            	System.out.println("Update operation completed:\n");
            	String selectSql = "SELECT * FROM patientinfo WHERE Id = ?";
                
            	PreparedStatement pstmtSelect = con.prepareStatement(selectSql);
                pstmtSelect.setInt(1, updateId);
                
                ResultSet rs = pstmtSelect.executeQuery();
                
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("Id") +
                                       ", Name: " + rs.getString("Name") +
                                       ", Age: " + rs.getInt("Age") +
                                       ", Disease: " + rs.getString("Disease") +
                                       ", Admission Date: " + rs.getString("Admission_Date") +
                                       ", Doctor Assigned: " + rs.getString("Doctor_Assigned"));
                }
            
            }
            else {
                System.out.println("No patient found with ID: " + updateId);
            }
            
            
            break;
            
            case 3: // Delete Patient records
                System.out.print("Enter Patient ID to delete: ");
                int deleteId = sc.nextInt();
                sc.nextLine();

                String deleteSql = "DELETE FROM patientinfo WHERE Id = ?";
                PreparedStatement pstmtDelete = con.prepareStatement(deleteSql);
                
                pstmtDelete.setInt(1, deleteId);
                int rowsDeleted = pstmtDelete.executeUpdate();

                if (rowsDeleted > 0) {
                    System.out.println("Patient with ID " + deleteId + " deleted successfully.");
                } else {
                    System.out.println("No patient found with ID: " + deleteId);
                }
                break;
                               
            case 4: // View all Patient
            	String viewSql = "SELECT * FROM patientinfo";
                
            	PreparedStatement pstmtView = con.prepareStatement(viewSql);
                ResultSet rs = pstmtView.executeQuery();
            	
                System.out.println("\n===== Patient Records =====");
                while (rs.next()) {
                    System.out.println(
                        "ID: " + rs.getInt("Id") +
                        ", Name: " + rs.getString("Name") +
                        ", Age: " + rs.getInt("Age") +
                        ", Disease: " + rs.getString("Disease") +
                        ", Admission Date: " + rs.getString("Admission_Date") +
                        ", Doctor Assigned: " + rs.getString("Doctor_Assigned")
                    );
                }
                break;
            	
            case 5: // Exit
                System.out.println("Exiting program...");
                con.close();
                sc.close();
                return;

            default:
                System.out.println("Invalid choice! Try again.");
            }
		}
	}
		
		catch (Exception e)
		{
		e.printStackTrace();
				
		}
	}
}
