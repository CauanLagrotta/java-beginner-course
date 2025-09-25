import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a day of the week: ");
    String response = scanner.nextLine().toUpperCase();

    try{
      Day day = Day.valueOf(response);

      switch (day){
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Its weekday");
        case SATURDAY, SUNDAY -> System.out.println("Its weekend");
      }
    }catch(IllegalArgumentException err){
      System.out.println("Please enter a valid day");
    }

    scanner.close();
  }
}