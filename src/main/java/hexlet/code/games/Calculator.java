package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    private static Random random = new Random();

    public static void start() {
        String description = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }

        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int a = random.nextInt(20);
        int b = random.nextInt(20);
        char[] ops = {'+', '-', '*'};
        char op = ops[random.nextInt(ops.length)];

        int result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };

        return new String[]{a + " " + op + " " + b, String.valueOf(result)};
    }
}
