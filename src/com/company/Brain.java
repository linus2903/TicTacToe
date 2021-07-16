package com.company;

public class Brain {
    int felder[] = new int[9];
    int aktivePlayer = 1;
    boolean pressedFelder[] = new boolean[9];

    Brain(int startingPlayer){
        resetFelder();
        aktivePlayer = startingPlayer;
    }
    Brain(){
        //resetFelder();
        printFelder();
    }

    public void resetFelder(){
        for (int i = 0; i < felder.length; i++) {
            felder[i] = 0;
            pressedFelder[i] = false;
        }
    }

    public void setFeldTo1(int feld){
        felder[feld] = 1;
        pressedFelder[feld] = true;
    }
    public void setFeldTo2(int feld){
        felder[feld] = 2;
        pressedFelder[feld] = true;
    }
    public int checkForWin(){
        if(felder[0] == felder[1] && felder[0] == felder[2] && felder[0] != 0){
            return felder[0];
        }else if(felder[3] == felder[4] && felder[3] == felder[5] && felder[3] != 0){
            return felder[3];
        }else if(felder[6] == felder[7] && felder[6] == felder[8] && felder[6] != 0){
            return felder[6];
        }else if(felder[0] == felder[4] && felder[0] == felder[8] && felder[0] != 0){
            return felder[0];
        }else if(felder[2] == felder[4] && felder[2] == felder[6] && felder[2] != 0){
            return felder[6];
        }else if(felder[0] == felder[3] && felder[0] == felder[6] && felder[0] != 0){
            return felder[0];
        }else if(felder[1] == felder[4] && felder[1] == felder[7] && felder[1] != 0){
            return felder[1];
        }else if(felder[2] == felder[5] && felder[2] == felder[8] && felder[2] != 0){
            return felder[2];
        }else if(draw()){
            return 3;
        }
        return 0;
    }
    public boolean draw(){
        for (boolean aFeld: pressedFelder) {
            if(!aFeld){
                return false;
            }
        }
        return true;
    }
    public void switchAktivePlayer(){
        if(aktivePlayer == 1){
            aktivePlayer = 2;
        }else {
            aktivePlayer = 1;
        }
    }
    public void FeldClicked(int feld){
       if(pressedFelder[feld] == false){
           felder[feld] = aktivePlayer;
           pressedFelder[feld] = true;
           if(checkForWin() == 1 || checkForWin() == 2){
               System.out.println("Player " + checkForWin() + " won!");
           }else if(checkForWin() == 3){
               System.out.println("Unentschieden");
           }
           switchAktivePlayer();
           printFelder();
       }else{
           System.out.println("Feld belegt");
       }
    }
    public void printFelder(){
        for (int aFeld: felder) {
            System.out.println(aFeld);
        }
    }

}
