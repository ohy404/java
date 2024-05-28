package exam23;
import java.awt.*;
import javax.swing.*;

public class mainWindows extends JFrame{
    public mainWindows(){
        setTitle("Grid Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout _grid = new GridLayout(4,2);
        _grid.setVgap(5);

        Container container = getContentPane();
        container.setLayout(_grid);

        container.add(new JLabel("이름"));
        container.add(new JTextField(""));
        container.add(new JLabel("학번"));
        container.add(new JTextField(""));
        container.add(new JLabel("학과"));
        container.add(new JTextField(""));
        container.add(new JLabel("과목"));
        container.add(new JTextField(""));

        setSize(640,480);
        setVisible(true);
    }
    public static void main(String[] args) {
        mainWindows _wnd = new mainWindows();
    }
}
