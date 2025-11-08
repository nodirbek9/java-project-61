package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Prime {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int MULTIPLE_NUM = 50;

    private Prime() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.";
        Engine.run(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num = RANDOM.nextInt(MULTIPLE_NUM);
            questions[i] = Integer.toString(num);
            correctAnswers[i] = isPrime(num) ? "yes" : "no";
        }
        return new String[][]{questions, correctAnswers};
    }

    public static boolean isPrime(int n) {
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
