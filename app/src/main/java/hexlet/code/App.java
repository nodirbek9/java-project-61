package hexlet.code;

import hexlet.Cli;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Cli newcli = new Cli();
        newcli.welcomeToGame();
    }
}
