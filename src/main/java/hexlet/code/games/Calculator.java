package hexlet.code.games;

import hexlet.Cli;
import hexlet.code.Game;

import java.util.Random;

public class Calculator implements Game {

    @Override
    public String getGameDescription() {
        return "What is the result of the expression?";
    }

    @Override
    public String[] generateQuestionAndAnswer() {
        Random random = new Random();
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
