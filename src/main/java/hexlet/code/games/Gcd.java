package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final Random random = new Random();

    public static void start() {

        String description = "Find the greatest common divisor of given numbers.";
        String[][] questionsAndAnswers = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }
        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int a = random.nextInt(50);
        int b = random.nextInt(50);

        return new String[]{a + " " + b, String.valueOf(calcNOD(a, b))};
    }

    public static int calcNOD(int a, int b) {
        int devider = 0;
        while (b != 0) {
            devider = a % b;
            a = b;
            b = devider;
        }
        return a;
    }
}
