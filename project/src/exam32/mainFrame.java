package exam32;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class mainFrame extends JFrame {
    public mainFrame() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JCheckBox _chk_Apple = new JCheckBox("apple");
        JCheckBox _chk_pear = new JCheckBox("pear");
        JCheckBox _chk_cherry = new JCheckBox("cherry");
        JLabel _status = new JLabel();
        
        _chk_Apple.setSelected(true);

        _chk_Apple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                    _status.setText("apple check");
                }
                else {
                    _status.setText("apple uncheck");
                }

            }

        });

        container.add(_chk_Apple);
        container.add(_chk_pear);
        container.add(_chk_cherry);
        container.add(_status);

        

        setSize(320, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
    }

}
