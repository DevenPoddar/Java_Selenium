package com.JDBC;

import java.sql.*;

public class Ex_Db {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Shaikmasood2212!");
			//System.out.println("Connected Successsfully");
			
			//Statement stmt=con.createStatement();
			
			//String sql="CREATE TABLE IF NOT EXISTS patinet("+"id INT PRIMARY KEY AUTO_INCREMENT,"+ "name VARCHAR(100),"+"age INT,"+"deases VARCHAR(100))";
			
			//stmt.executeUpdate(sql);
			//System.out.println("Table patient created successfully");

			
			/*String insertSql = "INSERT INTO patinet (name, age, deases) VALUES"
				+ "('Shaik', 23, 'Fever')," +
                  "('Abdul', 22, 'cold')," +
                  "('Masood', 19, 'body pain')";
			int rowsInserted = stmt.executeUpdate(insertSql);
			System.out.println(rowsInserted + " record(s) inserted.");
			
			
			*/
			
			 /*String insertSql = "INSERT INTO patinet (name, age, deases) VALUES (?, ?, ?)";
	         PreparedStatement pstmt = con.prepareStatement(insertSql);
	         String[][] data = 
	        	 {
	        		 {"Aajay","23","Fever"},
	        		 {"Jack", "24","Cough"}
	        	 };
  			for(String[] row : data)
  			{
     			pstmt.setString(1, row[0]);
     			pstmt.setInt(2, Integer.parseInt(row[1]));
     			pstmt.setString(3, row[2]);
     			pstmt.executeUpdate();
     		}
	     	*/
			// Update the values:
			
			String updatesql = "UPDATE patinet SET name = ? WHERE  name = ?";
		
			
			PreparedStatement pstmt = con.prepareStatement(updatesql);
			
			
			// 1st update
			pstmt.setString(1, "Ajay Pratap");
			pstmt.setString(2, "Aajay");
			pstmt.addBatch();
			
			//2nd update
			pstmt.setString(1, "John sena");
			pstmt.setString(2, "Jack");
			pstmt.addBatch();
			
			
			//3rd time
			pstmt.setString(1, "Mass");
			pstmt.setString(2, "Masood Ahammed");
			pstmt.addBatch();
			
			
			//int rowsUpdated = pstmt.executeUpdate();
			
			int[] rowsUpdated = pstmt.executeBatch();
			System.out.println(" record(s) updated.");
	     		con.close();
	         
	
		 }
		catch (Exception e)
		{
		e.printStackTrace();
				
		}
		

	}

}
 
