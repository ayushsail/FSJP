import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    float marks;

    private static final Scanner s = new Scanner(System.in);

    void inputDetails() {
        System.out.print("Enter name: ");
        name = s.nextLine();

        System.out.print("Enter roll number: ");
        rollNumber = s.nextInt();

        System.out.print("Enter marks: ");
        marks = s.nextFloat();

        s.nextLine(); // Consume the leftover newline
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}


public class A1_ObjectAndClasses {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter details of Student 1:");
        s1.inputDetails();

        System.out.println("\nEnter details of Student 2:");
        s2.inputDetails();

        System.out.println("\nStudent 1 Details:");
        s1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
    }
}
