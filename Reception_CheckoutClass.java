package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Reception_CheckoutClass extends JFrame {
    Reception_CheckoutClass(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(27,45,72));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Check-Out");
        label.setBounds(100,20,200,30);
        label.setFont(new Font("Tahoma",Font.BOLD,25));
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel UserId = new JLabel("Customer Id");
        UserId.setBounds(30,80,150,30);
        UserId.setFont(new Font("Tahoma",Font.BOLD,14));
        UserId.setForeground(Color.WHITE);
        panel.add(UserId);

        Choice Customer = new Choice();
        Customer.setBounds(200,80,150,25);
        Customer.setBackground(new Color(167,199,231));
        Customer.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(Customer);

        JLabel roomNum = new JLabel("Room Number");
        roomNum.setBounds(30,130,150,30);
        roomNum.setFont(new Font("Tahoma",Font.BOLD,14));
        roomNum.setForeground(Color.WHITE);
        panel.add(roomNum);

        JLabel labelRoomnumber = new JLabel();
        labelRoomnumber.setBounds(200,130,150,30);
        labelRoomnumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelRoomnumber.setBackground(new Color(167,199,231));
        labelRoomnumber.setForeground(Color.WHITE);
        panel.add(labelRoomnumber);

        JLabel checkintime = new JLabel("Check-In Time");
        checkintime.setBounds(30,180,150,30);
        checkintime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkintime.setForeground(Color.WHITE);
        panel.add(checkintime);

        JLabel labelcheckintime = new JLabel();
        labelcheckintime.setBounds(200,180,250,30);
        labelcheckintime.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcheckintime.setBackground(new Color(167,199,231));
        labelcheckintime.setForeground(Color.WHITE);
        panel.add(labelcheckintime);

        JLabel checkouttime = new JLabel("Check-Out Time");
        checkouttime.setBounds(30,230,150,30);
        checkouttime.setFont(new Font("Tahoma",Font.BOLD,14));
        checkouttime.setForeground(Color.WHITE);
        panel.add(checkouttime);

        Date date = new Date();

        JLabel labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,250,30);
        labelcheckouttime.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelcheckouttime.setBackground(new Color(167,199,231));
        labelcheckouttime.setForeground(Color.WHITE);
        panel.add(labelcheckouttime);


        try{
            con c = new con();
            ResultSet resultSet = c.statement.executeQuery("select * from CustomerDetailes");
            while (resultSet.next()){
                Customer.add(resultSet.getString("number"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        JButton checkOut = new JButton("Check-Out");
        checkOut.setBounds(30,300,120,30);
        checkOut.setForeground(Color.black);
        checkOut.setBackground(Color.lightGray);
        checkOut.setFont(new Font("serif",Font.BOLD,15));
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                   /* if(labelRoomnumber.getText().isBlank() && labelcheckintime.getText().isBlank()   )
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }

                    else if(labelRoomnumber.getText().isBlank())
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else if(labelcheckintime.getText().isBlank())
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else {
                    }
                    */

                    if(Customer.getSelectedItem()==null)
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else {
                        con cv = new con();
                        cv.statement.executeUpdate("delete from CustomerDetailes where number = '" + Customer.getSelectedItem() + "'");
                        cv.statement.executeUpdate("update room set availability = 'Available' where roomnumber = '" + labelRoomnumber.getText() + "'");
                        JOptionPane.showMessageDialog(null, "Done");
                        setVisible(false);
                    }

                }catch (Exception E ){
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.black);
        check.setBackground(Color.lightGray);
        check.setFont(new Font("serif",Font.BOLD,15));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con c = new con();
                try{

                    if(Customer.getSelectedItem()==null)
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else {
                    ResultSet resultSet = c.statement.executeQuery("select * from CustomerDetailes where number = '"+Customer.getSelectedItem()+"'");
                    while (resultSet.next()) {
                        labelRoomnumber.setText(resultSet.getString("room"));
                        labelcheckintime.setText(resultSet.getString("checkin"));
                    }
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.black);
        back.setBackground(Color.lightGray);
        back.setFont(new Font("serif",Font.BOLD,15));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



        setUndecorated(true);
        setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception_CheckoutClass();
    }
}