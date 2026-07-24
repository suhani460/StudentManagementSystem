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

    public StudentManagementGUI() {

        setTitle("Student Management System");
        setSize(1000,700);
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

        JLabel subtitle = new JLabel("Student Database Dashboard");
        subtitle.setBounds(330,55,300,25);
        subtitle.setFont(new Font("Segoe UI",Font.PLAIN,16));
        subtitle.setForeground(Color.GRAY);
        add(subtitle);

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

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20,430,940,210);
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

                Student student = new Student(
                        0,
                        nameField.getText(),
                        emailField.getText(),
                        phoneField.getText(),
                        courseField.getText(),
                        departmentField.getText(),
                        Integer.parseInt(semesterField.getText())
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

}