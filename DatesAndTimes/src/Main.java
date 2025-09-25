import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
//    LocalDate date = LocalDate.now();
//    LocalTime time = LocalTime.now();
//    LocalDateTime dateTime = LocalDateTime.now();
//    Instant instant = Instant.now();
//
//    System.out.println(instant);

//    LocalDateTime dateTime = LocalDateTime.now();
//
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//    String newDateTime = dateTime.format(formatter);
//    System.out.println(newDateTime);

    LocalDateTime date = LocalDateTime.of(2025, 9, 25, 10, 29, 0);
    System.out.println(date);
  }
}