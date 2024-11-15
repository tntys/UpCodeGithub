import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Captain America Shield");
        CaptainShield shieldPanel = new CaptainShield();
        frame.add(shieldPanel);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
