//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Thread thread1 = new Thread(new MyRunnable("Ping"));
    Thread thread2 = new Thread(new MyRunnable("Pong"));

    System.out.println("Game start!");

    thread2.start();
    thread1.start();

    try{
      thread1.join();
      thread2.join();
    }catch(InterruptedException e){
      System.out.println("Main thread Interrupted error");
    }



    System.out.println("Game over!");
  }
}