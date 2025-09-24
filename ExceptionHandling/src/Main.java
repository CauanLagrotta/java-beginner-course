import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try{
      System.out.print("Enter a number: ");
      int number = scanner.nextInt();
      System.out.println(number);
    }
    catch(InputMismatchException err){
      System.out.println("That wasn't a number");
    }
    catch(ArithmeticException err){
      System.out.println("You can't divide by zero!");
    }
    catch(Exception err){
      System.out.println("Something went wrong");
    }
    finally {
      scanner.close();
      System.out.println("This always executes");
    }
  }
}