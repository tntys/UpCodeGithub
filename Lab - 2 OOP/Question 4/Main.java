import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box box = new Box(10, 5);

        box.addParticle();
        box.addParticle();
        box.addParticle();

        System.out.println("Initial box with particles:");
        box.displayBox();

        System.out.println("Enter the number of steps:");
        int steps = scanner.nextInt();

        for (int i = 0; i < steps; i++) {
            box.moveParticles();
            box.detectCollisions();
            System.out.println("After step " + (i + 1) + ":");
            box.displayBox();
            System.out.println("Total particles: " + box.getParticleCount());
        }
    }
}
