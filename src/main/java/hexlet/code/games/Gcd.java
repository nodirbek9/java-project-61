package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Gcd implements Game {
    @Override
    public String getGameDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateQuestionAndAnswer() {
        Random random = new Random();
        int a = random.nextInt(50);
        int b = random.nextInt(50);

        return new String[]{a + " " + b, String.valueOf(calcNOD(a, b))};
    }

    public static int calcNOD(int a, int b) {
        int devider = 0;
        while (b != 0) {
            if (b != 0) {
                devider = a % b;
                a = b;
                b = devider;
            }
        }
        return a;
    }
}
