package Seminar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Seminar05
 */
public class Seminar5 {

  public static void main(String[] args) {
    // task1();
    // task2();
    // task3();
    task4();

  }

  static void task1() {
    // Task 1. Создать структуру для хранения номеров паспортов и фамилий
    // сотрудников.
    Map<String, String> workers = new HashMap<>();
    workers.put("92 05 553929", "Иванов");
    workers.put("92 05 321526", "Петров");
    workers.put("92 05 235659", "Сидоров");
    workers.put("92 20 556655", "Иванов");
    workers.put("92 25 322111", "Петров");

    for (Map.Entry<String, String> worker : workers.entrySet()) {
      if (worker.getValue().equals("Иванов")) {
        System.out.printf("Pasport number: %s, Worker surname: %s\n", worker.getKey(), worker.getValue());
      }

    }

  }

  static void task2() {
    // Task 2. Написать метод, который переведет число из римского формата записи в
    // арабский.
    Map<Character, Integer> rinNums = new HashMap<>();
    rinNums.put('I', 1);
    rinNums.put('V', 5);
    rinNums.put('X', 10);
    rinNums.put('L', 50);
    rinNums.put('C', 100);
    rinNums.put('D', 500);
    rinNums.put('M', 1000);

    Scanner input = new Scanner(System.in);

    System.out.println("Input a number in a Rome case");
    char[] romNumber = input.nextLine().toUpperCase().toCharArray();
    int res = 0;

    for (int i = 0; i < romNumber.length; i++) {
      if (i != romNumber.length - 1 && rinNums.get(romNumber[i]) < rinNums.get(romNumber[i + 1])) {
        res += rinNums.get(romNumber[i + 1]) - rinNums.get(romNumber[i]);
        i++;
      } else
        res += rinNums.get(romNumber[i]);
    }

    System.out.println(res);
    input.close();

  }

  static void task3() {
    // Написать метод, который сортирует строки по длине с помощью TreeMap.
    Scanner input = new Scanner(System.in);
    System.out.print("Input a string: ");
    String[] words = input.nextLine().split(" ");

    Map<Integer, String> sortedWords = new TreeMap<>();

    for (String word : words) {
      sortedWords.put(word.length(), word);
    }

    System.out.println(sortedWords);
    input.close();

  }

  static void task4() {
    // Уточнение прошлой задачи. Строки с одинаковой длиной не должны “потеряться”.
    Scanner input = new Scanner(System.in);

    System.out.println("Input a string: ");
    String[] words = input.nextLine().split(" ");

    Map<Integer, LinkedList<String>> sortedWords = new TreeMap<>();

    for (String word : words) {
      if (sortedWords.containsKey(word.length())) {
        sortedWords.get(word.length()).add(word);
      } else {
        sortedWords.put(word.length(), new LinkedList<>());
        sortedWords.get(word.length()).add(word);
      }

    }

    System.out.println(sortedWords);
    input.close();

  }
}