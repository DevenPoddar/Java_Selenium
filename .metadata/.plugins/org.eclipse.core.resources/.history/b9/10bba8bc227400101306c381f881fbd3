package Day_3;

public class Patient {
	
	private String patient_Id;
    private String name;
    private int age;
    private String disease;
    
    public void setPatientId(String patientId) {
        this.patient_Id = patientId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age entered. Please enter age greater than > 0");
        }
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getPatientId() {
        return patient_Id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDisease() {
        return disease;
    }
    public void display() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        
    }
    


}
