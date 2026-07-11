package com.studentmanagement.dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studentmanagement.db.DBConnection;
import com.studentmanagement.model.Student;

import java.sql.Connection;

public class StudentDAO {
    public void addStudent(Student student) {
        try {
            Connection connection = DBConnection.getConnection();
            String sql = "INSERT INTO students(name, email, phone, course, department, semester) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setString(4, student.getCourse());
            ps.setString(5, student.getDepartment());
            ps.setInt(6, student.getSemester());
            ps.executeUpdate();
            System.out.println("Student Added Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
