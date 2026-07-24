package com.studentmanagement.ui;

import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Login");
        setSize(450, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(245,248,255));

        JLabel title = new JLabel("STUDENT MANAGEMENT SYSTEM");
        title.setBounds(35,20,380,35);
        title.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD,22));
        title.setForeground(new java.awt.Color(25,60,120));
        add(title);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(180,70,100,30);
        loginLabel.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD,20));
        add(loginLabel);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(60,120,100,25);
        add(userLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(160,120,180,30);
        add(usernameField);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(60,170,100,25);
        add(passLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(160,170,180,30);
        add(passwordField);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(140,230,150,40);
        loginButton.setBackground(new java.awt.Color(41,128,185));
        loginButton.setForeground(java.awt.Color.WHITE);
        loginButton.setFocusPainted(false);
        add(loginButton);

        loginButton.addActionListener(e -> {

            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin123")) {

                JOptionPane.showMessageDialog(this, "Login Successful!");

                dispose(); // Login window close

                new StudentManagementGUI(); // Dashboard open

            } else {

                JOptionPane.showMessageDialog(this,
                        "Invalid Username or Password!");

            }

        });
        JCheckBox showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(160, 205, 150, 20);
        showPassword.setBackground(new java.awt.Color(245,248,255));
        add(showPassword);

        showPassword.addActionListener(e -> {

            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }

        });

        getRootPane().setDefaultButton(loginButton);

        setVisible(true);
        JLabel footer = new JLabel("Developed by Suhani Verma");
        footer.setBounds(120, 290, 220, 20);
        footer.setForeground(java.awt.Color.GRAY);
        add(footer);

        setVisible(true);
    }
}
