import java.util.Random;
import java.util.Scanner;
public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Rock Paper Scissor Game");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        while (true) {
            System.out.print("Enter your choice (1/2/3): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3) + 1;
            System.out.println("Computer chose: " + getChoice(computerChoice));
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
    public static String getChoice(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissor";
            default:
                return "";
            }
        }
}

