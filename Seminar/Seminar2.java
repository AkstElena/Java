package Seminar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Seminar2 {
  public static void main(String[] args) throws SecurityException, IOException {

    // System.out.println(getString(10, 's', 'f'));
    // System.out.println(stringCompress("aaaabbbcddee"));
    // System.out.println(polindromSeminar("aa ss aa"));
    // System.out.println(polindrom("aa ss aA"));
    // System.out.println(longStrigCreator("test", 100));
    // String pathProject = System.getProperty("user.dir");
    // String pathFile = pathProject.concat("\\seminar2-1.txt");
    // addingToFile(pathFile, longStrigCreator("world!", 10));

    String pathProject = System.getProperty("user.dir");
    String pathFile2 = pathProject.concat("\\seminar2-2.txt");
    addListToFile(pathFile2, showCurrentFiles(pathProject));

  }

  static String getString(int n, char c1, char c2) {
    // Дано четное число N (>0) и символы с1 и с2.
    // Написать метод, который вернет строку длины N, которая состоит из
    // чередующихся символов с1 и с2, начиная с с1.
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n / 2; i++) {
      sb.append(c1);
      sb.append(c2);
    }
    return sb.toString();

  }

  static String stringCompress(String str) {
    // напишите метод, который сжимает строку. Пример, на вход аааавввдддсе, на
    // выходе а4в3д3сеe
    StringBuilder newStr = new StringBuilder();
    char simbol = str.charAt(0);
    newStr.append(simbol);
    int count = 0;
    for (char letter : str.toCharArray()) {
      if (letter == simbol)
        count++;
      else {
        if (count != 1)
          newStr.append(count);
        newStr.append(letter);
        simbol = letter;
        count = 1;
      }
    }
    if (count != 1)
      newStr.append(count);
    return newStr.toString();
  }

  static boolean polindrom(String str) {

    // Напишите метод, который принимает на вход строку и определяет является ли
    // строка полиндромом. Возвращает булевое значения
    String text = str.replace(" ", "").toLowerCase();
    StringBuilder message = new StringBuilder(text).reverse();
    return text.equals(message.toString());

  }

  static boolean polindromSeminar(String str) {
    StringBuilder res = new StringBuilder("");

    for (int i = str.length() - 1; i >= 0; i--)
      res.append(str.charAt(i));

    return str.equals(res.toString());
  }

  // Напишите метод, который составит строку, состоящую из 100 повторений слова
  // test и метод который запишет эту строку в текстовый файл обработать
  // исключения
  static String longStrigCreator(String word, int iters) {

    StringBuilder str = new StringBuilder(word);
    for (int i = 0; i < iters; i++) {
      str.append(word);
    }
    return str.toString() + "\n";
  }

  static void addingToFile(String filePath, String text) {
    try {
      File myFile = new File(filePath);
      FileWriter writer = new FileWriter(myFile, true);

      writer.write(text);
      writer.close();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  // Напишите метод, который вернет содержимое текущей папки в виде массива строк
  // Напишите метод, которой запишет массив возвращенный предыдущим методов в
  // файл
  // Обработайте Try/Catch. В случае возникновения исключения, оно должно
  // записаться в log файл

  static String[] showCurrentFiles(String dirPath) {
    File currentDir = new File(dirPath);
    return currentDir.list();
  }

  static void addListToFile(String filePath, String[] list) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(Seminar2.class.getName()); // указываем кто делает
    FileHandler fh = new FileHandler("Seminar2-2(log).txt"); // указываем куда делает

    logger.addHandler(fh); // связали предыдущие факты между собой

    SimpleFormatter simple = new SimpleFormatter(); // указали как будет делать
    fh.setFormatter(simple);

    try {
      File myFile = new File(filePath);
      FileWriter writer = new FileWriter(myFile);

      for (String str : list) {
        writer.write(str + "\n");
      }
      writer.close();

    } catch (Exception e) {
      logger.warning(e.getMessage());
    }

  }
}