/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.echipamentdebucatarie;

/**
 *
 * @author Gigabyte
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class EchipamenteGUI {

    // Declaram elementele GUI
    private JFrame frame;
    private JTextArea textArea;
    private JTextField pretMinField;
    private JTextField pretMaxField;
    private JTextField garantieMinField;
    private JTextField garantieMaxField;
    private JComboBox<String> tipEchipamentComboBox;
    private JButton filterButton;
    private ArrayList<EchipamentdeBucatarie> echipamente;

    // Declaram tabelul pentru afisarea echipamentelor
    private JTable equipmentTable;
    private DefaultTableModel tableModel;

    public EchipamenteGUI() {
        // Initializarea obiectelor de echipamente
        echipamente = new ArrayList<>();
        initData();

        // Creare fereastră
        frame = new JFrame("Echipamente de Bucatarie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 500);

        // Creare panou de control
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));  // Am adăugat încă un câmp pentru tipul echipamentului

        // Adăugarea câmpurilor de input pentru preț, garanție și tipul echipamentului
        panel.add(new JLabel("Preț Minim:"));
        pretMinField = new JTextField();
        panel.add(pretMinField);

        panel.add(new JLabel("Preț Maxim:"));
        pretMaxField = new JTextField();
        panel.add(pretMaxField);

        panel.add(new JLabel("Garanție Minimă (luni):"));
        garantieMinField = new JTextField();
        panel.add(garantieMinField);

        panel.add(new JLabel("Garanție Maximă (luni):"));
        garantieMaxField = new JTextField();
        panel.add(garantieMaxField);

        panel.add(new JLabel("Tip Echipament:"));
        tipEchipamentComboBox = new JComboBox<>(new String[]{"Toate", "Expressor", "Cafetiera"});
        panel.add(tipEchipamentComboBox);

        filterButton = new JButton("Filtrează");
        panel.add(filterButton);

        // Zona de afisare rezultate
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Tabelul pentru afisare
        String[] columnNames = {"Tip Echipament", "Marca", "Model", "Pret", "Garanție"};
        tableModel = new DefaultTableModel(columnNames, 0);
        equipmentTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(equipmentTable);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(tableScrollPane, BorderLayout.CENTER);
        frame.setVisible(true);

        // Setare ascultător pe butonul "Filtrează"
        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterEchipamente();
            }
        });

        // Populăm tabelul automat la pornire
        populateTableWithData();
    }

    private void initData() {
        // Creare date pentru Expressor
        for (int i = 0; i < 10; i++) {
            echipamente.add(new Expressor("Expressor" + i, "ModelX" + i, 500.0 + i * 50, 24, "Automat", 
                                          1.2 + i * 0.1, 1450 + i * 100, true, "Cafea boabe", "Negru"));
        }

        // Creare date pentru Cafetiera
        for (int i = 0; i < 10; i++) {
            echipamente.add(new Cafetiera("Cafetiera" + i, "ModelC" + i, 200.0 + i * 20, 18, "Manual", 
                                          1.0 + i * 0.2, "Plastic", false, 6, "Filtru permanent"));
        }
    }

    private void populateTableWithData() {
        // Curățăm tabelul înainte de populare
        tableModel.setRowCount(0);

        // Populăm tabelul cu toate echipamentele
        for (EchipamentdeBucatarie echipament : echipamente) {
            tableModel.addRow(new Object[]{
                echipament.tipEchipament(),
                echipament.getMarca(),
                echipament.getModel(),
                echipament.getPret(),
                echipament.getGarantie()
            });
        }
    }

    private void filterEchipamente() {
        // Citim condițiile de filtrare din GUI
        double pretMin = Double.parseDouble(pretMinField.getText());
        double pretMax = Double.parseDouble(pretMaxField.getText());
        int garantieMin = Integer.parseInt(garantieMinField.getText());
        int garantieMax = Integer.parseInt(garantieMaxField.getText());
        String tipEchipament = (String) tipEchipamentComboBox.getSelectedItem();

        // Creare text de rezultate
        StringBuilder result = new StringBuilder();
        tableModel.setRowCount(0); // Resetăm tabelul

        // Filtrare echipamente
        for (EchipamentdeBucatarie echipament : echipamente) {
            boolean matchesPret = echipament.getPret() >= pretMin && echipament.getPret() <= pretMax;
            boolean matchesGarantie = echipament.getGarantie() >= garantieMin && echipament.getGarantie() <= garantieMax;
            boolean matchesTip = tipEchipament.equals("Toate") || echipament.tipEchipament().equals(tipEchipament);

            // Aplicăm toate condițiile de filtrare
            if (matchesPret && matchesGarantie && matchesTip) {
                result.append(echipament).append("\n");
                // Adăugăm echipamentul în tabel
                tableModel.addRow(new Object[]{
                    echipament.tipEchipament(),
                    echipament.getMarca(),
                    echipament.getModel(),
                    echipament.getPret(),
                    echipament.getGarantie()
                });
            }
        }

        // Afișare rezultate
        textArea.setText(result.toString());
    }

    public static void main(String[] args) {
        new EchipamenteGUI();
    }
}
