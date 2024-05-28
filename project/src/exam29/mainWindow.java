package exam29;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainWindow extends JFrame{
    JLabel label1 = new JLabel("key : ");

    public mainWindow(){
        setTitle("KeyBoard event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);

        Container container = getContentPane();
        container.setLayout(null);
        label1.setSize(128,20);
        label1.setLocation(30,30);
        container.add(label1);

        container.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                label1.setText("key char : "+ e.getKeyChar()+","+e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_ADD){
                    container.setBackground(Color.green);
                }
                else if(e.getKeyCode() == KeyEvent.VK_SUBTRACT){
                    container.setBackground(Color.red);
                }
            }
        });
        container.setFocusable(true);
        container.requestFocus();

        setVisible(true);
    }
    
    public static void main(String[] args) {

        mainWindow _wnd = new mainWindow();
    }
}