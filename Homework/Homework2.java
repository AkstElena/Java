package Homework;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

  public static void main(String[] args) throws SecurityException, IOException {

    // int[] array = new int[] { 2, 8, 4, 5, 1, 11, 3 };
    // String pathProject = System.getProperty("user.dir");
    // String pathFile = pathProject.concat("\\log.txt");
    // bubleSortLogFile(pathFile, array);

    // String dirPath = System.getProperty("user.dir");
    // getFileExtension(dirPath);

    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("\\logCalculator.txt");
    calculator(pathFile);
  }

  static void getFileExtension(String dirPath) {
    // 1) Напишите метод, который определит тип (расширение) файлов из текущей папки
    // и выведет в консоль результат вида
    // 1 Расширение файла: txt
    // 2 Расширение файла: pdf
    // 3 Расширение файла:
    // 4 Расширение файла: jpg

    File currentDir = new File(dirPath);
    File[] allFiles = currentDir.listFiles();
    for (int j = 0; j < allFiles.length; j++) {
      System.out.printf("%d: %s\n", j + 1, allFiles[j]);
    }
    int punct = 1;
    for (File file : allFiles) {
      String res = file.toString().substring(file.toString().indexOf(".") + 1);
      System.out.printf("%d Расширение файла: %s\n", punct, res);
      punct++;
    }
  }

  static void bubleSortLogFile(String filePath, int[] array) throws SecurityException, IOException {
    // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат,
    // после каждой итерации запишите в лог-файл.
    Logger logger = Logger.getLogger(Homework2.class.getName());
    FileHandler fh = new FileHandler("log.txt");
    logger.addHandler(fh);

    SimpleFormatter simple = new SimpleFormatter();
    fh.setFormatter(simple);

    int temp = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          logger.info(Arrays.toString(array));
        }
      }
    }
  }

  static void calculator(String filePath) throws SecurityException, IOException {
    // 4) К калькулятору из предыдущего ДЗ добавить логирование.
    Logger logger = Logger.getLogger(Homework2.class.getName());
    FileHandler fh = new FileHandler("logCalculator.txt", true);
    logger.addHandler(fh);

    Scanner sc = new Scanner(System.in);
    System.out.println(
        " Menu of calculator: \n1: addition (+) \n2: subtraction (-)  \n3: multiplication (*) \n4: division (/)");
    System.out.println("Choose one math operation: ");
    int operation = sc.nextInt();
    System.out.println("Input first number: ");
    float number1 = sc.nextFloat();
    System.out.println("Input second number: ");
    float number2 = sc.nextFloat();
    Float res = 0.0f;
    String resStr = "";
    switch (operation) {
      case 1:
        res = number1 + number2;
        resStr += number1 + " + " + number2 + " = " + res;
        logger.info(resStr);
        break;
      case 2:
        res = number1 - number2;
        resStr += number1 + " - " + number2 + " = " + res;
        logger.info(resStr);
        break;
      case 3:
        res = number1 * number2;
        resStr += number1 + " * " + number2 + " = " + res;
        logger.info(resStr);
        break;
      case 4:
        res = number1 / number2;
        resStr += number1 + " / " + number2 + " = " + res;
        logger.info(resStr);
        break;
      default:
        res = -1f;
        resStr += "incorrect command";
        logger.info(resStr);
        break;
    }
    System.out.printf("calculation result: %.1f", res);
    sc.close();

  }

}
