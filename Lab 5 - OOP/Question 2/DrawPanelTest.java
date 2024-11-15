import javax.swing.JFrame;

public class DrawPanelTest {
    public static void main(String[] args) {
        GraphicsPanel panel = new GraphicsPanel(); // create panel containt the drawing

        JFrame app = new JFrame(); // create the frame that hold the panel

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the frame exit when it close

        app.add(panel); // add panel to the frame
        app.setSize(300,300); // size of the frame
        app.setVisible(true); 
    }
}