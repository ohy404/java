package exam14;
import java.awt.*;
import javax.swing.*;

public class app extends JFrame{
    public app(){
        setTitle("안녕하세요 스윙chip입니다.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container _c = getContentPane();
        _c.setLayout(new FlowLayout());
        _c.setBackground(Color.PINK);

        _c.add(new JButton("Ok"));
        _c.add(new JButton("Cancel"));
        _c.add(new JButton("Ignore"));


        setSize(300,300);
        setLocation(100,100);
        setVisible(true);
    }
    public static void main(String[] args){
        app _app = new app();
    }
}
