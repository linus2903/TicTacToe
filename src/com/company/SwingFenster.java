package com.company;
import org.w3c.dom.Text;

import javax.swing.*;//Importanweisung der Klasse JFrame aus dem package Swing
import java.awt.*;

public class SwingFenster {
    Panel p1 = new Panel();
    JFrame fenster = new JFrame("Tic Tac Toe"); //neues Frame bzw. Fenster
    Button bReset = new Button("Reset");
    Brain brain = new Brain();
    Label playerAnzeige = new Label ("Spieler " + brain.aktivePlayer+ " am zug.");

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

    SwingFenster() {
        fenster.setSize(400, 400);
        fenster.setVisible(true);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fenster.setBackground(Color.BLACK);
        createUi();

    }
    private void createUi(){
        p1.setBackground(Color.GRAY);
        bReset.setPreferredSize(new Dimension(80, 35));
        bReset.addActionListener(e -> {
            brain.resetFelder();
            brain.printFelder();
            readData();
        });
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
                readData();
            });
            p1.add(buttons[i]);
        }
        p1.add(bReset);
        playerAnzeige.setPreferredSize(new Dimension(110, 35));
        p1.add(playerAnzeige);
        fenster.add(p1);
    }
    public void test(int x){
        System.out.println("button " + x + " gedrückt");
    }
    public void readData(){
        int felder[] = brain.felder;
        String zeichen = null;
        for (int i = 0; i < felder.length; i++) {

            if(felder[i] == 1){
                zeichen = "X";
                buttons[i].setLabel(zeichen);
            }else if(felder[i] == 2){
                zeichen = "O";
                buttons[i].setLabel(zeichen);
            }else if(felder[i] == 0){
                zeichen = "";
                buttons[i].setLabel(zeichen);
            }

        }
        playerAnzeige.setText("Spieler " + brain.aktivePlayer+ " am zug.");
    }
}