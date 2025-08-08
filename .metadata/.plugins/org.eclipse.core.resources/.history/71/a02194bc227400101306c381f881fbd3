package Day_3;

public class Employee {
	
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0;
            System.out.println("Invalid salary.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary. Must be non-negative.");
        }
    }

}
