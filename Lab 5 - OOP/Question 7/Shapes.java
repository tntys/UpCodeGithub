
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Shapes extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Random random = new Random();
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        for (int i = 0; i < 10; i++) {
            // Random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            Color randomColor = new Color(red, green, blue);
            g2d.setColor(randomColor);

            // Random position
            int x = random.nextInt(panelWidth);
            int y = random.nextInt(panelHeight);

            int width = random.nextInt(panelWidth / 2);
            int height = random.nextInt(panelHeight / 2);

            if (random.nextBoolean()) {
                g2d.fillRect(x, y, width, height);
            } else {
                g2d.fillOval(x, y, width, height);
            }
        }
    }   
}

