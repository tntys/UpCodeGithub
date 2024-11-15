import javax.swing.*;
import java.awt.*;

public class ConcentricCircles extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Get the center of the JPanel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Draw 12 concentric circles
        for (int i = 0; i < 12; i++) {
            int radius = 10 * (i + 1); // circle's radius
            int diameter = 2 * radius; 
            int topLeftX = centerX - radius; // Top-left X position
            int topLeftY = centerY - radius; // Top-left Y position

            g.drawOval(topLeftX, topLeftY, diameter, diameter); // Draw the circle
        }
    }
}