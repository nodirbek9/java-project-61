package hexlet.code;

import hexlet.Cli;
import hexlet.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cli newcli = new Cli();
        EvenGame evenGame = new EvenGame();
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                newcli.welcomeToGame();
                break;
            case 2:
                evenGame.chekEven();
            case 0:
                in.close();
            default:
                break;

        }
    }
}
