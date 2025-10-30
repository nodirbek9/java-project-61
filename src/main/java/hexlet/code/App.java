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
        Cli newcli = new Cli();
        EvenGame evenGame = new EvenGame();
        Calculator calculator = new Calculator();

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
            case 2 -> Engine.run(new EvenGame());
            case 3 -> Engine.run(new Calculator());
            case 4 -> Engine.run(new Gcd());
            case 5 -> Engine.run(new Progression());
            case 6 -> Engine.run(new Prime());
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}
