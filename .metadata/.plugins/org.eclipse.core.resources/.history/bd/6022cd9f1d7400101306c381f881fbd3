package com.healthcare;

public class Cardiologist extends Doctor {
	
	public Cardiologist(String name) {
        super(name, "Cardiologist");
    }

	@Override
	public void diagnose(Patients patient) {
		// TODO Auto-generated method stub

		if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println(name + " (" + specialization +") is treating " +
                               patient.getName() + ": Specialized heart treatment.");
        } else {
            System.out.println(name + " (" +specialization + ") is diagnosing " +
                               patient.getName() + ":Illness not heart-related.");
        }
	}

}
