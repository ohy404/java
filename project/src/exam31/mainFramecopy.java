package exam31;
import java.awt.*;
import javax.swing.*;

public class mainFramecopy extends JFrame {
    public mainFramecopy() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        setSize(320,240);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
    
}
