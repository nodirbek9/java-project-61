package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;

public final class Calculator {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int GENERATE_NUMBERS = 20;

    private Calculator() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "What is the result of the expression?";
        Engine.run(description, generateQuestionAndAnswer());
    }

    public static String[][] generateQuestionAndAnswer() {
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];
        char[] ops = {'+', '-', '*'};
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = RANDOM.nextInt(GENERATE_NUMBERS);
            int b = RANDOM.nextInt(GENERATE_NUMBERS);
            char op = ops[RANDOM.nextInt(ops.length)];
            questions[i] = a + " " + op + " " + b;
            correctAnswers[i] = Integer.toString(calculateExpression(a, b, op));
        }
        return new String[][]{questions, correctAnswers};
    }

    public static int calculateExpression(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> (a + b);
            case '-' -> (a - b);
            case '*' -> (a * b);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
