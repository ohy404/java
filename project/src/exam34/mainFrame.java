package exam34;
import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    class Mypanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawRect(10, 10, 150, 150);
            g.setColor(Color.RED);
            g.drawLine(10, 10, 160, 160);
            g.setColor(Color.CYAN);
            g.drawOval(10, 10, 150, 150);
            g.setColor(Color.YELLOW);
            g.fillArc(160, 50, 80,80,90,270);
            g.setColor(Color.ORANGE);
            g.drawArc(160, 50, 80,80,90,270);
            g.setColor(Color.red);
            g.fillOval(170, 70, 10, 10);
            g.fillOval(180, 100, 10, 10);
            g.fillOval(216, 100, 10, 10);

        }
    }

    private Mypanel mypanel = new Mypanel();

    public mainFrame() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        setContentPane(mypanel);

        setSize(320,240);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
    
}
