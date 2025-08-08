package fileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient implements Serializable {
	int id;
	String name;
	String disease;
	int age;

	public Patient(int id, String name, String disease, int age) {
		this.id = id;
		this.name = name;
		this.disease = disease;
		this.age = age;
	}

	public String toString() {
		return "ID = " + id + ", Name = " + name + ", Age = " + age + ", Disease = " + disease;
	}
}

public class PatientsRecords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Patient> patientsList = new ArrayList<>();

		boolean patients = true;

		while (patients) {
			System.out.println("Enter patient ID:");
			int id = in.nextInt();
			in.nextLine();

			System.out.println("Enter patient name:");
			String name = in.nextLine();

			System.out.println("Enter patient disease:");
			String disease = in.nextLine();

			System.out.println("Enter patient age:");
			int age = in.nextInt();
			in.nextLine();

			Patient p = new Patient(id, name, disease, age);
			patientsList.add(p);

			System.out.println("Do you want to add another patient record? (yes/no)");
			String answer = in.nextLine().toLowerCase();
			if (!answer.equals("yes") && !answer.equals("y")) {
				patients = false;
			}
		}

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("patient.dat"));
			out.writeObject(patientsList);
			out.close();
			System.out.println("All patients saved.");
		} catch (IOException e) {
			System.out.println("Error writing file.");
		}

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("patient.dat"));
			List<Patient> savedPatients = (List<Patient>) input.readObject();
			input.close();
			System.out.println("\nSaved Patient Records:");
			for (Patient patient : savedPatients) {
				System.out.println(patient);
			}
		} catch (Exception e) {
			System.out.println("Error reading file.");
		}

		in.close();
	}
}
