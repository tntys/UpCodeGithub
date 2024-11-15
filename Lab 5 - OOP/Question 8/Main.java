import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Main {
    
    public static void main(String[] args) {
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            String input = JOptionPane.showInputDialog("Enter an integer value for bar " + (i + 1) + ":");
            values[i] = Integer.parseInt(input);
        }

        JFrame frame = new JFrame("Bar Chart");
        BarChart barChart = new BarChart(values);
        frame.add(barChart);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
