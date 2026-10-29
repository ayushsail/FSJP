
package com.fsjp;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    static String url = "jdbc:mysql://localhost:3306/fsjp_db";
    static String user = "root";
    static String password = "root";

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(url, user, password);
             Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n--- Student Management ---");
                System.out.println("1. Insert Student");
                System.out.println("2. Display Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        insertStudent(con, sc);
                        break;

                    case 2:
                        displayStudents(con);
                        break;

                    case 3:
                        updateStudent(con, sc);
                        break;

                    case 4:
                        deleteStudent(con, sc);
                        break;

                    case 5:
                        System.out.println("Program ended.");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    static void insertStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);

            ps.executeUpdate();
            System.out.println("Student inserted successfully!");
        }
    }

    static void displayStudents(Connection con) throws SQLException {

        String sql = "SELECT * FROM students";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.println("\n--- Student Records ---");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("-----------------------");
            }
        }
    }

    static void updateStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        String sql =
            "UPDATE students SET name=?, age=?, course=? WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, course);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student ID not found!");
            }
        }
    }

    static void deleteStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        String sql = "DELETE FROM students WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student ID not found!");
            }
        }
    }
}
