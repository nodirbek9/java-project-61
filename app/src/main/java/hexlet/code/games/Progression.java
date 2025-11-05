package hexlet.code.games;

import hexlet.code.Engine;

import java.security.SecureRandom;
import java.util.Arrays;

public class Progression {
    private static final SecureRandom random = new SecureRandom();
    private static final int LENGTH = 10;
    private static final int ROUNDS_COUNT = 3;

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart() {
        String description = "What number is missing in the progression?";
        Engine.start(description, generateQuestionAndAnswer());
    }


    public static String[][] generateQuestionAndAnswer() {

        String[] questions = new String[ROUNDS_COUNT];
        String[] correctAnswers = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = random.nextInt(LENGTH);
            int step = random.nextInt(5) + 1;
            int hiddenIndex = random.nextInt(LENGTH);

            String[] progression = generateProgression(start, step, LENGTH);

            correctAnswers[i] = progression[hiddenIndex];
            progression[hiddenIndex] = "..";
            questions[i] = String.join(" ", progression);
        }
        return new String[][]{questions, correctAnswers};

    }

    public static String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];
        int current = first;

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(current);
            current += step;
        }

        return progression;
    }
}
