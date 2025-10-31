package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final Random random = new Random();

    public static void start() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < 3; i++) {
            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }

        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int num = random.nextInt(20);
        int forChek = num % 2;
        String result = switch (forChek) {
            case 0 -> "yes";
            case 1 -> "no";
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
        return new String[]{String.valueOf(num), result};
    }
}

