package hello.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;


public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        // Greet user
        System.out.println("This program is designed to provide to you a very unique opportunity.  Interested?  Type [Y OR N]\n");

        // Request input from user and assign it as a string variable
        String userInput = null;

        // Continue to request user entry until "Y" or "N" is entered
        do {
            System.out.println("Please enter the character \"Y\" or \"N\".\n");
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            try {
                userInput = bufferRead.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (!userInput.equals("Y") && !userInput.equals("N"));

        // If user was not interested, terminate program.
        if (userInput.equals("N")) {
            System.out.println("Thanks for stopping by.  Good day to youuuuu--__-_ERROR 38222.  Beep, boop, beep");
        }

        // If user was interested, continue program.
        else {
            // Spawn some bots
            GenericBot bot1 = new GenericBot("bot1", "Error", 100, 10, 20);
            GenericBot bot2 = new GenericBot("bot2", "Error", 100, 10, 20);

            // Notify user of spawn process
            System.out.println("Witness the creations of the future!!");

            // Insert a PAUSE for 3 seconds to control the flow of the program
            try {
                long secondsToSleep = 3;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Notify of the birth of bot1
            System.out.println("Creating bot: beep, boop, beep.....\n");
            System.out.println("Unit name:" + bot1.getName() + "\n" + "Code:" + " " + bot1.getCodeWord() + "\n" + "Intelligence Level:" + " " + bot1.getIQ() + "\n\n");

            // Insert a PAUSE for 3 seconds to control the flow of the program
            try {
                long secondsToSleep = 3;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Notify of the birth of bot2
            System.out.println("Creating bot: beep, boop, beep.....\n");
            System.out.println("Unit name:" + bot2.getName() + "\n" + "Code:" + " " + bot2.getCodeWord() + "\n" + "Intelligence Level:" + " " + bot2.getIQ() + "\n\n");

            // Insert a PAUSE for 3 seconds to control the flow of the program
            try {
                long secondsToSleep = 3;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Create one bot to rule them all!
            CompuBot Botinik = new CompuBot("Botinik", "Rabble", 5000, 10);

            // Notify of birth of the one bot

            System.out.println("For we were all deceived as another was made, one bot to rule them all!!\n");

            // Insert a PAUSE for 3 seconds to control the flow of the program
            try {
                long secondsToSleep = 3;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Unit name:" + Botinik.getName() + "\n" + "Code:" + " " + Botinik.getCodeWord() + "\n" + "Intelligence Level:" + " " + Botinik.getIQ() + "\n");

            // Insert a PAUSE for 3 seconds to control the flow of the program
            try {
                long secondsToSleep = 3;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Spawn a human
            Human human = new Human("Geoffery");

            // Notify of the birth of the human
            System.out.println("Our hero has arrived!!  Behold:\n" + human.getName() + "\n");

            // Insert a PAUSE for 5 seconds to control the flow of the program
            try {
                long secondsToSleep = 5;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Notify user of Bot1's execution statement
            System.out.println("Bot1's eyes turn red as he blurts: 1.2.3.4.... Executing Code 9 Alpha\n");

            // Insert a PAUSE for 5 seconds to control the flow of the program
            try {
                long secondsToSleep = 5;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            // Destroy the human
            System.out.println("Bot1 turns silent and implodes...\n");
            bot1.destroyHuman();
            human.Parrish();

            // Insert a PAUSE for 5seconds to control the flow of the program
            try {
                long secondsToSleep = 5;
                TimeUnit.SECONDS.sleep(secondsToSleep);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            System.out.println("Thank you for enjoying this unique opportunity!  Until next time.\n");

            // Get user input to end program
            System.out.println("Please enter any key to exit the program\n");
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            try {
                userInput = bufferRead.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

