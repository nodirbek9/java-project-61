package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public class Calculator {
    private static final SecureRandom random = new SecureRandom();
    private static final int ROUNDS_COUNT = 3;
    private static final int GENERATE_NUMBERS = 20;

    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "What is the result of the expression?";
        Engine.start(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];
        char[] ops = {'+', '-', '*'};
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int a = random.nextInt(GENERATE_NUMBERS);
            int b = random.nextInt(GENERATE_NUMBERS);
            char op = ops[random.nextInt(ops.length)];
            questions[i] = a + " " + op + " " + b;
            correctAnswers[i] = switch (op) {
                case '+' -> Integer.toString(a + b);
                case '-' -> Integer.toString(a - b);
                case '*' -> Integer.toString(a * b);
                default -> throw new IllegalStateException("Unexpected value: " + op);
            };
        }
        return new String[][]{questions, correctAnswers};
    }
}
