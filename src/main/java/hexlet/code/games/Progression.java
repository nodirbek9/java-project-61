package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Progression implements Game {
    @Override
    public String getGameDescription() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] generateQuestionAndAnswer() {
        Random random = new Random();

        int firstElement = random.nextInt(20);
        int step = random.nextInt(9) + 1;
        int length = random.nextInt(6) + 5;

        int[] progression = progressionNumbers(firstElement, step, length);
        int hiddenIndex = random.nextInt(length);

        String progressionStr = "";
        for (int i = 0; i < length; i++) {
            if (i == hiddenIndex) {
                progressionStr += "..";
            } else {
                progressionStr += progression[i];
            }

            if (i < length - 1) {
                progressionStr += " ";
            }
        }

        String corrextAnswer = Integer.toString(progression[hiddenIndex]);
        return new String[]{progressionStr, corrextAnswer};
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
