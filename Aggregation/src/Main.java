//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Book book1 = new Book("Secret dinner", 200);
    Book book2 = new Book("Perfect days", 194);
    Book book3 = new Book("The knight locked in his armor", 100);

    Book[] books = { book1, book2, book3 };

    Library library = new Library("Public library", 1897, books);
    library.displayInfo();
  }
}