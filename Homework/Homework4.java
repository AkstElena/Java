package Homework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework4 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.printf("Input number one: ");
    Integer number1 = input.nextInt();
    System.out.printf("Input number two: ");
    Integer number2 = input.nextInt();

    input.close();
    Deque<Integer> myList1 = createList(number1);
    Deque<Integer> myList2 = createList(number2);

    System.out.printf("Mult of number: %s\n", multOfNumbers(myList1, myList2, number1, number2));

    Deque<Integer> myList3 = createList(number1);
    Deque<Integer> myList4 = createList(number2);
    System.out.printf("Summ of number: %s\n", summaOfNumbers(myList3, myList4));
  }

  /*
   * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
   * порядке и каждый из их узлов содержит одну цифру.
   * 1) Умножьте два числа и верните произведение в виде связанного списка.
   * 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два
   * числа должны быть отрицательными.
   */

  static Deque<Integer> getDeque(Integer number) {
    Deque<Integer> dequeList = new LinkedList<>();
    while (number > 0) {
      dequeList.addLast(number % 10);
      number = number / 10;
    }
    return dequeList;

  }

  static Deque<Integer> createList(Integer number) {

    if (number >= 0) {
      Deque<Integer> myList = getDeque(number);
      System.out.println(myList);
      return myList;
    } else {
      Deque<Integer> myList = getDeque(number * -1);
      System.out.println(myList);
      return myList;
    }
  }

  static LinkedList<Integer> multOfNumbers(Deque<Integer> list1, Deque<Integer> list2, Integer num1, Integer num2) {
    LinkedList<Integer> multList = new LinkedList<>();
    String res1 = "";
    while (list1.isEmpty() != true) {
      res1 = list1.poll() + res1;
    }
    String res2 = "";
    while (list2.isEmpty() != true) {
      res2 = list2.poll() + res2;
    }
    Integer k = Integer.parseInt(res1) * Integer.parseInt(res2);
    while (k > 0) {
      multList.addFirst(k % 10);
      k = k / 10;
    }
    if (num1 < 0 && num2 > 0) {
      multList.addFirst(multList.poll() * (-1));
      return multList;
    } else if (num1 > 0 && num2 < 0) {
      multList.addFirst(multList.poll() * (-1));
      return multList;
    } else {
      return multList;
    }

  }

  /*
   * static LinkedList<Integer> summaOfNumbers(Deque<Integer> list1,
   * Deque<Integer> list2, Integer num1, Integer num2) {
   * LinkedList<Integer> summList = new LinkedList<>();
   * Integer buffer = 0;
   * Integer n = 0;
   * if (num1 < 0 & num2 > 0) {
   * if (list1.size() > list2.size()) {
   * while (list2.isEmpty() != true) {
   * n = list1.poll() - list2.poll();
   * if (n < 0) {
   * summList.addFirst((10 + n) - buffer);
   * buffer = 1;
   * } else {
   * summList.addFirst(n - buffer);
   * buffer = 0;
   * }
   * }
   * while (list1.isEmpty() != true) {
   * summList.addFirst(-(list1.poll() - buffer));
   * buffer = 0;
   * }
   * } else if (list1.size() < list2.size()) {
   * while (list1.isEmpty() != true) {
   * n = list1.poll() - list2.poll();
   * if (n > 0) {
   * summList.addFirst((10 - n) - buffer);
   * buffer = 1;
   * } else {
   * summList.addFirst(n - buffer);
   * buffer = 0;
   * }
   * }
   * while (list2.isEmpty() != true) {
   * summList.addFirst((list2.poll() - buffer));
   * buffer = 0;
   * }
   * } else {
   * while (list1.isEmpty() != true & list2.isEmpty() != true) {
   * n = list1.poll() - list2.poll();
   * if (n < 0) {
   * summList.addFirst((10 - n) - buffer);
   * buffer = 1;
   * } else {
   * summList.addFirst(n - buffer);
   * buffer = 0;
   * }
   * }
   * if (buffer != 0) {
   * summList.addFirst(-(summList.poll() - buffer));
   * }
   * }
   * return summList;
   * } else if (num1 > 0 & num2 < 0) {
   * if (list1.size() > list2.size()) {
   * while (list2.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * while (list1.isEmpty() != true) {
   * summList.addFirst(list1.poll() + buffer);
   * buffer = 0;
   * }
   * } else if (list1.size() < list2.size()) {
   * while (list1.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * while (list2.isEmpty() != true) {
   * summList.addFirst(list2.poll() + buffer);
   * buffer = 0;
   * }
   * } else {
   * while (list1.isEmpty() != true & list2.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * if (buffer != 0) {
   * summList.addFirst(buffer);
   * }
   * }
   * return summList;
   * } else {
   * if (list1.size() > list2.size()) {
   * while (list2.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * while (list1.isEmpty() != true) {
   * summList.addFirst(list1.poll() + buffer);
   * buffer = 0;
   * }
   * } else if (list1.size() < list2.size()) {
   * while (list1.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * while (list2.isEmpty() != true) {
   * summList.addFirst(list2.poll() + buffer);
   * buffer = 0;
   * }
   * } else {
   * while (list1.isEmpty() != true & list2.isEmpty() != true) {
   * n = list1.poll() + list2.poll();
   * if (n >= 10) {
   * summList.addFirst(n % 10 + buffer);
   * buffer = n / 10;
   * } else {
   * summList.addFirst(n + buffer);
   * buffer = 0;
   * }
   * }
   * if (buffer != 0) {
   * summList.addFirst(buffer);
   * }
   * }
   * return summList;
   * }
   * }
   */

  static LinkedList<Integer> summaOfNumbers(Deque<Integer> list1, Deque<Integer> list2) {
    LinkedList<Integer> summList = new LinkedList<>();
    Integer buffer = 0;
    Integer n = 0;
    if (list1.size() > list2.size()) {
      while (list2.isEmpty() != true) {
        n = list1.poll() + list2.poll();
        if (n >= 10) {
          summList.addFirst(n % 10 + buffer);
          buffer = n / 10;
        } else {
          summList.addFirst(n + buffer);
          buffer = 0;
        }
      }
      while (list1.isEmpty() != true) {
        summList.addFirst(list1.poll() + buffer);
        buffer = 0;
      }
    } else if (list1.size() < list2.size()) {
      while (list1.isEmpty() != true) {
        n = list1.poll() + list2.poll();
        if (n >= 10) {
          summList.addFirst(n % 10 + buffer);
          buffer = n / 10;
        } else {
          summList.addFirst(n + buffer);
          buffer = 0;
        }
      }
      while (list2.isEmpty() != true) {
        summList.addFirst(list2.poll() + buffer);
        buffer = 0;
      }
    } else {
      while (list1.isEmpty() != true & list2.isEmpty() != true) {
        n = list1.poll() + list2.poll();
        if (n >= 10) {
          summList.addFirst(n % 10 + buffer);
          buffer = n / 10;
        } else {
          summList.addFirst(n + buffer);
          buffer = 0;
        }
      }
      if (buffer != 0) {
        summList.addFirst(buffer);
      }
    }
    return summList;
  }

}
