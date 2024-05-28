package exam27;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainWindow extends JFrame{
    JLabel label1 = new JLabel("mouse pos : ");

    public mainWindow(){
        setTitle("mouse evant");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);

        Container container = getContentPane();
        container.setLayout(null);
        label1.setSize(128,20);
        label1.setLocation(30,30);
        
        container.add(label1);

        container.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){
                label1.setText(e.getX()+","+e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e){}
            @Override
            public void mouseClicked(MouseEvent e){}
            @Override
            public void mouseEntered(MouseEvent e){}
            @Override
            public void mouseExited(MouseEvent e){}


        });

        setVisible(true);
    }
    
    public static void main(String[] args) {

        mainWindow _wnd = new mainWindow();
    }
}