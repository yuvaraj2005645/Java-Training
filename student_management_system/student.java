
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class student {

    static final String URL =
            "jdbc:mysql://localhost:3306/student_management";

    static final String USER = "root";
    static final String PASSWORD = "yuvaraj@1234";

    public static void main(String[] args) {

        try (
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Scanner sc = new Scanner(System.in)
        ) {

            System.out.println("MySQL Connected Successfully!");

            int choice;

            do {
                System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        addStudent(con, sc);
                        break;

                    case 2:
                        displayStudents(con);
                        break;

                    case 3:
                        searchStudent(con, sc);
                        break;

                    case 4:
                        updateStudent(con, sc);
                        break;

                    case 5:
                        deleteStudent(con, sc);
                        break;

                    case 6:
                        System.out.println("Thank you! Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 6);

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }

    // 1. INSERT STUDENT

    static void addStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        String sql = "INSERT INTO students "
                   + "(name, email, age, course) "
                   + "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.setString(4, course);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student inserted successfully!");
            }
        }
    }

    // 2. SELECT ALL STUDENTS

    static void displayStudents(Connection con)
            throws SQLException {

        String sql = "SELECT * FROM students ORDER BY id";

        try (
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            System.out.println("\n===== STUDENT DETAILS =====");
            System.out.println("ID | NAME | EMAIL | AGE | COURSE");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                    rs.getInt("id") + " | "
                    + rs.getString("name") + " | "
                    + rs.getString("email") + " | "
                    + rs.getInt("age") + " | "
                    + rs.getString("course")
                );
            }

            if (!found) {
                System.out.println("No students found.");
            }
        }
    }

    // 3. SEARCH STUDENT BY ID

    static void searchStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "SELECT * FROM students WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    System.out.println("\nStudent Found!");

                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Email: " + rs.getString("email"));
                    System.out.println("Age: " + rs.getInt("age"));
                    System.out.println("Course: " + rs.getString("course"));

                } else {
                    System.out.println("Student not found!");
                }
            }
        }
    }

    // 4. UPDATE STUDENT

    static void updateStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student ID to update: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter new name: ");
        String name = sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        System.out.print("Enter new age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        String sql = "UPDATE students SET name = ?, email = ?, "
                   + "age = ?, course = ? WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, age);
            ps.setString(4, course);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student ID not found!");
            }
        }
    }

    // 5. DELETE STUDENT

    static void deleteStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM students WHERE id = ?";

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
