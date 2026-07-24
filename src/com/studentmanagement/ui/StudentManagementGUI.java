package com.studentmanagement.ui;

import com.studentmanagement.dao.StudentDAO;
import com.studentmanagement.model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class StudentManagementGUI extends JFrame {

    private JTextField idField;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextField courseField;
    private JTextField departmentField;
    private JTextField semesterField;

    private JTable table;
    private DefaultTableModel model;
    private JLabel totalStudentsLabel;

    public StudentManagementGUI() {

        setTitle("Student Management System");
        setSize(1120,760);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        getContentPane().setBackground(new Color(245,248,255));

        // ===========================
        // TITLE
        // ===========================

        JLabel title = new JLabel("STUDENT MANAGEMENT SYSTEM");
        title.setBounds(180,15,650,40);
        title.setFont(new Font("Segoe UI",Font.BOLD,28));
        title.setForeground(new Color(25,60,120));
        add(title);



        // ===========================
        // LABELS
        // ===========================

        JLabel idLabel = new JLabel("Student ID");
        idLabel.setBounds(50,110,120,30);
        idLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(idLabel);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50,150,120,30);
        nameLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(nameLabel);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50,190,120,30);
        emailLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(emailLabel);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(50,230,120,30);
        phoneLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(phoneLabel);

        JLabel courseLabel = new JLabel("Course");
        courseLabel.setBounds(50,270,120,30);
        courseLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(courseLabel);

        JLabel departmentLabel = new JLabel("Department");
        departmentLabel.setBounds(50,310,120,30);
        departmentLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(departmentLabel);

        JLabel semesterLabel = new JLabel("Semester");
        semesterLabel.setBounds(50,350,120,30);
        semesterLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        add(semesterLabel);

        // ===========================
        // TEXT FIELDS
        // ===========================

        idField = new JTextField();
        idField.setBounds(180,110,220,30);
        idField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(idField);

        nameField = new JTextField();
        nameField.setBounds(180,150,220,30);
        nameField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(nameField);

        emailField = new JTextField();
        emailField.setBounds(180,190,220,30);
        emailField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(emailField);

        phoneField = new JTextField();
        phoneField.setBounds(180,230,220,30);
        phoneField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(phoneField);

        courseField = new JTextField();
        courseField.setBounds(180,270,220,30);
        courseField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(courseField);

        departmentField = new JTextField();
        departmentField.setBounds(180,310,220,30);
        departmentField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(departmentField);

        semesterField = new JTextField();
        semesterField.setBounds(180,350,220,30);
        semesterField.setFont(new Font("Segoe UI",Font.PLAIN,15));
        add(semesterField);
        // ===========================
        // BUTTONS
        // ===========================

        JButton addButton = new JButton("ADD");
        addButton.setBounds(470,110,140,40);
        add(addButton);

        addButton.setBackground(new Color(39,174,96));
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        addButton.setFocusPainted(false);

        JButton updateButton = new JButton("UPDATE");
        updateButton.setBounds(470,165,140,40);
        add(updateButton);

        updateButton.setBackground(new Color(41,128,185));
        updateButton.setForeground(Color.WHITE);
        updateButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        updateButton.setFocusPainted(false);

        JButton deleteButton = new JButton("DELETE");
        deleteButton.setBounds(470,220,140,40);
        add(deleteButton);

        deleteButton.setBackground(new Color(192,57,43));
        deleteButton.setForeground(Color.WHITE);
        deleteButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        deleteButton.setFocusPainted(false);

        JButton searchButton = new JButton("SEARCH");
        searchButton.setBounds(640,110,140,40);
        add(searchButton);

        searchButton.setBackground(new Color(243,156,18));
        searchButton.setForeground(Color.WHITE);
        searchButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        searchButton.setFocusPainted(false);

        JButton viewButton = new JButton("VIEW");
        viewButton.setBounds(640,165,140,40);
        add(viewButton);

        viewButton.setBackground(new Color(142,68,173));
        viewButton.setForeground(Color.WHITE);
        viewButton.setFont(new Font("Segoe UI",Font.BOLD,14));
        viewButton.setFocusPainted(false);

        // ===========================
        // TABLE
        // ===========================

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Course");
        model.addColumn("Department");
        model.addColumn("Semester");

        table = new JTable(model);


        table.setRowHeight(28);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        table.getTableHeader().setFont(
                new Font("Segoe UI", Font.BOLD, 15));

        table.getTableHeader().setBackground(
                new Color(52,73,94));

        table.getTableHeader().setForeground(Color.WHITE);

        table.setGridColor(Color.LIGHT_GRAY);
// ================= Dashboard Panel =================

        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(null);
        dashboardPanel.setBounds(760, 80, 300, 240);
        dashboardPanel.setBackground(new java.awt.Color(240, 248, 255));
        dashboardPanel.setBorder(BorderFactory.createTitledBorder("Dashboard"));
        add(dashboardPanel);

// Total Students
        JLabel totalTitle = new JLabel("Total Students");
        totalTitle.setBounds(220, 30, 60, 30);
        totalTitle.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 16));
        dashboardPanel.add(totalTitle);

        totalStudentsLabel = new JLabel("0");
        totalStudentsLabel.setBounds(200, 30, 70, 30);
        totalStudentsLabel.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 18));
        totalStudentsLabel.setForeground(new java.awt.Color(41, 128, 185));
        dashboardPanel.add(totalStudentsLabel);

