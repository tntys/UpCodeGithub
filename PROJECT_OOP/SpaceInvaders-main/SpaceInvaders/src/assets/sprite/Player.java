package assets.sprite;

import assets.Commons;

import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Player extends Sprite {

    private int width;

    public Player() {
        initPlayer();
    }

    private void initPlayer() {
        var playerImg = "src/images/player.png";
        var ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);
        setImage(ii.getImage());

        int START_X = Commons.BOARD_WIDTH / 2 - width / 2; // Center horizontally
        setX(START_X);

        int START_Y = Commons.GROUND - Commons.PLAYER_HEIGHT - 10; // Above ground
        setY(START_Y);
    }

    public void act() {
        x += dx;

        if (x <= 2) {
            x = 2;
        }

        if (x >= Commons.BOARD_WIDTH - width - 2) {
            x = Commons.BOARD_WIDTH - width - 2;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}
