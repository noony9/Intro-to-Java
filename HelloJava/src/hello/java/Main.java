package hello.java;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n Hello Java!\n");
        System.out.println("This program is designed to provide to you a very unique opportunity.  Interested?  Type [Y OR N]\n");
        String userInput = getUserInput();

        if (userInput.equalsIgnoreCase("n")) {
            System.out.println("Thanks for stopping by.  Good day to youuuuu--__-_ERROR 38222.  Beep, boop, beep");
            pause(3);
        } else if (userInput.equalsIgnoreCase("y")) {

            // create bots
            GenericBot bot1 = new GenericBot("bot1", 100, 10, 20);

            GenericBot bot2 = new GenericBot("bot2", 100, 10, 20);

            System.out.println("Witness the creations of the future!!");

            pause(3);

            Bot[] bots = {bot1, bot2};

            // render bots
            for (var Bot : bots ){
                Bot.render();
                pause(2);
            }

            pause(3);
            Human human = new Human("Geoffery");

            System.out.println("Our hero has arrived!!  Behold:\n" + human.getName() + "\n");

            pause(5);

            System.out.println("Bot1's eyes turn red as he blurts: 1.2.3.4.... Executing Code 9 Alpha\n");

            pause(5);

            System.out.println("Bot1 turns silent and implodes...\n");

            bot1.destroyHuman(human);

            human.Parrish();

            pause(3);

            System.out.println("Thank you for enjoying this unique opportunity!  Until next time.\n");

        }

    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String value;
        while (true){
            value = scanner.next();
            if (value.equalsIgnoreCase("y") || value.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Please enter a valid character \"Y\" or \"N\".\n");
        }
        return value;
    }

    public static void pause(int secondsToPause) {
        try {
            TimeUnit.SECONDS.sleep((long)secondsToPause);
        } catch (InterruptedException var2) {
            Thread.currentThread().interrupt();
        }

    }
}