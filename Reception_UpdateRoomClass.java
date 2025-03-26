package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Reception_UpdateRoomClass extends JFrame {
    Reception_UpdateRoomClass(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(27,45,72));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1  = new JLabel("Update Room Status");
        label1.setBounds(124,14,222,25);
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2  = new JLabel("ID :");
        label2.setBounds(25,88,46,14);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice ch = new Choice();
        ch.setBounds(248,85,140,20);
        ch.setBackground(new Color(167,199,231));
        ch.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(ch);

        try {
            con C = new con();
            ResultSet resultSet = C.statement.executeQuery("select * from CustomerDetailes");
            while (resultSet.next()){
                ch.add(resultSet.getString("number"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel label3  = new JLabel("Room Number :");
        label3.setBounds(25,129,125,14);
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField textField3 = new JTextField();
        textField3.setBounds(248,129,140,20);
        textField3.setBackground(new Color(167,199,231));
        textField3.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField3);

        JLabel label4  = new JLabel("Availability :");
        label4.setBounds(25,174,125,14);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField textField4 = new JTextField();
        textField4.setBounds(248,174,140,20);
        textField4.setBackground(new Color(167,199,231));
        textField4.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField4);

        JLabel label5  = new JLabel("Clean Status :");
        label5.setBounds(25,216,125,14);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField textField5 = new JTextField();
        textField5.setBounds(248,216,140,20);
        textField5.setBackground(new Color(167,199,231));
        textField5.setFont(new Font("Tahoma",Font.PLAIN,12));
        panel.add(textField5);



        JButton update = new JButton("Update");
        update.setBounds(120,315,95,30);
        update.setBackground(Color.lightGray);
        update.setForeground(Color.black);
        update.setFont(new Font("serif",Font.BOLD,15));
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    if(ch.getSelectedItem()==null && textField3.getText().isBlank() && textField4.getText().isBlank() && textField5.getText().isBlank()  )
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }

                    else if(textField3.getText().isBlank())
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else if(textField4.getText().isBlank())
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else if(textField5.getText().isBlank())
                    {
                        JOptionPane.showMessageDialog(null,"Invalid");
                    }
                    else {

                        con C = new con();
                        String status = textField5.getText();
                        C.statement.executeUpdate("update room set cleaningstatus = '" + status + "' where roomnumber = " + textField3.getText());
                        JOptionPane.showMessageDialog(null, "Updated Successfully");
                        setVisible(false);
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        JButton back = new JButton("Back");
        back.setBounds(180,355,95,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.setFont(new Font("serif",Font.BOLD,15));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(60,355,95,30);
        check.setBackground(Color.lightGray);
        check.setForeground(Color.black);
        check.setFont(new Font("serif",Font.BOLD,15));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(ch.getSelectedItem()==null && textField3.getText().isBlank() && textField4.getText().isBlank() && textField5.getText().isBlank()  )
                {
                    JOptionPane.showMessageDialog(null,"Invalid");
                }
                String id = ch.getSelectedItem();
                String q = "select * from CustomerDetailes where number = '"+id+"'";
                try{
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery(q);

                    while (resultSet.next()){
                        textField3.setText(resultSet.getString("room"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("select * from room where roomnumber =  '"+textField3.getText()+"'");

                    while (resultSet1.next()){
                        textField4.setText(resultSet1.getString("availability"));
                        textField5.setText(resultSet1.getString("cleaningstatus"));
                    }


                }catch (Exception E ){
                    E.printStackTrace();
                }
            }
        });

        setUndecorated(true);
        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception_UpdateRoomClass();
    }
}