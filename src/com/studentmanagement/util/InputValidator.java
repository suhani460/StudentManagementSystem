package com.studentmanagement.util;

public class InputValidator {
    public static boolean isValidName(String name) {

        return !name.trim().isEmpty();
    }
        public static boolean isValidEmail(String email) {

            return email.contains("@") && email.contains(".");

        }
    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");

    }

    public static boolean isValidSemester(int semester) {
        return semester >=1 && semester <= 8;
    }
}



