package inheritance;

public class Person {
	void showDetails() {
        System.out.println("Person details shown");
    }
}
class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}
class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}

