import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
      int count = 3;

      @Override
      public void run() {
        System.out.println("Hello world");
        count--;
        if(count <= 0){
          System.out.println("task complete");
          timer.cancel();
        }
      }
    };

    timer.schedule(task, 0, 1000);
  }
}