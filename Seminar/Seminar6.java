package Seminar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Seminar6 {

  public static void main(String[] args) {
    task1(17);

  }

  /*
   * Task 1. Создайте метод, формирующий массив из N случайных целых чисел.
   * Создайте метод, в который передайте заполненный выше массив и
   * с помощью Set вычислите процент уникальных значений в данном массиве
   * и верните его в виде числа с плавающей запятой.
   */
  static void task1(Integer n) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < n; i++) {
      numbers.add(random.nextInt(10));
    }
    System.out.println(numbers);

    Set<Integer> mySet = Set.copyOf(numbers);
    System.out.println(mySet);
    double lenSet = mySet.size();
    double persent = lenSet / numbers.size();
    System.out.printf("Percentage of unique values: %f", persent);

  }

}
