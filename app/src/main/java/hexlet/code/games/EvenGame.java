package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class EvenGame {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int GENERATE_NUMBERS = 20;

    private EvenGame() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "Answer 'yes' if the number is even,"
                + " otherwise answer 'no'.";
        Engine.run(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num = RANDOM.nextInt(GENERATE_NUMBERS);
            questions[i] = Integer.toString(num);
            correctAnswers[i] = (num % 2 == 0) ? "yes" : "no";
        }
        return new String[][]{questions, correctAnswers};
    }
}

