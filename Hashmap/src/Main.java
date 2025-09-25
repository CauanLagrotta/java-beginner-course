import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    HashMap<String, Double> map = new HashMap<>();

    map.put("apple", 0.50);
    map.put("orange", 0.75);
    map.put("banana", 0.25);
    map.put("coconut", 1.00);

//    map.remove("apple");

//    System.out.println(map.containsKey("apple"));

//    if(map.containsKey("apple")){
//      System.out.println(map.get("apple"));
//    }
//    else{
//      System.out.println("Key not found");
//    }

    for(String key : map.keySet()){
      System.out.println(key + " : $" + map.get(key));
    }
  }
}