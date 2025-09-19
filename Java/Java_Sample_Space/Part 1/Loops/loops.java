import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Infinite loop to continuously ask for user input until exit condition is met 
        // Use 'break' to exit the loop
        // while loop is used here to demonstrate looping concept in Java 
        while (true) {
            System.out.print("\nEnter your name (or type 'exit' to quit): ");
            String name = sc.nextLine();

            // Exit condition
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program... Goodbye!");
                break;
            }

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            // Greeting based on age
            if (age < 13) {
                System.out.println("Hello " + name + "! You are a kid, enjoy your childhood!");
            } else if (age < 20) {
                System.out.println("Hello " + name + "! You are a teenager, full of energy!");
            } else if (age < 60) {
                System.out.println("Hello " + name + "! You are an adult, keep working hard!");
            } else {
                System.out.println("Hello " + name + "! You are wise and experienced, enjoy your life!");
            }
        }

        sc.close();
    }
}
