package exam30;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainWindow extends JFrame{
    int counter = 0;
    public mainWindow(){
        setTitle("counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel label1 = new JLabel(Integer.toString(counter));
        label1.setSize(128,20);
        label1.setLocation(30,30);
        container.add(label1);

        JButton btnadd = new JButton("add");
        btnadd.setSize(80,20);
        btnadd.setLocation(30,100);
        container.add(btnadd);

        btnadd.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    label1.setText(Integer.toString(counter++));
            }
        });
        JButton btnsub = new JButton("sub");
        btnsub.addActionListener(new ActionListener(){
            @Override
                public void actionPerformed(ActionEvent e){
                    label1.setText(Integer.toString(counter--));
            }
        });
        btnsub.setSize(80,20);
        btnsub.setLocation(150,100);
        container.add(btnsub);

        //container.add(btn);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {

        mainWindow _wnd = new mainWindow();
    }
}