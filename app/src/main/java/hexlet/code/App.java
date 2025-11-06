package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

public final class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + GREET + " - Greet\n"
                + EVEN + " - Even\n"
                + CALC + " - Calc\n"
                + GCD + " - GCD\n"
                + PROGRESSION + " - Progression\n"
                + PRIME + " - Prime\n"
                + EXIT + " - Exit");
        System.out.print("Your choice: ");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case GREET -> Cli.greet();
            case EVEN -> EvenGame.initializeStart();
            case CALC -> Calculator.initializeStart();
            case GCD -> Gcd.initializeStart();
            case PROGRESSION -> Progression.initializeStart();
            case PRIME -> Prime.initializeStart();
            case EXIT -> System.out.println("Goodbye!");
            default -> System.out.println("Unknown user choice" + userChoice);
        }
        scanner.close();
    }
}
