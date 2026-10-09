package hospitalmanagementsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class PatientManagement extends JFrame {
    
   ArrayList<Patient> patients = new ArrayList<>();
 
 
    JLabel lblId;
    JLabel lblName;
    JLabel lblAge;
    JLabel lblHistory;

    JTextField txtId;
    JTextField txtName;
    JTextField txtAge;
    JTextField txtHistory;

    JButton btnAdd;
    JButton btnUpdate;
    JButton btnDelete;
    JButton btnSearch;
    JButton btnBack;

    JTextArea display;

    public PatientManagement() {

        setTitle("Patient Management");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("PATIENT MANAGEMENT");
        title.setBounds(200, 20, 250, 30);
        add(title);

        lblId = new JLabel("Patient ID:");
        lblId.setBounds(50, 80, 100, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(160, 80, 300, 25);
        add(txtId);

        lblName = new JLabel("Name:");
        lblName.setBounds(50, 120, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(160, 120, 300, 25);
        add(txtName);

        lblAge = new JLabel("Age:");
        lblAge.setBounds(50, 160, 100, 25);
        add(lblAge);

        txtAge = new JTextField();
        txtAge.setBounds(160, 160, 300, 25);
        add(txtAge);

        lblHistory = new JLabel("Medical History:");
        lblHistory.setBounds(50, 200, 100, 25);
        add(lblHistory);

        txtHistory = new JTextField();
        txtHistory.setBounds(160, 200, 300, 25);
        add(txtHistory);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 250, 100, 35);
        add(btnAdd);
        

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(160, 250, 100, 35);
        add(btnUpdate);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(270, 250, 100, 35);
        add(btnDelete);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(380, 250, 100, 35);
        add(btnSearch);

        display = new JTextArea();
        display.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setBounds(50, 310, 430, 150);
        add(scrollPane);

        btnBack = new JButton("Back");
        btnBack.setBounds(200, 490, 150, 35);
        add(btnBack);

        
        btnAdd.addActionListener(e -> {

         if (txtId.getText().trim().isEmpty() ||
         txtName.getText().trim().isEmpty() ||
         txtAge.getText().trim().isEmpty() ||
         txtHistory.getText().trim().isEmpty()) {

         JOptionPane.showMessageDialog(this,
            "Please fill in all information!",
            "Input Error",
            JOptionPane.ERROR_MESSAGE);

         return;
       }

      int id = Integer.parseInt(txtId.getText());
      String name = txtName.getText();
      int age = Integer.parseInt(txtAge.getText());
      String history = txtHistory.getText();

      Patient patient = new Patient(id, name, age, history);
      patients.add(patient);

      display.append("ID: " + id +
        " | Name: " + name +
        " | Age: " + age +
        " | History: " + history + "\n");

      txtId.setText("");
      txtName.setText("");
      txtAge.setText("");
      txtHistory.setText("");
      });
    

        btnBack.addActionListener(e -> {
            dispose();
        });
        
       
    }
}

