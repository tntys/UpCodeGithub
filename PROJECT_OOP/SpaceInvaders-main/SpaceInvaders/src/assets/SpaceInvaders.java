package assets;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceInvaders extends JFrame  {

    private MP3Player mp3Player;

    public SpaceInvaders() {
        initUI();
        startBackgroundMusic();
    }

    private void initUI() {
        add(new Board());
        setTitle("Space Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private void startBackgroundMusic() {
        mp3Player = new MP3Player("src/background.mp3");
        mp3Player.playLoop();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
