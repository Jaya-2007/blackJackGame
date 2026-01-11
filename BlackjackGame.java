import java.util.Random;
import java.util.Scanner;

public class BlackjackGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int userTotal = 0;
        int dealerTotal = 0;

        System.out.println("Blackjack Game\n");

        int card1 = random.nextInt(11) + 1;
        int card2 = random.nextInt(11) + 1;
        userTotal = card1 + card2;
        System.out.println("Your cards: " + card1 + " and " + card2);
        System.out.println("Your total: " + userTotal);

        dealerTotal = random.nextInt(11) + 1;
        System.out.println("Dealer shows: " + dealerTotal);

        while (true) {
            if (userTotal > 21) {
                System.out.println("You busted!");
                break;
            }

            System.out.print("Do you want to Hit or Stand? (hit/stand): ");
            String choice = sc.next().toLowerCase();

            if (choice.equals("hit")) {
                int newCard = random.nextInt(11) + 1;
                userTotal += newCard;
                System.out.println("You drew: " + newCard);
                System.out.println("Your total: " + userTotal);
            } else if (choice.equals("stand")) {
                break;
            } else {
                System.out.println("Invalid input. Type 'hit' or 'stand'.");
            }
        }

        System.out.println("\nDealer's turn:");
        while (dealerTotal < 17) {
            int newCard = random.nextInt(11) + 1;
            dealerTotal += newCard;
            System.out.println("Dealer drew: " + newCard);
            System.out.println("Dealer total: " + dealerTotal);
        }

        System.out.println("\nFinal Scores");
        System.out.println("Your total: " + userTotal);
        System.out.println("Dealer total: " + dealerTotal);

        if (userTotal > 21) {
            System.out.println("Dealer Wins!");
        } else if (dealerTotal > 21) {
            System.out.println("You Win!");
        } else if (userTotal > dealerTotal) {
            System.out.println("You Win!");
        } else if (dealerTotal > userTotal) {
            System.out.println("Dealer Wins!");
        } else {
            System.out.println("It's a Tie!");
        }

        sc.close();
    }
}

