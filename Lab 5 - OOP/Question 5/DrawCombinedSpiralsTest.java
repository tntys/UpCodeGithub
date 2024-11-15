
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class DrawCombinedSpiralsTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400); 
        frame.setLayout(null); 

        JPanel squareSpiralPanel = new SquareSpiralPanel();
        squareSpiralPanel.setBounds(0, 0, 400, 400); 
        frame.add(squareSpiralPanel);

        JPanel circularSpiralPanel = new CircularSpiralPanel();
        circularSpiralPanel.setBounds(400, 0, 400, 400); 
        frame.add(circularSpiralPanel);

        frame.setVisible(true);
    }
}