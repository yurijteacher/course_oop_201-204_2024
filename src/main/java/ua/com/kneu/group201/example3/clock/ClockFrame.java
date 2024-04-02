package ua.com.kneu.group201.example3.clock;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClockFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame() {
        frame = new JFrame("MyClock");
        frame.setSize(240, 70);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.add(panel);

        label = new JLabel();
        panel.add(label);

        ClockExt clockExt = new ClockExt(1,1,1);

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt.nextSecond();
                label.setText(clockExt.toString());
            }
        }


        );

        timer.start();


        frame.setVisible(true);

    }
}
