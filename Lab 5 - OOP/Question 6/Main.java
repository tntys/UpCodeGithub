import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
public class Main {
public static void main(String[] args) {
    JFrame frame = new JFrame("Concentric Circles");
    ConcentricCircles panel = new ConcentricCircles();

    frame.add(panel);
    frame.setSize(400, 400); // Set frame size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true); // Make the frame visible
    }
}