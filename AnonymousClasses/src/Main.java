//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    Dog dog2 = new Dog(){
      @Override
      void speak(){
        System.out.println("Scooby doo says: ruh roh");
      }
    };



    dog1.speak();
    dog2.speak();

  }
}