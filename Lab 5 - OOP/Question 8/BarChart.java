import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class BarChart extends JPanel {
    private int[] values;

    public BarChart(int[] values) {
        this.values = values;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 10;
        for (int value : values) {
            int barHeight = value * 10;
            g.setColor(new Color((int)(Math.random() * 0x1000000)));
            g.fillRect(x, getHeight() - barHeight, 50, barHeight);
            x += 60;
        }
    }
}