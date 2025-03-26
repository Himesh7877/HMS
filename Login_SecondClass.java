package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login_SecondClass extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;
    Login_SecondClass(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,590,290);
        panel.setBackground(new Color(27,45,72));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        textField1.setFont(new Font("Tahoma", Font.PLAIN,15));
        textField1.setBackground(new Color(167,199,231));
        panel.add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(167,199,231));
        panel.add(passwordField1);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Black and Gold Elegant Hotel Logo.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,-30,255,300);
        panel.add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBackground(Color.lightGray);
        b1.setForeground(Color.black);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.lightGray);
        b2.setForeground(Color.black);
        b2.addActionListener(this);
        panel.add(b2);

        setUndecorated(true);
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1){
            try {
                con c = new con();
                String user = textField1.getText();
                String pass = passwordField1.getText();

                String q = "select * from login2 where username = '" + user + "' and password = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    new Admin();
                    setVisible(false);

                }
                else if (textField1.getText().isBlank() && passwordField1.getText().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Username Or Password");
                }
                else if (textField1.getText().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Username");
                }
                else if (passwordField1.getText().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "Please Enter Password");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Username Or Password");
                }

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            new Dashboard();
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new Login_SecondClass();
    }
}