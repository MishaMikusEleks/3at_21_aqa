package day_4.thread;

import java.util.Date;

public class PlayerThread extends Thread{

   static final int TURN_MAX_COUNT=10;
    static int turnCounter=0;
    static final String[] ball=new String[]{""};

    public void run(){
        while(turnCounter<TURN_MAX_COUNT){
            synchronized (ball){
            play();
            }
        }

    }

    private void play() {
        if(null==ball[0]||!ball[0].equals(getName())){
        ball[0]=getName();
        System.out.println(new Date().getTime()+" "+ball[0]+" "+turnCounter++);}
    }

    public PlayerThread(String name) {
        this.setName(name);
    }
}
