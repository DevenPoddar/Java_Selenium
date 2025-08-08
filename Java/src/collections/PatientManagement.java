package collections;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
	String name;
	String disease;

	Patient(String name, String disease) {
		this.name = name;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient{Name='" + name + "', Disease='" + disease + "'}";
	}
}

public class PatientManagement {
	private static ArrayList<Patient> patients = new ArrayList<>();
	private static Scanner in = new Scanner(System.in);

	private static void addNewPatient() {
		System.out.print("Enter patient name: ");
		String name = in.nextLine();
		System.out.print("Enter disease: ");
		String disease = in.nextLine();
		patients.add(new Patient(name, disease));
		System.out.println("Patient added successfully.");
	}

	private static void viewAllPatients() {
		if (patients.isEmpty()) {
			System.out.println("No patients found.");
			return;
		}
		System.out.println("All Patients:");
		for (int i = 0; i < patients.size(); i++) {
			System.out.println(i + ": " + patients.get(i));
		}
	}

	private static void patientByIndex() {
		System.out.print("Enter patient index: ");
		int index = Integer.parseInt(in.nextLine());
		if (index < 0 || index >= patients.size()) {
			System.out.println("Invalid index.");
			return;
		}
		System.out.println("Patient at index " + index + ": " + patients.get(index));
	}

	private static void updatePatientDisease() {
		System.out.print("Enter patient index to update: ");
		int index = Integer.parseInt(in.nextLine());
		if (index < 0 || index >= patients.size()) {
			System.out.println("Invalid index.");
			return;
		}
		System.out.print("Enter new disease: ");
		String newDisease = in.nextLine();
		patients.get(index).disease = newDisease;
		System.out.println("Patient disease updated.");
	}

	private static void removePatientByIndex() {
		System.out.print("Enter patient index to remove: ");
		int index = Integer.parseInt(in.nextLine());
		if (index < 0 || index >= patients.size()) {
			System.out.println("Invalid index.");
			return;
		}
		patients.remove(index);
		System.out.println("Patient removed.");
	}

	private static void removePatientByName() {
		System.out.print("Enter patient name to remove: ");
		String name = in.nextLine();
		boolean removed = patients.removeIf(patient -> patient.name.equalsIgnoreCase(name));
		if (removed) {
			System.out.println("Patient(s) removed.");
		} else {
			System.out.println("No patient with that name found.");
		}
	}

	private static void checkIfPatientExists() {
		System.out.print("Enter patient name to check: ");
		String name = in.nextLine();
		boolean exists = false;
		for (Patient patient : patients) {
			if (patient.name.equalsIgnoreCase(name)) {
				exists = true;
				break;
			}
		}
		System.out.println("Patient exists: " + exists);
	}

	private static void showTotalPatients() {
		System.out.println("Total patients: " + patients.size());
	}

	private static void clearAllRecords() {
		patients.clear();
		System.out.println("All patient records cleared.");
	}

	private static void findFirstLastIndexOfPatient() {
		System.out.print("Enter patient name to find indexes: ");
		String name = in.nextLine();
		int firstIndex = -1;
		int lastIndex = -1;
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).name.equalsIgnoreCase(name)) {
				if (firstIndex == -1)
					firstIndex = i;
				lastIndex = i;
			}
		}
		if (firstIndex == -1) {
			System.out.println("No patient found with that name.");
		} else {
			System.out.println("First index: " + firstIndex + ", Last index: " + lastIndex);
		}
	}

	private static void checkIfListIsEmpty() {
		System.out.println("Is patient list empty? " + patients.isEmpty());
	}

	public static void main(String[] args) {
		System.out.println("-----Patient Management System-----");
		while (true) {
			System.out.println("\n1. Add New Patient");
			System.out.println("2. View All Patients");
			System.out.println("3. Patient by Index");
			System.out.println("4. Update Patient Disease");
			System.out.println("5. Remove Patient by Index");
			System.out.println("6. Remove Patient by Name");
			System.out.println("7. Check if Patient Exists");
			System.out.println("8. Show Total Patients");
			System.out.println("9. Clear All Records");
			System.out.println("10. Find First/Last Index of a Patient");
			System.out.println("11. Check if List is Empty");
			System.out.println("12. Exit");
			System.out.print("Choose option: ");

			String input = in.nextLine();
			int option;
			try {
				option = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, please enter a number from 1 to 12.");
				continue;
			}
			option = Integer.parseInt(input);
			switch (option) {
			case 1:
				addNewPatient();
				break;
			case 2:
				viewAllPatients();
				break;
			case 3:
				patientByIndex();
				break;
			case 4:
				updatePatientDisease();
				break;
			case 5:
				removePatientByIndex();
				break;
			case 6:
				removePatientByName();
				break;
			case 7:
				checkIfPatientExists();
				break;
			case 8:
				showTotalPatients();
				break;
			case 9:
				clearAllRecords();
				break;
			case 10:
				findFirstLastIndexOfPatient();
				break;
			case 11:
				checkIfListIsEmpty();
				break;
			case 12: 
				System.out.println("Exiting system. Goodbye!");
				return;
			default:
				System.out.println("Invalid option. Please choose between 1 and 12.");
			}
		}
	}
}
