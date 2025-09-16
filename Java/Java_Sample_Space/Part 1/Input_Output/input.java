import java.util.Scanner; // Import the Scanner class for input

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input from the user

        String name = sc.nextLine(); // Read a line of text input from the user
        System.out.print("Enter your name: "); // Prompt the user to enter their name

        int age = sc.nextInt(); // Read an integer input from the user
        System.out.print("Enter your age: "); // Prompt the user to enter their age

        System.out.println("Hello, " + name + "! You are " + age + " years old."); // Display the collected input

        System.out.println("Thank You, its pleasure to meet you"); // Print "Thank You, its pleasure to meet you" after user input

        sc.close(); // Close the Scanner to free resources
    }
}