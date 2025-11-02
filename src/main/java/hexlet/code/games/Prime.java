package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Prime {
    private static final SecureRandom random = new SecureRandom();
    private static final int ROUNDS_COUNT = 3;

    private Prime() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.start(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num = random.nextInt(50);
            questions[i] = Integer.toString(num);
            if (predicateFunc(num)) {
                correctAnswers[i] = "yes";
            } else {
                correctAnswers[i] = "no";
            }
        }
        return new String[][]{questions, correctAnswers};
    }

    public static boolean predicateFunc(int n) {
        int sqrtN = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
