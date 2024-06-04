package exam33;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainFrame extends JFrame {
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7,20);

    public mainFrame() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        container.add(new JLabel("입력 후 엔터를 눌러주세요."));
        container.add(tf);
        container.add(ta);

        tf.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    JTextField _tf = (JTextField)e.getSource();
                    System.out.println(_tf.getText());

                    ta.append(_tf.getText()+"\n");
                }
            }

        );



        setSize(320,240);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
    
}
