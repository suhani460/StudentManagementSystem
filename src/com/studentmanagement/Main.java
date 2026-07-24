//package com.studentmanagement;
//
//import com.studentmanagement.util.InputValidator;
//import com.studentmanagement.dao.StudentDAO;
//import com.studentmanagement.db.DBConnection;
//import com.studentmanagement.model.Student;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        DBConnection.getConnection();
//
//        StudentDAO dao = new StudentDAO();
//
//        boolean running = true;
//
//        while (running) {
//
//            System.out.println("\n===== Student Management System =====");
//            System.out.println("1. Add Student");
//            System.out.println("2. View Students");
//            System.out.println("3. Update Student");
//            System.out.println("4. Delete Student");
//            System.out.println("5. Search Student");
//            System.out.println("6. Exit");
//
//            System.out.print("Enter your choice: ");
//            int choice = sc.nextInt();
//
//
//            switch (choice) {
//
//                case 1:
//
//                    sc.nextLine();
//
//                    System.out.print("Enter Name: ");
//                    String name = sc.nextLine();
//
//                    if (!InputValidator.isValidName(name)) {
//                        System.out.println("Invalid Name!");
//                        break;
//                    }
//
//                    System.out.print("Enter Email: ");
//                    String email = sc.nextLine();
//
//                    if (!InputValidator.isValidEmail(email)) {
//                        System.out.println("Invalid Email!");
//                        break;
//                    }
//
//                    System.out.print("Enter Phone: ");
//                    String phone = sc.nextLine();
//
//                    if (!InputValidator.isValidPhone(phone)) {
//                        System.out.println("Phone number must be exactly 10 digits!");
//                        break;
//                    }
//
//                    System.out.print("Enter Course: ");
//                    String course = sc.nextLine();
//
//                    System.out.print("Enter Department: ");
//                    String department = sc.nextLine();
//
//                    System.out.print("Enter Semester: ");
//                    int semester = sc.nextInt();
//
//                    if (!InputValidator.isValidSemester(semester)) {
//                        System.out.println("Semester must be between 1 and 8!");
//                        break;
//                    }
//
//
//                    Student student = new Student(
//                            0,
//                            name,
//                            email,
//                            phone,
//                            course,
//                            department,
//                            semester
//                    );
//
//                    dao.addStudent(student);
//                    if (name.trim().isEmpty()) {
//                        System.out.println("Name cannot be empty!");
//                        break;
//                    }
//
//                    break;
//
//                case 2:
//
//                    dao.viewStudents();
//
//                    break;
//
//                case 3:
//
//                    System.out.print("Enter Student ID: ");
//                    int id = sc.nextInt();
//
//                    sc.nextLine();
//
//                    System.out.print("Enter New Course: ");
//                    String newCourse = sc.nextLine();
//
//                    dao.updateStudent(id, newCourse);
//
//                    break;
//
//                case 4:
//
//                    System.out.print("Enter Student ID: ");
//                    int deleteId = sc.nextInt();
//
//                    dao.deleteStudent(deleteId);
//
//                    break;
//
//                case 5:
//
//                    System.out.print("Enter Student ID: ");
//                    int searchId = sc.nextInt();
//
//                    dao.searchStudent(searchId);
//
//                    break;
//
//                case 6:
//
//                    System.out.println("Thank you for using Student Management System!");
//                    running = false;
//
//                    break;
//
//                default:
//
//                    System.out.println("Invalid Choice!");
//
//            }
//        }
//
//
//        sc.close();

//    }
//}

package com.studentmanagement;
import com.studentmanagement.ui.LoginFrame;

import com.studentmanagement.ui.StudentManagementGUI;

public class Main {

    public static void main(String[] args) {

        new LoginFrame();

    }
}


