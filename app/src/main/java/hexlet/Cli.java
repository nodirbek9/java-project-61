package hexlet;
import java.util.Scanner;

public class Cli {
    public void welcomeToGame(){
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }
}
