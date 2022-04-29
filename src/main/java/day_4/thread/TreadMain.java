package day_4.thread;

public class TreadMain {
    public static void main(String[] args) {
        //Make two threads and connect them to play a Ping-Pong game.
        // One thread should write “ping” to the console, another - “pong”.
        // Each thread should add his own name to his message.
        // It will be good to finish that game after a few seconds.
        // Try to use Executors and different implementation of Thread
        PlayerThread player1=new PlayerThread("ping");
        PlayerThread player2=new PlayerThread("pong");

        player1.start();
        player2.start();

    }
}
