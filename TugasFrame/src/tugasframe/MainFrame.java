/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasframe;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    JTextField tfPanjang, tfLebar, tfTinggi;
    JLabel lblLuas, lblKeliling, lblVolume, lblLuasPermukaan;

    public MainFrame(String username, String gender) {
        setTitle("Halaman Utama");
        setSize(450, 450);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(12, 2, 5, 5));

        JLabel lblWelcome = new JLabel("Welcome, " + gender + " " + username);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 16));
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);

        tfPanjang = new JTextField();
        tfLebar = new JTextField();
        tfTinggi = new JTextField();

        JButton btnHitung = new JButton("Hitung");
        JButton btnReset = new JButton("Reset");

        lblLuas = new JLabel("-");
        lblKeliling = new JLabel("-");
        lblVolume = new JLabel("-");
        lblLuasPermukaan = new JLabel("-");

        add(lblWelcome);
        add(new JLabel(""));

        add(new JLabel("Panjang"));
        add(tfPanjang);

        add(new JLabel("Lebar"));
        add(tfLebar);

        add(new JLabel("Tinggi"));
        add(tfTinggi);

        add(btnHitung);
        add(btnReset);

        add(new JLabel("Luas Persegi"));
        add(lblLuas);

        add(new JLabel("Keliling Persegi"));
        add(lblKeliling);

        add(new JLabel("Volume Balok"));
        add(lblVolume);

        add(new JLabel("Luas Permukaan Balok"));
        add(lblLuasPermukaan);

        // EVENT HITUNG
        btnHitung.addActionListener(e -> {
            try {
                double p = Double.parseDouble(tfPanjang.getText());
                double l = Double.parseDouble(tfLebar.getText());
                double t = Double.parseDouble(tfTinggi.getText());

                double luas = p * l;
                double keliling = 2 * (p + l);
                double volume = p * l * t;
                double luasPermukaan = 2 * ((p*l) + (p*t) + (l*t));

                lblLuas.setText(String.valueOf(luas));
                lblKeliling.setText(String.valueOf(keliling));
                lblVolume.setText(String.valueOf(volume));
                lblLuasPermukaan.setText(String.valueOf(luasPermukaan));

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input harus angka!");
            }
        });

        // EVENT RESET
        btnReset.addActionListener(e -> {
            tfPanjang.setText("");
            tfLebar.setText("");
            tfTinggi.setText("");

            lblLuas.setText("-");
            lblKeliling.setText("-");
            lblVolume.setText("-");
            lblLuasPermukaan.setText("-");
        });

        setVisible(true);
    }
}
