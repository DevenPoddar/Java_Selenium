package Day_3;
import java.util.Scanner;

public class Company_Employee {
	
	private int id;
    private String name;
    private Department dept;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return dept;
    }
    public void assignDepartment(Department dept) {
        this.dept = dept;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        if (dept != null) {
            System.out.println("Assigned Department is : " + dept.getDepartmentName());
        } else {
            System.out.println("No department is assigned.");
        }
    }
} 
class Department {
    private String deptName;

    public String getDepartmentName() {
        return deptName;
    }

    public void setCName(String name) {
        this.deptName = name;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        
        Company_Employee emp = new Company_Employee();
        
        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        Department course = new Department();
        
        System.out.print("Enter Course Name: ");
        course.setCourseName(sc.nextLine());
        emp.assignDepartment(dept);
        System.out.println("\n Assigned Info:");
        emp.displayInfo();

		
	}

}

