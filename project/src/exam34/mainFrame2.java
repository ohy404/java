package exam34;
import java.awt.*;
import javax.swing.*;

public class mainFrame2 extends JFrame {

    class Mypanel extends JPanel{
        private ImageIcon callBtn = new ImageIcon("call_icon.png");
        private Image img = callBtn.getImage();


        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,10,10,32,32,this);
            g.drawImage(img,50,10,100,100,250,250,150,150,this);
        }
    }

    private Mypanel mypanel = new Mypanel();

    public mainFrame2() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        setContentPane(mypanel);

        setSize(320,240);
        setVisible(true);
    }
    public static void main(String[] args){
        mainFrame2 mainFrame2 = new mainFrame2();
    }
    
}
