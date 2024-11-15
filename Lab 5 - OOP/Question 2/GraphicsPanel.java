// package Question 2;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphicsPanel extends JPanel {
    @Override // override for clarity
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // call paint component => make sure display correctly
        int width = getWidth(); // total width
        int height = getHeight(); // total height

        // draw from upper left to lower right
        g.drawLine(0,0,width,height);
        // draw from lower left to upper right
        g.drawLine(0, height, width, 0);
        // draw from middle top to middle bottom 
        g.drawLine(width/2, 0, width/2, height);
        // draw from middle left to middle right
        g.drawLine(0, height/2, width, height/2);

    }
}
