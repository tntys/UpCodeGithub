package assets;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class StartMenu extends JFrame {

    private Clip clip;

    public StartMenu() {
        initUI();
    }

    private void initUI() {
        setTitle("Start Menu");
        setSize(800, 600); // Adjust size as needed
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Background panel
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(new BorderLayout());

        // Title label
        JLabel titleLabel = new JLabel("Space Invaders");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(titleLabel, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setOpaque(false); // Make the panel transparent
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(200, 300, 200, 300)); // Add padding

        // Play button
        JButton playButton = new JButton("Play");
        playButton.setFont(new Font("Arial", Font.BOLD, 24));
        playButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                startGame();
            }
        });

        // Exit button
        JButton exitButton = new JButton("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 24));
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        // Add buttons to panel
        buttonPanel.add(playButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 20))); // Add space between buttons
        buttonPanel.add(exitButton);

        backgroundPanel.add(buttonPanel, BorderLayout.CENTER);
        add(backgroundPanel);

        setVisible(true);
    }

    

    private void startGame() {
        dispose();
        EventQueue.invokeLater(() -> {
            var ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new StartMenu().setVisible(true);
        });
    }

    // Inner class for background panel
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel() {
            try {
                backgroundImage = new ImageIcon("src/images/logo.png").getImage(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
