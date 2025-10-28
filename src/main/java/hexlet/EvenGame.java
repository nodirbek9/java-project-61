package hexlet;

import java.util.Scanner;

public class EvenGame {
    public  void chekEven() {
    Cli cli = new Cli();
    Scanner in = new Scanner(System.in);

    cli.welcomeToGame();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            int randomNum = (int) (Math.random() * 10);
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String userAnswer = in.nextLine();
            if (randomNum % 2 == 0 && userAnswer.equals("yes")) {
                System.out.println("Correct!");
            } else if (randomNum % 2 == 1 && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else if (randomNum % 2 == 0) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + cli.getName());
                return;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + cli.getName());
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }
}

