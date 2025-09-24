import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    String filePath = "/home/cauan/test.txt";

    try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
      String line;
      while((line = reader.readLine()) != null){
        System.out.println(line);
      }
    }
    catch(FileNotFoundException err){
      System.out.println("Could not locate file");
    }
    catch(IOException err){
      System.out.println("Something went");
    }
  }
}