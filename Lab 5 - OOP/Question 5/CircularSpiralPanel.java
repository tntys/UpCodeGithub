
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class CircularSpiralPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
    
            for (int i = 0; i < 20; i++) {
                int radius = 10 + i * 10;
                g.drawArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 0, 180);
                g.drawArc(centerX - radius, centerY - radius, radius * 2, radius * 2, 180, 180);
            }
        }
    }
