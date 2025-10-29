package hexlet.code.games;

import hexlet.Cli;
import hexlet.code.Game;

import java.util.Random;
import java.util.Scanner;

public class EvenGame implements Game {

    @Override
    public String getGameDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String[] generateQuestionAndAnswer() {
        Random random = new Random();
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

