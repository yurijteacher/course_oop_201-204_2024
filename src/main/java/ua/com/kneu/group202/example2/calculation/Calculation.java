package ua.com.kneu.group202.example2.calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.stream.Stream;

/*
=======Calc=- + x
===============
  display
===============
7   8   9   +   b13 b14 b15 b16
4   5   6   -   b9 b10 b11 b12
1   2   3   *   b5 b6 b7 b8
0   ,   =   /   b1 b2 b3 b4
===============
 */

public class Calculation {

    JFrame frame;
    JTextField display;
    JPanel panel;

    double first = 0;
    double second = 0;
    String operation = "";

    JButton b1,b2,b3,b4,
            b5,b6,b7,b8,
            b9,b10,b11,b12,
            b13, b14, b15, b16;

    public Calculation() {

        this.frame = new JFrame("Calculation");
        frame.setSize(400,500);


        display = new JTextField();
        panel = new JPanel();

        b1 = new JButton("0");
        b2 = new JButton(",");
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


        frame.add(display, BorderLayout.NORTH);
//        BoxLayout boxLayout = new BoxLayout();
        GridLayout layout = new GridLayout(4,4);
        panel.setLayout(layout);

        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+"0");
            }
        });



//        Stream.of(b1,b5,b6,b7,b9,b10,b11,b13,b14,b15)
//                .forEach(
//                ee-> {
//                    ee.addActionListener(new AbstractAction() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            display.setText(display.getText()+ee.getText());
//                        }
//                    });
//                }
//        );


        Stream.of(b1, b5, b6, b7, b9, b10, b11, b13, b14, b15)
                .forEach( ee -> { ee.addActionListener(eee -> display.setText(display.getText() + ee.getText())); } );

//        b16.addActionListener(
//                new AbstractAction() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        first = Double.parseDouble(display.getText());
////                        first = Double.valueOf(display.getText());
//                        operation = "+";
//                        display.setText("0");
//                    }
//                }
//        );

        Stream.of(b16,b12,b8,b4).forEach(ee->ee.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(display.getText());
                operation = ee.getText();
                display.setText("0");
            }
        }));


        b2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] templ = display.getText().toCharArray();

                boolean logic = false;

                for (int i = 0; i < templ.length; i++) {
                    if(templ[i]==','){
                        logic = true;
                    }
                }

                if(!logic) display.setText(display.getText()+".");
            }
        });

        b3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                second = Double.parseDouble(display.getText());

                switch (operation){
                    case ("+"):
                        display.setText(first + second+"");
                        break;
                    case ("-"):
                        display.setText(first - second+"");
                        break;
                    case ("*"):
                        display.setText(first * second+"");
                        break;
                    case ("/"):
                        if (second != 0) {
                            display.setText(first / second + "");
                        } else {
                            display.setText("0");
                        }
                        break;
                }





            }
        });


        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Calculation();
    }
}
