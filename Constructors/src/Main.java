//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("Spongebob", 30, 3.2);
    Student student2 = new Student("Patrick", 20, 1.2);
    Student student3 = new Student("Sandy", 27, 5.0);

    System.out.println(student1.name);
    System.out.println(student1.age);
    System.out.println(student1.gpa);
    System.out.println(student1.isEnrolled);

    System.out.println(student2.name);
    System.out.println(student2.age);
    System.out.println(student2.gpa);
    System.out.println(student2.isEnrolled);

    System.out.println(student3.name);
    System.out.println(student3.age);
    System.out.println(student3.gpa);
    System.out.println(student3.isEnrolled);


  }
}