package com.healthcare;

public class Patient_Service_Imple implements Patient_Service {

	private Patients[] p = new Patients[3];
    private int count = 0;
    
	public void register_Patient(Patients patient) {
		if (count < p.length) {
            p[count++] = patient;
            System.out.println("Patient registered successfully.");
        } 
		else 
		{
            System.out.println("Registration failed: Patient list is full.");
        }
	}

	public void show_Patient_Details(Patients patient) {
		// TODO Auto-generated method stub

	        for (int i = 0; i < count; i++) {
	            Patients pa = p[i];
	            System.out.println("ID: " + pa.getId() + ", Name: " + pa.getName()
	                    + ", Age: " + pa.getAge() + ", Illness: " + pa.getIllness());
	        }
	}
	public Patients[] getPatients() {
        return p;
        }
	public int getPatientCount() {
        return count;
    }
}
	
