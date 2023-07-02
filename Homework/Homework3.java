package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Homework3 {

  public static void main(String[] args) {

    ArrayList<Integer> numberList = new ArrayList<>();
    numberList = createArrayList(10, 100);

    // onlyEvenNumbers(numberList);

    System.out.printf("Минимальное значение списка: %d\n", Collections.min(numberList));
    System.out.printf("Максимальное значение списка: %d\n", Collections.max(numberList));
    // или
    numberList.sort(null);
    System.out.printf("Минимальное значение списка: %d\n", numberList.get(0));
    System.out.printf("Максимальное значение списка: %d\n", numberList.get(numberList.size() - 1));

    System.out.printf("Среденее значение списка: %d\n", mean(numberList));

    // planetsCounter(10);

  }

  // Задание 1
  // Пусть дан произвольный список целых чисел.
  // 1) Нужно удалить из него чётные числа
  // 2) Найти минимальное значение
  // 3) Найти максимальное значение
  // 4) Найти среднее значение

  static ArrayList<Integer> createArrayList(int size, int maxValue) {
    ArrayList<Integer> myList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < size; i++) {
      myList.add(random.nextInt(maxValue));
      System.out.print(myList.get(i) + " ");
    }
    System.out.println();
    return myList;

  }

  static void onlyEvenNumbers(ArrayList<Integer> list) {

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 == 0) {
        list.remove(i);
        i = i - 1;
      } else {
        System.out.print(list.get(i) + " ");
      }
    }
    System.out.println();

  }

  static Integer mean(ArrayList<Integer> list) {
    int summa = 0;
    for (int i = 0; i < list.size(); i++) {
      summa += list.get(i);
    }

    return summa / list.size();
  }

  // Задание 2
  // Для списка из задачи про Солнечную систему удалить все повторяющиеся
  // элементы.
  static void planetsCounter(int n) {
    List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
    List<String> randPlanets = new ArrayList<String>(n);

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
      System.out.print(randPlanets.get(i) + " ");
    }
    System.out.println();

    Set<String> set = new LinkedHashSet<>(randPlanets); // множество из элементов списка с повоторяющимися ланетами
    List<String> randPlanetsWithoutDuplicates = new ArrayList<>(set); // создаем новый список из набора и печатаем его

    for (String planet : randPlanetsWithoutDuplicates) {
      System.out.print(planet + " ");
    }
    ;

  }

}
