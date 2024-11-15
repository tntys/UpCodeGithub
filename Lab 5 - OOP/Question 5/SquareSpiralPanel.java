import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class SquareSpiralPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int x = centerX;
        int y = centerY;
        int step = 10;

        for (int i = 0; i < 10; i++) {
            g.drawLine(x, y, x + step, y);
            x += step;
            g.drawLine(x, y, x, y + step);
            y += step;
            g.drawLine(x, y, x - step, y);
            x -= step;
            g.drawLine(x, y, x, y - step);
            y -= step;
            step += 10;
        }
    }
}

