import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> foods = new ArrayList<>();

    System.out.print("Enter the # of food you would like: ");
    int numOfFood = scanner.nextInt();
    scanner.nextLine();

    for(int i = 1; i <= numOfFood; i++){
      System.out.print("Enter food number #" + i + ": ");
      String food = scanner.nextLine();
      foods.add(food);
    }

    System.out.println(foods);
    scanner.close();
  }
}