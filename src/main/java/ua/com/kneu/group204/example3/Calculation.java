package ua.com.kneu.group204.example3;


/*
AWT  (C++) v.2  /  SWING(Java)

Listener                -

Component       /    JComponent  (JFrame, JButton, JLabel, JTextArea, JTextField)

Layout          /           -
(Grid)
(Border)
(Box)
...             /    Timer


 */

/*
===============================
======Calculation======== - + x
            display
-------------------------------
7       8      9      +             b13 b14 b15 b16
4       5      6      -             b9 b10 b11 b12
1       2      3      *             b5 b6 b7 b8
0       .      =      /             b1 b2 b3 b4
-------------------------------
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class Calculation {
    JFrame frame;
    JTextField display;
    JPanel panel;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    double first = 0;
    double second = 0;
    String operation;

    public Calculation() {

        frame = new JFrame("Calculation");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        frame.add(display, BorderLayout.NORTH);

        panel = new JPanel();

        b1 = new JButton("0");
        b2 = new JButton(".");
        b3 = new JButton("=");
        b4 = new JButton("/");

        b5 = new JButton("1");
        b6 = new JButton("2");
        b7 = new JButton("3");
        b8 = new JButton("*");

        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");

        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("+");


        panel.setLayout(new GridLayout(4, 4));

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        frame.add(panel, BorderLayout.CENTER);

        Stream.of(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, display)
                .forEach(e -> {
                    e.setFont(new Font("Arial", Font.BOLD, 28));
                });


//        b13.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                display.setText(display.getText() + "7");
//            }
//        });

//        Stream.of(b1, b5, b6, b7, b9, b10, b11, b13, b14, b15).forEach(el ->
//                el.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                display.setText(display.getText() + el.getText());
//                    }
//                })
//        );

        Stream.of(b1, b5, b6, b7, b9, b10, b11, b13, b14, b15)
                .forEach(el -> el
                        .addActionListener(e -> display.setText(display.getText() + el.getText())));

//        b16.addActionListener(
//                new AbstractAction() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        first = Double.parseDouble(display.getText());
//                        operation = "+";
//                        display.setText("0");
//                    }
//                }
//        );

        Stream.of(b4,b8,b12, b16).forEach(e->{
            e.addActionListener(e1 -> {
                first = Double.parseDouble(display.getText());
                operation = e.getText();
                display.setText("0");
            });
        });

        b2.addActionListener(e -> {
            char[] arr = display.getText().toCharArray();

            boolean logic = false;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i]=='.') logic=true;
            }

            if(!logic) display.setText(display.getText()+".");
        });

        b3.addActionListener(e->{

            second = Double.parseDouble(display.getText());
//            second = Double.valueOf(display.getText());

            switch (operation){
                case ("+"): display.setText(first+second +"");
                    break;
                case ("-"): display.setText(first-second +"");
                    break;
                case ("*"): display.setText(first*second +"");
                    break;
                case ("/"):
//                    if(second==0){
//                        display.setText("0");
//                    } else {
//                        display.setText(first/second+"");
//                    }

                    display.setText( (second==0) ? "0" : first/second+"" );

                    break;
            }


        });

        frame.setVisible(true);
    }




    public static void main(String[] args) {
        new Calculation();
    }
}
