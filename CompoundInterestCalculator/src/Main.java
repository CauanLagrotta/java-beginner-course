import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = input.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = input.nextInt();

        System.out.print("Enter the # of years: ");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);


        input.close();
    }
}