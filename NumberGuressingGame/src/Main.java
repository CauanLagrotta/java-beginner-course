import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number guessing game: ");
        System.out.printf("Guess a number between %d-%d: ", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess < randomNumber){
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("too high, try again");
            }else {
                System.out.printf("Congratulations, you won it with %d attempts!", attemps);
            }

        }while(guess != randomNumber);

        scanner.close();
    }
}