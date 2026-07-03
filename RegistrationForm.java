package com.mycompany.qn6.wazalendo;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {
    private JTextField memberIdField, nameField, ninField, phoneField, depositField;
    private JButton registerBtn, clearBtn, exitBtn;

    public RegistrationForm() {
        setTitle("Wazalendo SACCO - Member Registration");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen

        // Main panel with padding
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.setBackground(new Color(245, 245, 250));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont = new Font("SansSerif", Font.BOLD, 14);
        Font fieldFont = new Font("SansSerif", Font.PLAIN, 14);

        // Row 1: Member ID
        gbc.gridx = 0; gbc.gridy = 0;
        JLabel lblMemberId = new JLabel("Member ID:");
        lblMemberId.setFont(labelFont);
        panel.add(lblMemberId, gbc);

        gbc.gridx = 1;
        memberIdField = new JTextField();
        memberIdField.setFont(fieldFont);
        panel.add(memberIdField, gbc);

        // Row 2: Full Name
        gbc.gridx = 0; gbc.gridy = 1;
        JLabel lblName = new JLabel("Full Name:");
        lblName.setFont(labelFont);
        panel.add(lblName, gbc);

        gbc.gridx = 1;
        nameField = new JTextField();
        nameField.setFont(fieldFont);
        panel.add(nameField, gbc);

        // Row 3: NIN
        gbc.gridx = 0; gbc.gridy = 2;
        JLabel lblNIN = new JLabel("National ID (NIN):");
        lblNIN.setFont(labelFont);
        panel.add(lblNIN, gbc);

        gbc.gridx = 1;
        ninField = new JTextField();
        ninField.setFont(fieldFont);
        panel.add(ninField, gbc);

        // Row 4: Phone
        gbc.gridx = 0; gbc.gridy = 3;
        JLabel lblPhone = new JLabel("Phone Number:");
        lblPhone.setFont(labelFont);
        panel.add(lblPhone, gbc);

        gbc.gridx = 1;
        phoneField = new JTextField();
        phoneField.setFont(fieldFont);
        panel.add(phoneField, gbc);

        // Row 5: Deposit
        gbc.gridx = 0; gbc.gridy = 4;
        JLabel lblDeposit = new JLabel("Initial Deposit (UGX):");
        lblDeposit.setFont(labelFont);
        panel.add(lblDeposit, gbc);

        gbc.gridx = 1;
        depositField = new JTextField();
        depositField.setFont(fieldFont);
        panel.add(depositField, gbc);

        // Row 6: Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5));
        registerBtn = new JButton("Register");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");

        // Button styling
        registerBtn.setBackground(new Color(0, 153, 76));
        registerBtn.setForeground(Color.WHITE);
        clearBtn.setBackground(new Color(255, 153, 51));
        clearBtn.setForeground(Color.BLACK);
        exitBtn.setBackground(new Color(204, 0, 0));
        exitBtn.setForeground(Color.WHITE);

        buttonPanel.add(registerBtn);
        buttonPanel.add(clearBtn);
        buttonPanel.add(exitBtn);

        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RegistrationForm::new);
    }
}
