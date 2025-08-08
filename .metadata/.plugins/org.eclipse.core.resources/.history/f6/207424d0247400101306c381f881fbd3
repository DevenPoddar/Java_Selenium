package ex;

import java.util.Scanner;
public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String [] Students = {"Jack", "Devil", "Masood"};
		int days = 4;
		
		int[][] attendance = new int[Students.length][days];
		
		for (int i = 0; i < Students.length; i++) {
            System.out.println("Enter attendance for Student " + (i + 1) + " (1 = Present, 0 = Absent):");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                attendance[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nAttendance Table:");
        for (int i = 0; i < Students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < days; j++) {
                System.out.print(attendance[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTotal Present Days per Student:");
        for (int i = 0; i < Students.length; i++) {
            int presentDays = 0;
            for (int j = 0; j < days; j++) {
                if (attendance[i][j] == 1) {
                    presentDays++;
                }
            }
            System.out.println(Students[i] + " present for " + presentDays+ " days");
        }

	}

}
