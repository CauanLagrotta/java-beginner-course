//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Car car = new Car("Ferrari SF15-T", 2015, "V8");

    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.engine.type);

    car.start();
  }
}