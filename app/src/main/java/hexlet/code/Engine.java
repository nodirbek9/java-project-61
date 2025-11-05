package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private static final int ROUNDS_COUNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    private Engine() {
        throw new IllegalStateException("Utility class");
    }

    public static void start(String description, String[][] questionAndAnswer) {
        String[][] newquestionAndAnswer = new String[ROUNDS_COUNT][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            newquestionAndAnswer[i][0] = questionAndAnswer[0][i];
            newquestionAndAnswer[i][1] = questionAndAnswer[1][i];
        }
        Engine.run(description, newquestionAndAnswer);
    }

    public static void run(String description, String[][] questionsAndAnswers) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
