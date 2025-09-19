import java.util.Scanner;

public class if_else_elif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner is used to take input from the user.

        // Input section
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // String variable to store name and NextLine() method to read full line input.

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // int variable to store age and NextInt() method to read integer input.

        // Output section
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);


        // Greeting with conditions
        if (age <= 13) {
            System.out.println("Hello " + name + "! You are a kid, enjoy your childhood!");
        } else if (age <= 20) {
            System.out.println("Hello " + name + "! You are a teenager, full of energy!");
        } else if (age < 60) {
            System.out.println("Hello " + name + "! You are an adult, keep working hard!");
        } else {
            System.out.println("Hello " + name + "! You are wise and experienced, enjoy your life!");
        }

        sc.close();
    }

}
