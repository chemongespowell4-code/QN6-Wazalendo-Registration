package com.mycompany.qn6.wazalendo;

public class Validation {
    public static String validateInputs(String memberId, String name, String nin, String phone, String depositStr) {
        if (memberId.isEmpty() || name.isEmpty() || nin.isEmpty() || phone.isEmpty() || depositStr.isEmpty()) {
            return "All fields must be filled!";
        }
        if (nin.length() != 14) {
            return "NIN must be exactly 14 characters!";
        }
        if (!phone.matches("\\d{10}")) {
            return "Phone must be numeric and 10 digits!";
        }
        try {
            double deposit = Double.parseDouble(depositStr);
            if (deposit <= 0) {
                return "Deposit must be positive!";
            }
        } catch (NumberFormatException ex) {
            return "Deposit must be numeric!";
        }
        return null; // valid
    }
}
