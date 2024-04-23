package ua.com.kneu.group203.example3.clock;


/*
    AWT / Component / Layout / List | Frame, Button, TextField, Label ...
    Swing / Component | JFrame, JButton, JLabel...
 */


import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClockFrame {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    public ClockFrame() {

        JFrame frame = new JFrame("MyClock");

        frame.setSize(320, 70);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();

        frame.add(panel);

        ClockExt clockExt = new ClockExt(1,1,1);

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt.nextSecond();
                label.setText(clockExt.toString());
            }
        });

        timer.start();

        label = new JLabel();
        panel.add(label);

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new ClockFrame();

    }
}
