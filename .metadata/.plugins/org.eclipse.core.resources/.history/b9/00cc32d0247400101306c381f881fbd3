package ex;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter number of faculties: ");
	        int faculty_count = sc.nextInt();
	        sc.nextLine();
	        
	        String[] facultyNames = new String[faculty_count];
	   
	        String[][] subjects = new String[faculty_count][];
	        for (int i = 0; i < faculty_count; i++) 
	        {
	            System.out.print("\nEnter name of Faculty " + (i + 1) + ": ");
	            facultyNames[i] = sc.nextLine();
	            
	            System.out.print("Enter number of subjects " + facultyNames[i] + " teaches: ");
	            int subjectCount = sc.nextInt();
	            sc.nextLine(); 
	            
	            subjects[i] = new String[subjectCount];

	            for (int j = 0; j < subjectCount; j++) {
	                System.out.print("Enter subject " + (j + 1) + ": ");
	                subjects[i][j] = sc.nextLine();
	            }
	        }
	        System.out.println("\n Faculty Subject Details:");
	        
	        for (int i = 0; i < faculty_count; i++) 
	        {
	            System.out.println(facultyNames[i] + " teaches:");
	            for (int j = 0; j < subjects[i].length; j++) 
	            {
	                System.out.println("   - " + subjects[i][j]);
	            }
	   
	        }
		
		
	}

}
