package assets;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3Player {
    private String filePath;
    private AdvancedPlayer player;
    private Thread playThread;

    public MP3Player(String filePath) {
        this.filePath = filePath;
    }

    public void playLoop() {
        playThread = new Thread(() -> {
            try {
                while (true) {
                    FileInputStream fis = new FileInputStream(filePath);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    player = new AdvancedPlayer(bis);
                    player.play();
                }
            } catch (FileNotFoundException | JavaLayerException e) {
                e.printStackTrace();
            }
        });
        playThread.start();
    }

    public void stop() {
        if (player != null) {
            player.close();
            playThread.interrupt();
        }
    }
}
