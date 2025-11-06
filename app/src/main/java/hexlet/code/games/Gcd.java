package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Gcd {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int GENERATE_NUMBERS = 50;

    private Gcd() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "Find the greatest common "
                + "divisor of given numbers.";
        Engine.start(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = RANDOM.nextInt(GENERATE_NUMBERS);
            int b = RANDOM.nextInt(GENERATE_NUMBERS);
            questions[i] = a + " " + b;
            correctAnswers[i] = Integer.toString(gcd(a, b));
        }

        return new String[][]{questions, correctAnswers};
    }

    public static int gcd(int a, int b) {
        int devider;
        while (b != 0) {
            devider = a % b;
            a = b;
            b = devider;
        }
        return a;
    }
}
