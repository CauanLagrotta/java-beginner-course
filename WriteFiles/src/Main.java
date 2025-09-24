import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    String filePath = "/home/cauan/test.txt";
    String textContext = """
        Roses are red
        Violet are blue
        Booty Booty Booty
        Rock'in everywhere!
        """;

    try(FileWriter writer = new FileWriter(filePath)){
      writer.write(textContext);
      System.out.println("File has been written");
    }
    catch (FileNotFoundException err){
      System.out.println("Could not locate file location");
    }
    catch(IOException err){
      System.out.println("Could not write");
    }
  }
}