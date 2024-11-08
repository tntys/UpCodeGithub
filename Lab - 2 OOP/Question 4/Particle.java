import java.util.Random;

public class Particle {
    private int x, y;
    private Random random;

    public Particle(int x, int y) {
        this.x = x;
        this.y = y;
        random = new Random();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // di chuyen 8 huong random
    public void move(int width, int height) {
        int direction = random.nextInt(8);  // di chuyen huong 0 toi 7
        switch (direction) {
            case 0: if (y > 0) y--; break;              // North
            case 1: if (y > 0 && x < width - 1) { y--; x++; } break; // North-East
            case 2: if (x < width - 1) x++; break;       // East
            case 3: if (y < height - 1 && x < width - 1) { y++; x++; } break; // South-East
            case 4: if (y < height - 1) y++; break;      // South
            case 5: if (y < height - 1 && x > 0) { y++; x--; } break; // South-West
            case 6: if (x > 0) x--; break;              // West
            case 7: if (y > 0 && x > 0) { y--; x--; } break; // North-West
        }
    }
}
