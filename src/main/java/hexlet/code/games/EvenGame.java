package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final Random random = new Random();
    private static final int ROUNDS_COUNT = 3;
    private static final int GENERATE_NUMBERS = 20;

    public static void start() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }

        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int num = random.nextInt(GENERATE_NUMBERS);
        int forChek = num % 2;
        String result = switch (forChek) {
            case 0 -> "yes";
            case 1 -> "no";
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
        return new String[]{String.valueOf(num), result};
    }
}

