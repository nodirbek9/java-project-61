package hexlet.code;

import hexlet.Cli;
import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> new Cli().welcomeToGame();
            case 2 -> EvenGame.start();
            case 3 -> Calculator.start();
            case 4 -> Gcd.start();
            case 5 -> Progression.start();
            case 6 -> Prime.start();
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}
