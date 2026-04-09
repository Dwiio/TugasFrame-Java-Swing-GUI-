/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasframe;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField tfUsername;
    JPasswordField pfPassword;
    JRadioButton rbLaki, rbPerempuan;
    JButton btnLogin;

    public LoginFrame() {
        setTitle("Login Page");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(8, 1, 5, 5));

        JLabel lblTitle = new JLabel("Selamat Datang!", JLabel.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));

        JLabel lblDesc = new JLabel("Silakan masuk untuk melanjutkan", JLabel.CENTER);

        tfUsername = new JTextField();
        pfPassword = new JPasswordField();

        rbLaki = new JRadioButton("Laki-laki");
        rbPerempuan = new JRadioButton("Perempuan");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbLaki);
        bg.add(rbPerempuan);

        JPanel panelGender = new JPanel();
        panelGender.add(rbLaki);
        panelGender.add(rbPerempuan);

        btnLogin = new JButton("Login");

        add(lblTitle);
        add(lblDesc);
        add(new JLabel("Username"));
        add(tfUsername);
        add(new JLabel("Password"));
        add(pfPassword);
        add(new JLabel("Jenis Kelamin"));
        add(panelGender);
        add(btnLogin);

        // EVENT LOGIN
        btnLogin.addActionListener(e -> {
            String username = tfUsername.getText();
            String password = new String(pfPassword.getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username atau Password tidak boleh kosong!");
            } else {
                String gender = rbLaki.isSelected() ? "Mr." : "Mrs.";
                new MainFrame(username, gender);
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}