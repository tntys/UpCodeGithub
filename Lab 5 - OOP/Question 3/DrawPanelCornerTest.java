import javax.swing.JFrame;

public class DrawPanelCornerTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawPanelCorner panel = new DrawPanelCorner();

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
