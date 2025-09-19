import java.util.Scanner;

public class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take name as input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Take age as input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Greet the user
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Nice to meet you, " + name + "!");

        sc.close();
    }
}
