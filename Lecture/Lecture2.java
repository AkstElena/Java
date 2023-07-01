
import java.io.File;

/**
 * Lecture2
 */
public class Lecture2 {

  public static void main(String[] args) {

    // String plus = "";
    // for (int i = 0; i < 100; i++) {
    // plus += "+";
    // }
    // System.out.print(plus);

    // plusDocumentation();
    // primer();
    primerException();
  }

  static void plusDocumentation() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100; i++) {
      sb.append("+");
    }
    System.out.println(sb);

  }

  static void primer() {
    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Cергей
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
    // C,е,р,г,е,й
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
  }

  static void fileWork() {
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/file.txt");
    File f3 = new File(pathFile);
    System.out.println(f3.getAbsolutePath());
    // /Users/sk/vscode/java_projects/file.txt
    // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
  }

  static void primerException() {
    try {
      String pathProject = System.getProperty("user.dir"); // указыается путь к папке
      String pathFile = pathProject.concat("/file.txt"); // указывается конкретный файл из этой папки
      File f3 = new File(pathFile); // созадется файловая переменная, для связывания программы с файлом
      System.out.println("try");
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
    }
  }
}
