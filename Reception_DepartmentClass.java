package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Reception_DepartmentClass extends JFrame {
    Reception_DepartmentClass(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(27,45,72));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(27,45,72));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            con c = new con();
            String departmentInfo = "select * from DepartmentDetailes";
            ResultSet resultSet = c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setBackground(Color.lightGray);
        back.setForeground(Color.black);
        back.setFont(new Font("serif", Font.BOLD, 17));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Department");
        label1.setBounds(120,11,105,20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setBounds(480,11,105,20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(label2);



        setUndecorated(true);
        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception_DepartmentClass();
    }
}