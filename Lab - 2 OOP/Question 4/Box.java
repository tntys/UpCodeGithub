import java.util.ArrayList;
import java.util.Random;

public class Box {
    private int width, height;
    private ArrayList<Particle> particles;
    private Random random;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        this.particles = new ArrayList<>();
        this.random = new Random();
    }

    public void addParticle() {
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        particles.add(new Particle(x, y));
    }

    public void moveParticles() {
        for (Particle particle : particles) {
            particle.move(width, height);
        }
    }

    public void detectCollisions() {
        for (int i = 0; i < particles.size(); i++) {
            for (int j = i + 1; j < particles.size(); j++) {
                if (particles.get(i).getX() == particles.get(j).getX() &&
                    particles.get(i).getY() == particles.get(j).getY()) {
                    addParticle();  // add a new particle when there's a collision
                }
            }
        }
    }

    public int getParticleCount() {
        return particles.size();
    }

    public void displayBox() {
        char[][] boxGrid = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boxGrid[i][j] = ' ';
            }
        }

        for (Particle particle : particles) {
            boxGrid[particle.getY()][particle.getX()] = '*';
        }

        // print the box with particles
        System.out.println("-".repeat(width + 2));
        for (int i = 0; i < height; i++) {
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                System.out.print(boxGrid[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(width + 2));
    }
}
