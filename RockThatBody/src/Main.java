import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    // ==================== PHRASE1 =========================
    Timer timer1 = new Timer();
    TimerTask task1 = new TimerTask() {
      @Override
      public void run() {
        System.out.print("I wanna da-, ");
      }
    };
    timer1.schedule(task1, 500);

    // ================= PHRASE 2 ===========================
    Timer timer2 = new Timer();
    TimerTask task2 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("I wanna dance in the lights");
      }
    };
    timer2.schedule(task2, 1500);

    // ================= PHRASE 3 ===========================
    Timer timer3 = new Timer();
    TimerTask task3 = new TimerTask() {
      @Override
      public void run() {
        System.out.print("I wanna rock-, ");
      }
    };
    timer3.schedule(task3, 4000);

    // ================= PHRASE 4 ===========================
    Timer timer4 = new Timer();
    TimerTask task4 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("I wanna rock your body");
      }
    };
    timer4.schedule(task4, 5000);

    // ================= PHRASE 5 ===========================
    Timer timer5 = new Timer();
    TimerTask task5 = new TimerTask() {
      @Override
      public void run() {
        System.out.print("I wanna go-, ");
      }
    };
    timer5.schedule(task5, 8000);

    // ================= PHRASE 6 ===========================
    Timer timer6 = new Timer();
    TimerTask task6 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("I wanna go for a ride");
      }
    };
    timer6.schedule(task6, 9200);

    // ================= PHRASE 7 ===========================
    Timer timer7 = new Timer();
    TimerTask task7 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Hop in the music and rock your body");
      }
    };
    timer7.schedule(task7, 11500);

    // ================= PHRASE 8 ===========================
    Timer timer8 = new Timer();
    TimerTask task8 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Rock that body");
      }
    };
    timer8.schedule(task8, 15000);

    // ================= PHRASE 9 ===========================
    Timer timer9 = new Timer();
    TimerTask task9 = new TimerTask() {
      @Override
      public void run() {
        System.out.print("Come on ");
      }
    };
    timer9.schedule(task9, 16000);

    // ================= PHRASE 10 ===========================
    Timer timer10 = new Timer();
    TimerTask task10 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Come on");
      }
    };
    timer10.schedule(task10, 17000);

    // ================= PHRASE 11 ===========================
    Timer timer11 = new Timer();
    TimerTask task11 = new TimerTask() {
      @Override
      public void run() {
        System.out.println("Rock that body");
      }
    };
    timer11.schedule(task11, 18000);
  }
}