// Current Date
        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(20, 90, 60, 25);
        dashboardPanel.add(dateLabel);

        JLabel currentDate = new JLabel(java.time.LocalDate.now().toString());
        currentDate.setBounds(90, 90, 180, 25);
        dashboardPanel.add(currentDate);

// Current Time
        JLabel timeLabel = new JLabel("Time:");
        timeLabel.setBounds(20, 130, 60, 25);
        dashboardPanel.add(timeLabel);

        JLabel currentTime = new JLabel(java.time.LocalTime.now().withNano(0).toString());
        currentTime.setBounds(90, 130, 180, 25);
        dashboardPanel.add(currentTime);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20,430,1070,280);
        add(scrollPane);

        JLabel footer = new JLabel("Developed by Suhani Verma");
        footer.setBounds(20,650,250,20);
        footer.setForeground(Color.GRAY);
        footer.setFont(new Font("Segoe UI",Font.PLAIN,13));
        add(footer);
        // ===========================
        // ADD BUTTON
        // ===========================

        addButton.addActionListener(e -> {

            try {
                // Validation

                if (nameField.getText().trim().isEmpty() ||
                        emailField.getText().trim().isEmpty() ||
                        phoneField.getText().trim().isEmpty() ||
                        courseField.getText().trim().isEmpty() ||
                        departmentField.getText().trim().isEmpty() ||
                        semesterField.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(this,
                            "All Fields are Required!");

                    return;
                }

// Email Validation

                if (!emailField.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {

                    JOptionPane.showMessageDialog(this,
                            "Enter Valid Email!");

                    return;
                }

// Phone Validation

                if (!phoneField.getText().matches("\\d{10}")) {

                    JOptionPane.showMessageDialog(this,
                            "Phone Number Must Be 10 Digits!");

                    return;
                }

// Semester Validation

                int semester = Integer.parseInt(semesterField.getText());

                if (semester < 1 || semester > 8) {

                    JOptionPane.showMessageDialog(this,
                            "Semester Must Be Between 1 and 8!");

                    return;
                }

                Student student = new Student(
                        0,
                        nameField.getText(),
                        emailField.getText(),
                        phoneField.getText(),
                        courseField.getText(),
                        departmentField.getText(),
                        semester
                );

                StudentDAO dao = new StudentDAO();

                dao.addStudent(student);

                JOptionPane.showMessageDialog(
                        this,
                        "Student Added Successfully!"
                );


                clearFields();

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please Enter Valid Data!"
                );

            }

        });

        // ===========================
        // VIEW BUTTON
        // ===========================

        viewButton.addActionListener(e -> {

            model.setRowCount(0);

            StudentDAO dao = new StudentDAO();

            List<Student> students = dao.getAllStudents();

            for (Student s : students) {

                model.addRow(new Object[]{
                        s.getId(),
                        s.getName(),
                        s.getEmail(),
                        s.getPhone(),
                        s.getCourse(),
                        s.getDepartment(),
                        s.getSemester()
                });

            }

        });

        // ===========================
        // SEARCH BUTTON
        // ===========================

        searchButton.addActionListener(e -> {

            try {
                model.setRowCount(0);

                int id = Integer.parseInt(idField.getText());

                StudentDAO dao = new StudentDAO();





                Student student = dao.searchStudent(id);


                if (student != null) {

                    nameField.setText(student.getName());
                    emailField.setText(student.getEmail());
                    phoneField.setText(student.getPhone());
                    courseField.setText(student.getCourse());
                    departmentField.setText(student.getDepartment());
                    semesterField.setText(
                            String.valueOf(student.getSemester())
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Student Not Found!"
                    );

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter Valid Student ID!"
                );

            }

        });
        // ===========================
        // UPDATE BUTTON
        // ===========================

        updateButton.addActionListener(e -> {

            try {

                int id = Integer.parseInt(idField.getText());

                String newCourse = courseField.getText();

                StudentDAO dao = new StudentDAO();

                dao.updateStudent(id, newCourse);

                JOptionPane.showMessageDialog(
                        this,
                        "Student Updated Successfully!"
                );

                clearFields();

                model.setRowCount(0);

                List<Student> students = dao.getAllStudents();

                for (Student s : students) {

                    model.addRow(new Object[]{
                            s.getId(),
                            s.getName(),
                            s.getEmail(),
                            s.getPhone(),
                            s.getCourse(),
                            s.getDepartment(),
                            s.getSemester()
                    });

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Update Failed!"
                );

            }

        });

        // ===========================
        // DELETE BUTTON
        // ===========================

        deleteButton.addActionListener(e -> {

            try {

                int id = Integer.parseInt(idField.getText());

                StudentDAO dao = new StudentDAO();

                dao.deleteStudent(id);

                JOptionPane.showMessageDialog(
                        this,
                        "Student Deleted Successfully!"
                );

                clearFields();

                model.setRowCount(0);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Delete Failed!"
                );

            }

        });
        updateDashboard();

        setVisible(true);

    }

    // ===========================
    // CLEAR FIELDS
    // ===========================

    private void clearFields() {

        idField.setText("");
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        courseField.setText("");
        departmentField.setText("");
        semesterField.setText("");

    }
    private void updateDashboard() {

        StudentDAO dao = new StudentDAO();

        List<Student> students = dao.getAllStudents();

        totalStudentsLabel.setText(String.valueOf(students.size()));
    }
}