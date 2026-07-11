package com.studentmanagement;
import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.db.DBConnection;
import com.studentmanagement.model.Student;


    public class Main {
        public static void main(String[] args) {
            DBConnection.getConnection();
            Student student = new Student(
                    0,
                    "Suhani Verma",
                    "suhani@gmail.com",
                    "9876543210",
                    "BCA",
                    "Computer Science",
                    5
            );

            StudentDAO dao = new StudentDAO();
            dao.addStudent(student);
        }
    }

