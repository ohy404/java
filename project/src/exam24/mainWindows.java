package exam24;
import java.awt.*;
import javax.swing.*;

public class mainWindows extends JFrame{
    public mainWindows(){
        setTitle("null layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(640,480);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel labe11 = new JLabel("hello press Button");
        labe11.setLocation(100,150);
        labe11.setSize(200,20);
        container.add(labe11);

        JLabel labe12 = new JLabel("Zero Point");
        labe12.setLocation(0,0);
        labe12.setSize(200,20);
        container.add(labe12);

        JLabel labe13 = new JLabel("Center Point");
        labe13.setLocation(getWidth()/2,getHeight()/2);
        labe13.setSize(200,20);
        //labe13.setBackground(new Color(255,0,0));
        container.add(labe13);

        setSize(640,480);
        setVisible(true);
    }
    public static void main(String[] args) {
        mainWindows _wnd = new mainWindows();
    }
}
