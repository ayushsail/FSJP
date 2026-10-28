class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



// Q4: Single Inheritance
class Student extends Person {
    private String course;
    private int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        super.displayPersonDetails();
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
    }
}



// Q5: Multilevel Inheritance
class GraduateStudent extends Student {
    private int graduationYear;

    GraduateStudent(String name, int age, String course,
                    int rollNumber, int graduationYear) {
        super(name, age, course, rollNumber);
        this.graduationYear = graduationYear;
    }

    void displayGraduateStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Graduation Year: " + graduationYear);
    }
}



// Q6: Hierarchical Inheritance
class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacherDetails() {
        super.displayPersonDetails();
        System.out.println("Subject: " + subject);
    }
}


class Administrator extends Person {
    private String department;
    private String designation;

    Administrator(String name, int age,
                  String department, String designation) {
        super(name, age);
        this.department = department;
        this.designation = designation;
    }

    void displayAdministratorDetails() {
        super.displayPersonDetails();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}


// Main Class
public class A4_Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student(
            "Ayush", 19, "AI & DS", 101
        );

        GraduateStudent g1 = new GraduateStudent(
            "Riya", 22, "Computer Engineering", 205, 2026
        );

        Teacher t1 = new Teacher(
            "Mr. Sharma", 40, "Java Programming"
        );

        Administrator a1 = new Administrator(
            "Mrs. Desai", 45, "Academic Office",
            "Head Administrator"
        );

        System.out.println("=== STUDENT (Q4) ===");
        s1.displayStudentDetails();

        System.out.println("\n=== GRADUATE STUDENT (Q5) ===");
        g1.displayGraduateStudentDetails();

        System.out.println("\n=== TEACHER (Q6) ===");
        t1.displayTeacherDetails();

        System.out.println("\n=== ADMINISTRATOR (Q6) ===");
        a1.displayAdministratorDetails();
    }
}
