package com.company;
import org.w3c.dom.Text;

import javax.swing.*;//Importanweisung der Klasse JFrame aus dem package Swing
import java.awt.*;

public class SwingFenster {
    Panel p1 = new Panel();
    JFrame fenster = new JFrame("Tic Tac Toe"); //neues Frame bzw. Fenster
    Button buttons[] = new Button[9];
    Button b0 = new Button();
    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Button b4 = new Button();
    Button b5 = new Button();
    Button b6 = new Button();
    Button b7 = new Button();
    Button b8 = new Button();
    Brain brain = new Brain();

    SwingFenster() {
        fenster.setSize(400, 400);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fenster.setBackground(Color.BLACK);
        createUi();

    }
    private void createUi(){
        p1.setBackground(Color.BLUE);
        buttons[0] = b0;
        buttons[1] = b1;
        buttons[2] = b2;
        buttons[3] = b3;
        buttons[4] = b4;
        buttons[5] = b5;
        buttons[6] = b6;
        buttons[7] = b7;
        buttons[8] = b8;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setPreferredSize(new Dimension(100, 100));
            int finalI = i;
            buttons[i].addActionListener(e -> {
                test(finalI);
                brain.FeldClicked(finalI);
            });
            p1.add(buttons[i]);
        }

        //for (Button aButton: buttons) {
        //   aButton.setPreferredSize(new Dimension(100, 100));
        //   aButton.addActionListener(e -> {
        //       test(3);
        //   });
        //   p1.add(aButton);
        //

        //b0.setPreferredSize(new Dimension(100, 100));
        //b1.setPreferredSize(new Dimension(100, 100));
        //b2.setPreferredSize(new Dimension(100, 100));
        //b3.setPreferredSize(new Dimension(100, 100));
        //b4.setPreferredSize(new Dimension(100, 100));
        //b5.setPreferredSize(new Dimension(100, 100));
        //b6.setPreferredSize(new Dimension(100, 100));
        //b7.setPreferredSize(new Dimension(100, 100));
        //b8.setPreferredSize(new Dimension(100, 100));

        //p1.add(b0);
        //p1.add(b1);
        //p1.add(b2);
        //p1.add(b3);
        //p1.add(b4);
        //p1.add(b5);
        //p1.add(b6);
        //p1.add(b7);
        //p1.add(b8);

        fenster.add(p1);
    }
    public void test(int x){
        System.out.println("button " + x + " gedrückt");
    }
}