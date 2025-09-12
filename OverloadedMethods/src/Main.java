//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
    }

    static String bakePizza(String bread){
        return bread + " pizza";
    }
}