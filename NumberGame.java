import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Number Game!!");
        String playagain = "yes";
        int roundswon = 0;
        int totalAttempts = 0;

        while (playagain.equalsIgnoreCase("yes")) {

            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;

            System.out.println("guess the number between 1 to 100");

            while (attempts < 10) {
                System.out.println("Enter your guess: ");
                int userguess;

                try {
                    userguess = scanner.nextInt();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input.Enter another number");
                    scanner.nextLine();
                    continue;
                }
                attempts++;

                if (userguess < secretNumber) {
                    System.out.println("The number is too low,Try again");
                } else if (userguess > secretNumber) {
                    System.out.println("The number is too high,Try again");
                } else {
                    System.out.println("Congratulations!! You've guessed the number" + secretNumber + "in" + attempts
                            + "attempts");
                    roundswon++;
                    totalAttempts += attempts;
                    break;

                }
            }
            if (attempts == 10) {
                System.out.println(
                        "\nSorry, You reached maximum number of attempts.The correct number was" + secretNumber);
            }
            System.out.println("\n Do you want to play again?(yes/no):");
            playagain = scanner.next();
        }
        if (roundswon > 0) {
            double averageAttempts = (double) totalAttempts / roundswon;
            System.out.println("You won " + roundswon + "rounds ");

        } else {
            System.out.println("Thanks for playing!! Byeee...");
        }
        scanner.close();
    }

}