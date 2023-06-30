package Seminar;

import java.text.Format;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Seminar01
 */

public class Seminar1 {

  public static void main(String[] args) {

    // helloUser();
    // getCount();
    // arrayIndex();
    reversePhrase();
  }

  static void helloUser() {
    // 1.1. написать программу, которая запросит пользователя ввести "Имя" в
    // консоли. Получит введенную строку и выведет в консоль сообщение "Привет,
    // <Имя>!"
    // 1.2. Поприветствовать пользователя в соотвествествии с текущим временем суток

    Scanner sc = new Scanner(System.in);

    System.out.println("Input your name hear: ");
    String name = sc.nextLine();
    int hour = LocalDateTime.now().getHour();
    String dayTime = "";

    if (hour >= 4 && hour < 11)
      dayTime = "morning";
    else if (hour >= 11 && hour < 17)
      dayTime = "day";
    else if (hour >= 18 && hour < 23)
      dayTime = "evening";
    else
      dayTime = "night";

    System.out.printf("Godd %s, %s!", dayTime, name);

    sc.close();
  }

  static void getCount() {
    // 2. Дан массив двоичных чисел, состоящий из единиц и нулей []. Нужно вывести
    // максимально количество идущих подряд единиц
    int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
    int count = 0;
    int maxCount = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 1)
        count++;
      else if (count > maxCount) {
        maxCount = count;
        count = 0;
      } else
        count = 0;
    }
    if (count > maxCount)
      maxCount = count;
    System.out.println(maxCount);
  }

  static void arrayIndex() {
    // 3. Задан массив чисел (наприер nums = [1,7,3,6,5,6]), нужно найти такой
    // индекс массива, что сумма элементов с индексами меньше него, была равна сумме
    // элементов с индексами болше него
    int[] array = new int[] { 1, 7, 3, 6, 5, 6 };

    for (int i = 1; i < array.length - 1; i++) {
      int lefSum = 0;
      int rightSum = 0;

      for (int i1 = 0; i1 < i; i1++)
        lefSum += array[i1];
      for (int i2 = i + 1; i2 < array.length; i2++)
        rightSum += array[i2];

      if (lefSum == rightSum) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }

  static void reversePhrase() {
    // Задача 4. Во фразе Добро пожаловать на курс по Java переставить слова в
    // обратном порядке
    Scanner sc = new Scanner(System.in);

    System.out.println("Input your phrase: ");
    String phrase = sc.nextLine();
    String[] words = phrase.split(" ");
    for (int i = 0; i < words.length / 2; i++) {
      String temp = words[i];
      words[i] = words[words.length - 1 - i];
      words[words.length - 1 - i] = temp;
    }
    for (String word : words) {
      System.out.print(word + " ");
    }
    sc.close();
  }

}