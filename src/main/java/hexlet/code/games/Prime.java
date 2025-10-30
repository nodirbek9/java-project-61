package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class Prime implements Game {
    @Override
    public String getGameDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] generateQuestionAndAnswer() {
        Random random = new Random();

        int num = random.nextInt(50);
        boolean resFunc = predicateFunc(num);

        String result = "";
        if (resFunc == true) {
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
