package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final Random random = new Random();

    public static void start() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[3][2];
        for (int i = 0; i < 3; i++) {

            String[] qa = generateQuestionAndAnswer();
            questionsAndAnswers[i][0] = qa[0];
            questionsAndAnswers[i][1] = qa[1];
        }

        Engine.run(description, questionsAndAnswers);
    }

    public static String[] generateQuestionAndAnswer() {
        int num = random.nextInt(50);
        boolean resFunc = predicateFunc(num);

        String result = "";
        if (resFunc) {
            result = "yes";
        } else {
            result = "no";
        }
        return new String[]{String.valueOf(num), result};
    }

    public static boolean predicateFunc(int n) {
        int sqrtN = (int) Math.sqrt(n);
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
