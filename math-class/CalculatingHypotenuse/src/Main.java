import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double c;
        double hypotenuse;

        System.out.print("Enter the A side of the triangle: ");
        a = input.nextDouble();

        System.out.print("Enter the B side of the triangle: ");
        b = input.nextDouble();

        c = Math.pow(a, 2) + Math.pow(b, 2);
        hypotenuse = Math.sqrt(c);
        System.out.println("Hypotenuse: " + hypotenuse);

        input.close();
    }
}