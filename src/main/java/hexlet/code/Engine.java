package hexlet.code;

import hexlet.Cli;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static void run(Game game) {
        Scanner scanner = new Scanner(System.in);
        Cli cli = new Cli();
        cli.welcomeToGame();

        System.out.println(game.getGameDescription());

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] qa = game.generateQuestionAndAnswer();
            String question = qa[0];
            String correctAnswer = qa[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }
}
