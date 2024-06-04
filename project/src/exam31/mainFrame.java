package exam31;
import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {
    public mainFrame() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container container = getContentPane();

        ImageIcon callBtn = new ImageIcon("call_icon.png");
        JLabel imgLabel = new JLabel(callBtn);
        container.add(imgLabel);

        JButton imgbtn = new JButton("call",callBtn);
        container.add(imgbtn);

        setSize(320,600);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
    
}
