import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        int choice;
        double amount;

        do {
            System.out.println("================");
            System.out.println("BANKING PROGRAM");
            System.out.println("================");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("\nYour balance: $%.2f \n", balance);
                    break;

                case 2:
                    System.out.print("How much would you like to deposit? $");
                    balance += scanner.nextDouble();
                    break;

                case 3:
                    if (balance > 0) {
                        System.out.print("How much would you like to withdraw? $");
                        amount = scanner.nextDouble();

                        if (amount > balance) {
                            System.out.println("Insufficient funds");
                        } else {
                            balance -= amount;
                        }

                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;

                case 4:
                    System.out.println("See you soon! 👋");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}