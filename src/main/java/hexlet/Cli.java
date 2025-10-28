package hexlet;
import java.util.Scanner;

public class Cli {
    String name;

    public Cli() {
    }

    public void welcomeToGame(){
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!" + "\n" +
                            "May I have your name? ");

        name = in.nextLine();
        System.out.println("Hello, " + name);
    }

    public String getName() {
        return name;
    }
}
