package ua.com.kneu.group202.example2.clock;


import javax.swing.*;
import java.awt.event.ActionEvent;

// AWT /
// Swing /
public class ClockFrame {


    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public ClockFrame() {

        frame = new JFrame("MyClock");

        frame.setSize(340, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        frame.add(panel);

        label = new JLabel();
        panel.add(label);

        ClockExt clockExt = new ClockExt(1,1,1);

        Timer  timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt.nextSecond();
                label.setText(clockExt.toString());
            }
        });

        timer.start();


        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new ClockFrame();
    }
}
