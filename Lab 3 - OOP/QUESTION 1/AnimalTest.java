import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //test meo
        System.out.print("Enter the name of the Cat: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);
        System.out.println(cat);
        cat.greets();

        //test cho
        System.out.println("Enter the name of the Dog: ");
        String dogName = scanner.nextLine();
        Dog dog = new Dog(dogName);
        System.out.println(dog);
        dog.greets();

        // test cho va another dog
        System.out.print("Enter the name of another Dog for greeting: ");
        String anotherDogName = scanner.nextLine();
        Dog anotherDog = new Dog(anotherDogName);
        dog.greets(anotherDog);




        scanner.close();
    }
}
