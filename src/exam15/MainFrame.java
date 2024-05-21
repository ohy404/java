package exam15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    public MainFrame(){
        setTitle("Hello Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container _c = getContentPane();
        _c.setLayout(new FlowLayout());
        JButton btn1 = new JButton("hello");

        btn1.addActionListener( new ActionListener() { // 중요
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton)e.getSource();
                btn.setText("World");
            }
        });
        _c.add(btn1);
        setSize(320,420);

        setVisible(true);
    }
    public static void main(String[] args) {
        MainFrame _Frame = new MainFrame();
    }
}
