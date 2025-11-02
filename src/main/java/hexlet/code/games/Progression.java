package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final Random random = new Random();
    private static final int LENGTH = 10;
    private static final int ROUNDS_COUNT = 3;

    private Progression() {
        throw new IllegalStateException("Utility class");
    }

    public static void initializeStart(){
        String description = "What number is missing in the progression?";
        Engine.start(description, generateQuestionAndAnswer());
    }


    public static String[][] generateQuestionAndAnswer() {

        int[] progression;
        String[] progressionStr = new String[ROUNDS_COUNT];
        String[] correctAnswer = new String[ROUNDS_COUNT];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int start = random.nextInt(LENGTH);
            int step = random.nextInt(5) + 1;
            int hiddenIndex = random.nextInt(LENGTH);

            progression = Progression.progressionNumbers(start, step, LENGTH);

            for (int j = 0; j < LENGTH; j++) {
                if (j == 0) {
                    progressionStr[i] = Integer.toString(progression[j]);
                } else if (j == hiddenIndex ) {
                    progressionStr[i] = "..";
                } else {
                    progressionStr[i] += progression[j];
                }
                if (j < LENGTH - 1) {
                    progressionStr[i] += " ";
                }
            }
            correctAnswer[i] = Integer.toString(progression[hiddenIndex]);
        }

        return new String[][]{progressionStr, correctAnswer};
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
