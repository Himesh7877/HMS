package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Reception_PickUpClass extends JFrame {
    Reception_PickUpClass(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(27,45,72));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick Up Service");
        pus.setBounds(90,11,160,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(pus);

        JLabel TOC = new JLabel("Type of Car");
        TOC.setBounds(32,97,89,20);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try{
            con C = new con();
            ResultSet resultSet = C.statement.executeQuery("select * from DriverDetailes");
            while (resultSet.next()){
                c.add(resultSet.getString("carname"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(27,45,72));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con C = new con();
            String q = "select * from DriverDetailes";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(43,208,46,14);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(165,208,46,14);
        age.setForeground(Color.WHITE);
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(270,208,46,14);
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        JLabel company = new JLabel("Company");
        company.setBounds(378,208,100,14);
        company.setForeground(Color.WHITE);
        panel.add(company);

        JLabel Carname = new JLabel("Car Name");
        Carname.setBounds(492,208,100,14);
        Carname.setForeground(Color.WHITE);
        panel.add(Carname);

        JLabel available = new JLabel("Available");
        available.setBounds(610,208,100,14);
        available.setForeground(Color.WHITE);
        panel.add(available);

        JLabel loacation = new JLabel("Loacation");
        loacation.setBounds(710,208,100,14);
        loacation.setForeground(Color.WHITE);
        panel.add(loacation);

        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(Color.lightGray);
        display.setForeground(Color.black);
        display.setFont(new Font("serif",Font.BOLD,15));
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from DriverDetailes where carname = '"+c.getSelectedItem()+"'";
                try{
                    con c = new con();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        JButton Back = new JButton("Back");
        Back.setBounds(420,500,120,30);
        Back.setBackground(Color.lightGray);
        Back.setForeground(Color.black);
        Back.setFont(new Font("serif",Font.BOLD,15));
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception_PickUpClass();
    }
}