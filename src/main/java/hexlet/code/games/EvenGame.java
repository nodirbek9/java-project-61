package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class EvenGame {
    private static final SecureRandom random = new SecureRandom();
    private static final int ROUNDS_COUNT = 3;
    private static final int GENERATE_NUMBERS = 20;

    private EvenGame() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.start(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num = random.nextInt(GENERATE_NUMBERS);
            questions[i] = Integer.toString(num);
            if (num % 2 == 0) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }
        return new String[][]{questions, correctAnswers};
    }
}

