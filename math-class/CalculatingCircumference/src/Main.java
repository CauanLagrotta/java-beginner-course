import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;

        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of the circumference: ");
        radius = input.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference: %.1fcm\n", circumference);
        System.out.printf("Area: %.1fcm²\n", area);
        System.out.printf("Volume: %.1fcm³\n", volume);

        input.close();
    }
}