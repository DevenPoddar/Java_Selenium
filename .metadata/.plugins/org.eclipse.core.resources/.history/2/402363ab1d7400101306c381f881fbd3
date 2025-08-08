package com.healthcare;

public class Hospital_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patients p1 = new Patients(1,"Jack",23,"Fever");
		Patients p2 = new Patients(2,"Leo", 25, "Heart Attack");
		Patients p3 = new Patients(3,"Simbha",34,"Stomack Pain");
		
		Patient_Service_Imple ps1= new Patient_Service_Imple();
		ps1.register_Patient(p1);
		ps1.register_Patient(p2);
		ps1.register_Patient(p3);
		ps1.show_Patient_Details(p2);
		
		Doctor d1 = new General_Physician("Dr.Abdul Masood");
		Doctor d2 = new Cardiologist("Dr. Vikram");
		
		System.out.println("\nDiagnosis: ");
		
			d1.diagnose(p1);
			d2.diagnose(p2);
	}


}
