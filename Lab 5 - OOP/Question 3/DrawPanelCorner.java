import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class DrawPanelCorner extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int numberOfSteps = 15;

        for (int i = 0; i <= numberOfSteps; i++) {
            int x = i * width / numberOfSteps;
            int y = i * height / numberOfSteps;

            g.drawLine(0, 0, x, height);
            g.drawLine(0, 0, width, y);

            g.drawLine(width, 0, width - x, height);
            g.drawLine(width, 0, 0, y);

            g.drawLine(0, height, x, 0);
            g.drawLine(0, height, width, height - y);

            g.drawLine(width, height, width - x, 0);
            g.drawLine(width, height, 0, height - y);
        }
    }
}