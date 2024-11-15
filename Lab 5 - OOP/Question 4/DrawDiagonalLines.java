import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class DrawDiagonalLines extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int numberOfSteps = 15;

        //  Draw lines from top-left to bottom-right
        for (int i = 0; i <= numberOfSteps; i++) {
            int x1 = 0;
            int y1 = i * height / numberOfSteps;
            int x2 = i * width / numberOfSteps;
            int y2 = height;

            g.drawLine(x1, y1, x2, y2);
        }

        //  Mirror the lines in all four corners
        for (int i = 0; i <= numberOfSteps; i++) {
            int x = i * width / numberOfSteps;
            int y = i * height / numberOfSteps;

            g.drawLine(0, y, x, height);
            g.drawLine(width, y, width - x, height);
            g.drawLine(0, height - y, x, 0);
            g.drawLine(width, height - y, width - x, 0);
        }
    }
}
