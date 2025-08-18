
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Hello " + name);

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.println("You're " + age);

        // System.out.print("Enter your gpa: ");
        // double gpa = scanner.nextDouble();
        // System.out.println("Your gpa is: " + gpa);

        // scanner.close();

        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " +  area + " cm²");

        scanner.close();
    }
}
