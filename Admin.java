package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, logout, back;
    Admin(){
        super("HOTEL MANAGEMENT SYSTEM");
        add_Employee = new JButton( "ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.lightGray);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("serif", Font.BOLD, 17));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton( "ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.lightGray);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("serif", Font.BOLD, 17));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drivers = new JButton( "ADD DRIVERS");
        add_Drivers.setBounds(250,530,200,30);
        add_Drivers.setBackground(Color.lightGray);
        add_Drivers.setForeground(Color.BLACK);
        add_Drivers.setFont(new Font("serif", Font.BOLD, 17));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

        logout = new JButton( "Logout");
        logout.setBounds(10,800,95,30);
        logout.setBackground(Color.lightGray);
        logout.setForeground(Color.black);
        logout.setFont(new Font("Tahoma", Font.BOLD, 17));
        logout.addActionListener(this);
        add(logout);

        back = new JButton( "Back");
        back.setBounds(110,800,95,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.setFont(new Font("Tahoma", Font.BOLD, 17));
        back.addActionListener(this);
        add(back);


        ImageIcon l1 = new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11 = l1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon imageIcon1 = new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image image = imageIcon1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image image1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon12 = new ImageIcon(image1);
        JLabel label2 = new JLabel(imageIcon12);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon imageIcon3 = new ImageIcon(ClassLoader.getSystemResource("icon/Black and Gold Elegant Hotel Logo.gif"));
        Image image2 = imageIcon3.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon13 = new ImageIcon(image2);
        JLabel label3 = new JLabel(imageIcon13);
        label3.setBounds(1000,250,400,400);
        add(label3);


        getContentPane().setBackground(new Color(27,45,72));
        setLayout(null);
        setSize(1940,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add_Employee){
            new Add_EmployeeClass();
        } else if (e.getSource() == add_Room) {
           new Add_RoomClass();
        } else if (e.getSource() ==  add_Drivers) {
           new Add_DriverClass();
        } else if (e.getSource() == logout){
            System.exit(102);
        } else if (e.getSource() == back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Admin();
    }
}