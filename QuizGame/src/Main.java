import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Who is know as the father of computer?",
                "What was the first programming language?"
        };

        String[][] options = {
                {"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve jobs", "2. Bill gates", "3. Alan Turing", "4. Charles babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"},
        };

        int[] answers = { 3, 1, 2, 4, 3, };
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("Welcome to Java quiz game");
        System.out.println("=========================");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("===============");
                System.out.println("Correct answer!");
                System.out.println("===============");
                score++;
            }else{
                System.out.println("===============");
                System.out.println(" Wrong answer! ");
                System.out.println("===============");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}