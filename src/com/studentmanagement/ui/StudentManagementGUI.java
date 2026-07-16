package com.studentmanagement.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

public class StudentManagementGUI extends JFrame {
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField courseField;
    private JTextField departmentField;
    private JTextField semesterField;
    public StudentManagementGUI(){

        setTitle("Student Management System");

        setSize(700, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

         nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 100, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);
        add(emailField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(50, 150, 100, 30);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(150, 150, 200, 30);
        add(phoneField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 200, 100, 30);
        add(courseLabel);

         courseField = new JTextField();
        courseField.setBounds(150, 200, 200, 30);
        add(courseField);

        JLabel departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(50, 250, 100, 30);
        add(departmentLabel);

        departmentField = new JTextField();
        departmentField.setBounds(150, 250, 200, 30);
        add(departmentField);

        JLabel semesterLabel = new JLabel("Semester:");
        semesterLabel.setBounds(50, 300, 100, 30);
        add(semesterLabel);

        semesterField = new JTextField();
        semesterField.setBounds(150, 300, 200, 30);
        add(semesterField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(400, 50, 120, 30);
        add(addButton);
        addButton.addActionListener(new ActionListener() {



                @Override
                public void actionPerformed(ActionEvent e) {
                    try{

                    String name = nameField.getText();
                    String email = emailField.getText();
                    String phone = phoneField.getText();
                    String course = courseField.getText();
                    String department = departmentField.getText();
                    int semester = Integer.parseInt(semesterField.getText());

                    Student student = new Student(
                            0,
                            name,
                            email,
                            phone,
                            course,
                            department,
                            semester
                    );

                    StudentDAO dao = new StudentDAO();

                    dao.addStudent(student);

                    JOptionPane.showMessageDialog(null, "Student Added Successfully!");

                        // Clear fields
                        nameField.setText("");
                        emailField.setText("");
                        phoneField.setText("");
                        courseField.setText("");
                        departmentField.setText("");
                        semesterField.setText("");

                    } catch (Exception ex) {

                        JOptionPane.showMessageDialog(null, "Please Enter Valid Data!");

                    }

                }
        });


        JButton updateButton = new JButton("Update");
        updateButton.setBounds(400, 100, 120, 30);
        add(updateButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 150, 120, 30);
        add(deleteButton);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(400, 200, 120, 30);
        add(searchButton);

        JButton viewButton = new JButton("View");
        viewButton.setBounds(400, 250, 120, 30);
        add(viewButton);



        setVisible(true);
    }
}
