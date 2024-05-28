package exam26;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainWindow extends JFrame{

    public mainWindow(){
        setTitle("Grid Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("hello");
        container.add(label1);

        JButton btn = new JButton("Action");
        btn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JButton targetBtn = (JButton)e.getSource();
                    targetBtn.setText("Click");
                    setTitle("click");
                    label1.setText("Click world");
            }
        });

        container.add(btn);
        
        setSize(320,240);
        setVisible(true);
    }
    
    public static void main(String[] args) {

        mainWindow _wnd = new mainWindow();
    }
}