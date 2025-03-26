package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

public class Add_EmployeeClass extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox comboBox;
    JButton add,back;
    Add_EmployeeClass(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(27,45,72));
        add(panel);

        JLabel AED = new JLabel("ADD EMPLOYEE DETAILS");
        AED.setBounds(450,24,445,35);
        AED.setFont(new Font("Tahoma", Font.BOLD, 31));
        AED.setForeground(Color.WHITE);
        panel.add(AED);


        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("Tahoma", Font.BOLD, 16));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(200,30,150,27);
        nameText.setBackground(new Color(167,199,231));
        nameText.setFont(new Font("Tahoma", Font.BOLD,14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        JLabel Age = new JLabel("AGE");
        Age.setBounds(60,80,150,27);
        Age.setFont(new Font("Tahoma", Font.BOLD, 16));
        Age.setForeground(Color.WHITE);
        panel.add(Age);
        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(167,199,231));
        ageText.setFont(new Font("Tahoma", Font.BOLD,14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60,125,150,27);
        gender.setFont(new Font("Tahoma", Font.BOLD, 16));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200,125,70,27);
        radioButtonM.setBackground(new Color(167,199,231));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280,125,100,27);
        radioButtonF.setBackground(new Color(167,199,231));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD,14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        JLabel job = new JLabel("JOB");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("Tahoma", Font.BOLD,16));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk", "Housekeeping", "Kitchen Staff","Room Service", "Manager", "Accountant","Chef"});
        comboBox.setBackground(new Color(167,199,231));
        comboBox.setBounds(200,170,150,30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("Tahoma", Font.BOLD, 16));
        salary.setForeground(Color.WHITE);
        panel.add(salary);
        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(167,199,231));
        salaryText.setFont(new Font("Tahoma", Font.BOLD,14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("Tahoma", Font.BOLD, 16));
        phone.setForeground(Color.WHITE);
        panel.add(phone);
        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(167,199,231));
        phoneText.setFont(new Font("Tahoma", Font.BOLD,14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,320,150,27);
        aadhar.setFont(new Font("Tahoma", Font.BOLD, 16));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);
        aadharText = new JTextField();
        aadharText.setBounds(200,320,150,27);
        aadharText.setBackground(new Color(167,199,231));
        aadharText.setFont(new Font("Tahoma", Font.BOLD,14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("Tahoma", Font.BOLD, 16));
        email.setForeground(Color.WHITE);
        panel.add(email);
        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(167,199,231));
        emailText.setFont(new Font("Tahoma", Font.BOLD,14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(Color.lightGray);
        add.setForeground(Color.black);
        add.setFont(new Font("serif", Font.BOLD, 17));
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(200,420,100,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.setFont(new Font("serif", Font.BOLD, 17));
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,100,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadhar = aadharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if (radioButtonM.isSelected()){
                gender = "Male";
            } else if(radioButtonF.isSelected()){
                gender = " Female";
            }


             if(nameText.getText().isBlank() && ageText.getText().isBlank() && salaryText.getText().isBlank() && phoneText.getText().isBlank() && emailText.getText().isBlank() && aadharText.getText().isBlank() )
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }

            else if(nameText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(ageText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(salaryText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(ageText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(phoneText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(emailText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
            else if(aadharText.getText().isBlank())
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }


else {
                 try {
                     con c = new con();
                     String q = "insert into employeedetailes values('" + name + "', '" + age + "', '" + gender + "', '" + job + "', '" + salary + "','" + phone + "', '" + email + "', '" + aadhar + "')";
                     c.statement.executeUpdate(q);
                     JOptionPane.showMessageDialog(null, "Employee Added");
                     setVisible(false);

                 } catch (Exception E) {
                     E.printStackTrace();
                 }

             }
        }
        else
        {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Add_EmployeeClass();
    }
}