package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class DoctorRegistration {

	static class Doctor {
		private String ULN;
		private String name;
		private String department;

		public Doctor(String ULN, String name, String department) {
			this.ULN = ULN;
			this.name = name;
			this.department = department;
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Doctor))
				return false;
			Doctor doctor = (Doctor) obj;
			return ULN.equals(doctor.ULN);
		}

		public int hashCode() {
			return Objects.hash(ULN);
		}

		public String toString() {
			return "Doctor's Unique License Number: " + ULN + ", Name: " + name + ", Department: " + department;
		}
	}

	public static void main(String[] args) {
		HashSet<Doctor> doctors = new HashSet<>();
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("\n1. Register Doctor\n2. View Registered Doctors\n3. Exit");
			System.out.print("Select an option: ");

			int option = in.nextInt();
			in.nextLine();

			switch (option) {
			case 1:
				System.out.print("Enter Doctor's ULN to register: ");
				String ULN = in.nextLine();
				System.out.print("Enter Doctor's Name: ");
				String name = in.nextLine();
				System.out.print("Enter Doctor's Department: ");
				String department = in.nextLine();

				Doctor newDoctor = new Doctor(ULN, name, department);

				if (doctors.add(newDoctor)) {
					System.out.println("Doctor with ULN " + ULN + " registered successfully.");
				} else {
					System.out.println("Duplicate registration! Doctor with ULN " + ULN + " already exists.");
				}
				break;

			case 2:
				System.out.println("Display all Registered Doctors:");
				for (Doctor doctor : doctors) {
					System.out.println(doctor);
				}
				break;

			case 3:
				System.out.println("Exiting...");
				in.close();
				return;

			default:
				System.out.println("Invalid option. Try again.");
				break;
			}
		}
	}
}
