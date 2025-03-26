package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(27,45,72));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(27,45,72));
        add(panel1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Blue Minimalist Resort Business Presentation (1).gif"));
        Image i22 = i111.getImage().getScaledInstance(1225,807, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(6,7,1225,807);
        panel.add(label11);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/Black and Gold Elegant Hotel Logo.gif"));
        Image i2 = i11.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(-20,530,300,300);
        panel1.add(label1);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setBackground(Color.lightGray);
        btnNCF.setForeground(Color.black);
        btnNCF.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   new Reception_CheckinClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setBackground(Color.lightGray);
        btnRoom.setForeground(Color.black);
        btnRoom.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_RoomClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.lightGray);
        btnDepartment.setForeground(Color.black);
        btnDepartment.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   new Reception_DepartmentClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.lightGray);
        btnAEI.setForeground(Color.black);
        btnAEI.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_AllEmployeeClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.lightGray);
        btnCI.setForeground(Color.black);
        btnCI.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_CustomerInfoClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.lightGray);
        btnMI.setForeground(Color.black);
        btnMI.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_ManagerInfoClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(Color.lightGray);
        btnCO.setForeground(Color.black);
        btnCO.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_CheckoutClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30,310,200,30);
        btnUC.setBackground(Color.lightGray);
        btnUC.setForeground(Color.black);
        btnUC.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_UpdateCheckInClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,200,30);
        btnURS.setBackground(Color.lightGray);
        btnURS.setForeground(Color.black);
        btnURS.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_UpdateRoomClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick up Service");
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setBackground(Color.lightGray);
        btnPUS.setForeground(Color.black);
        btnPUS.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_PickUpClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,200,30);
        btnSR.setBackground(Color.lightGray);
        btnSR.setForeground(Color.black);
        btnSR.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Reception_SearchRoomClass();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,470,95,30);
        logout.setBackground(Color.lightGray);
        logout.setForeground(Color.black);
        logout.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(135,470,95,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.setFont(new Font("serif",Font.BOLD,15));
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }
}