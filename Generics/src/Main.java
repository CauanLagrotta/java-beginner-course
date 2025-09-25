import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

//    Box<String> box = new Box<>();
//
//    box.setItem("banana");
//
//    System.out.println(box.getItem());

    Product<String, Double> product = new Product<>("Shirt", 21.99);
    System.out.println(product.getItem());
  }
}