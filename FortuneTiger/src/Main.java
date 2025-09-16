import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;
        boolean isPlaying = true;

        System.out.println("=======================");
        System.out.println("Welcome to Java slots");
        System.out.println("Symbols: 🍌 🍏 🍉 🍒 🍍");
        System.out.println("=======================");

        do {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("Insufficient funds");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            if (balance <= 0) {
                scanner.nextLine();
                System.out.println("--------------");
                System.out.println("| GAME OVER! |");
                System.out.println("---------------");
                System.out.print("Do you want to play again? (y/n) ");
                playAgain = scanner.nextLine().toLowerCase();

                if(playAgain.equals("y")){
                    balance = 100;
                }else{
                    isPlaying = false;
                }
            }
        }


        while (isPlaying);

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍌", "🍏", "🍉", "🍒", "🍍"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("==============");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("==============");
    }

    static int getPayout(String[] row, int bet) {
        // Check for three matching symbols
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍌" -> bet * 3;
                case "🍏" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🍒" -> bet * 10;
                case "🍍" -> bet * 20;
                default -> 0;
            };
        }

        if (row[0].equals(row[1]) || row[0].equals(row[2])) {
            return switch (row[0]) {
                case "🍌" -> bet + 1;
                case "🍏" -> bet + 2;
                case "🍉" -> bet + 3;
                case "🍒" -> bet + 4;
                case "🍍" -> bet + 5;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍌" -> bet + 1;
                case "🍏" -> bet + 2;
                case "🍉" -> bet + 3;
                case "🍒" -> bet + 4;
                case "🍍" -> bet + 5;
                default -> 0;
            };
        }

        return 0;
    }
}
