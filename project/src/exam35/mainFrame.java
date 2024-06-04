package exam35;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainFrame extends JFrame {

    boolean stats = true;
    public class TimerThread extends Thread{
        private JLabel timerLabel;
        public TimerThread(JLabel timerLabel){
            this.timerLabel = timerLabel;
        
        }
        @Override
        public void run(){
            int n=0;
            while(stats){
                timerLabel.setText(Integer.toString(n));
                n++;
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    return;
                }
            }
        }
    }

    public mainFrame() {
        setTitle("Base Templete");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel("count :");
        JButton start_btn = new JButton("start");
        JButton stop_btn = new JButton("stop");
        container.add(timerLabel);
        TimerThread _Thread = new TimerThread(timerLabel);
        container.add(start_btn);
        container.add(stop_btn);
        stop_btn.setVisible(false);
        start_btn.setVisible(true);

        setSize(320,240);
        setVisible(true);
        //start_btn.setSize(80,20);

        start_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                stats = true;
                _Thread.start();
                stop_btn.setVisible(true);
                start_btn.setVisible(false);
            }
        });
        stop_btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                stats = false;
                stop_btn.setVisible(false);
                start_btn.setVisible(true);
            }
        });
    }
        
    public static void main(String[] args){
        mainFrame mainFrame = new mainFrame();
    }
    
}
