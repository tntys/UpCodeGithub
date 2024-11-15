import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class CaptainShield extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        drawCircle(g, centerX, centerY, 200, Color.RED);
        drawCircle(g, centerX, centerY, 160, Color.WHITE);
        drawCircle(g, centerX, centerY, 120, Color.RED);
        drawCircle(g, centerX, centerY, 80, Color.BLUE);
    }

    private void drawCircle(Graphics g, int x, int y, int radius, Color color) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}