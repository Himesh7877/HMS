
package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){


       ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Crystal Blue Luxury Hotel Resorts Instagram Post.gif"));
        Image i22 = i111.getImage().getScaledInstance(760,520, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(5,5,760,520);
        add(label11);

        setUndecorated(true);
        setLayout(null);
        setLocation(370,170);
        setSize(770,530);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}