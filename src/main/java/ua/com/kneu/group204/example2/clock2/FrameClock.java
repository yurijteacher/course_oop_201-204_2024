package ua.com.kneu.group204.example2.clock2;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class FrameClock extends JFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public FrameClock(){

        frame = new JFrame("MyClock");
        frame.setSize(200, 60);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();

        frame.add(panel);

        label = new JLabel();

        label.setText("MyClock");

        panel.add(label);

        ClockExt clock = new ClockExt(1,2,3);
        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clock.nextSecond();
                label.setText(clock.toString());
            }
        });

        timer.start();

        frame.setVisible(true);
    }


}
