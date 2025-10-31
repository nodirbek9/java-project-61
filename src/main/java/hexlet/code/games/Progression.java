package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final Random random = new Random();
    private static final int LENGTH = 10;
    private static final int ROUNDS_COUNT = 3;

    public static void start() {
        String description = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[3][2];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }

        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {

        int start = random.nextInt(LENGTH);
        int step = random.nextInt(5) + 1;
        int hiddenIndex = random.nextInt(LENGTH);

        int[] progression = progressionNumbers(start, step, LENGTH);

        String progressionStr = "";
        for (int i = 0; i < LENGTH; i++) {
            if (i == hiddenIndex) {
                progressionStr += "..";
            } else {
                progressionStr += progression[i];
            }

            if (i < LENGTH - 1) {
                progressionStr += " ";
            }
        }

        String correctAnswer = Integer.toString(progression[hiddenIndex]);
        return new String[]{progressionStr, correctAnswer};
    }

    public static int[] progressionNumbers(int first, int step, int length) {
        int[] progression = new int[length];
        progression[0] = first;
        for (int i = 1; i < length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
