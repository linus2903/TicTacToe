package com.company;

public class Ki {
    int player;         //Speichert abwechselnd den Min bzw. Max Spieler
    int suchtiefe;      //Speichert die maximale Suchtiefe

    Ki(){}
    public int findBestMove(int player, int tempFelder[]){
        int bestMove;
        public void loop(){

        }
        for (int v = 0; v < suchtiefe; v++) {
            for (int i = 0; i <tempFelder.length ; i++) {
                if(tempFelder[i] == 0){
                    tempFelder[i] = player;
                    if (checkForWinKi(player, tempFelder) == 1) {
                        bestMove = i;
                        return i;
                    }else

                }
            }
        }
    }
    public int chekFelder(int player, int felderList[]){
        if(drawKi(felderList)){
            return 0;
        }else if(checkForWinKi(player, felderList) != 3){
            return checkForWinKi(player, felderList);
        }
    }

    public int checkForWinKi(int player, int felderList[]){
        if(felderList[0] == felderList[1] && felderList[0] == felderList[2] && felderList[0] != 0){
            if(felderList[0] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[3] == felderList[4] && felderList[3] == felderList[5] && felderList[3] != 0){
            if(felderList[3] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[6] == felderList[7] && felderList[6] == felderList[8] && felderList[6] != 0){
            if(felderList[6] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[0] == felderList[4] && felderList[0] == felderList[8] && felderList[0] != 0){
            if(felderList[0] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[2] == felderList[4] && felderList[2] == felderList[6] && felderList[2] != 0){
            if(felderList[2] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[0] == felderList[3] && felderList[0] == felderList[6] && felderList[0] != 0){
            if(felderList[0] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[1] == felderList[4] && felderList[1] == felderList[7] && felderList[1] != 0){
            if(felderList[1] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(felderList[2] == felderList[5] && felderList[2] == felderList[8] && felderList[2] != 0){
            if(felderList[2] == player){
                return 1;
            }else{
                return -1;
            }
        }else if(drawKi(felderList)){
            return 0;
        }
        return 3;
    }
    public boolean drawKi(int felderList[]){
        for (int aFeld: felderList) {
            if(aFeld == 0){
                return false;
            }
        }
        return true;
    }
}
