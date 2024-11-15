
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class DrawDiagonalLinesTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawDiagonalLines panel = new DrawDiagonalLines();
    
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
