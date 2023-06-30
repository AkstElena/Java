package Homework;

import java.util.Scanner;

public class Homework1 {

  public static void main(String[] args) {
    // triangularNumber();
    // primeNumber();
    // calculator();
    equation();
  }

  static void triangularNumber() {
    // 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
    // (произведение чисел от 1 до n)
    Scanner sc = new Scanner(System.in);
    System.out.println("Input namber: ");
    int number = sc.nextInt();
    int summNumbers = 0;
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      summNumbers += i;
    }
    System.out.printf("Summ numbers from 1 to %d = %d\n", number, summNumbers);
    for (int i = 2; i <= number; i++) {
      factorial *= i;
    }
    System.out.printf("Multiplication numbers from 1 to %d = %d", number, factorial);
    sc.close();
  }

  static void primeNumber() {
    // 2) Вывести все простые числа от 1 до 1000
    int n = 1000;
    boolean b = true;
    for (int i = 2; i <= n; i++) {
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          b = false;
        }
      }
      if (b) {
        System.out.print(i + " ");
      } else
        b = true;
    }
  }

  static void calculator() {
    // 3) Реализовать простой калькулятор
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
    switch (operation) {
      case 1:
        res = number1 + number2;
        break;
      case 2:
        res = number1 - number2;
        break;
      case 3:
        res = number1 * number2;
        break;
      case 4:
        res = number1 / number2;
        break;
      default:
        res = -1f;
        break;
    }
    System.out.printf("calculation result: %.1f", res);
    sc.close();

  }

  static void equation() {
    // 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
    // Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы
    // одно решение или сообщить, что его нет.

    System.out.println("Enter an equation in format q + w = e, where q, w, e >= 0) (example: 2? + ?5 = 69): ");
    Scanner sc = new Scanner(System.in);
    String equation = sc.nextLine();
    // String equation = "?4 + ?5 = 68";
    String[] array = equation.split(" ");
    int summa = Integer.parseInt(array[4]);
    boolean flag = false;

    if (array[0].charAt(1) == '?' && array[2].charAt(0) == '?') {
      int n1 = array[0].charAt(0) - '0';
      int n2 = array[2].charAt(1) - '0';
      for (int i = 0; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          if (n1 * 10 + i + j * 10 + n2 == summa) {
            flag = true;
            System.out.printf("%d%d + %d%d = %d\n", n1, i, j, n2, summa);
          }
        }
      }
      if (flag == false)
        System.out.println("no solution");
    } else if (array[0].charAt(1) == '?' && array[2].charAt(1) == '?') {
      int n1 = array[0].charAt(0) - '0';
      int n2 = array[2].charAt(0) - '0';
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          if (n1 * 10 + i + n2 * 10 + j == summa) {
            flag = true;
            System.out.printf("%d%d + %d%d = %d\n", n1, i, n2, j, summa);
            break;
          }
          break;
        }
      }
      if (flag == false)
        System.out.println("no solution");
    } else if (array[0].charAt(0) == '?' && array[2].charAt(0) == '?') {
      int n1 = array[0].charAt(1) - '0';
      int n2 = array[2].charAt(1) - '0';
      for (int i = 1; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          if (i * 10 + n1 + j * 10 + n2 == summa) {
            flag = true;
            System.out.printf("%d%d + %d%d = %d\n", i, n1, j, n2, summa);
            break;
          }
          break;
        }
      }
      if (flag == false)
        System.out.println("no solution");
    } else if (array[0].charAt(0) == '?' && array[2].charAt(1) == '?') {
      int n1 = array[0].charAt(1) - '0';
      int n2 = array[2].charAt(0) - '0';
      for (int i = 1; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          if (i * 10 + n1 + n2 * 10 + j == summa) {
            flag = true;
            System.out.printf("%d%d + %d%d = %d\n", i, n1, n2, j, summa);
          }
        }
      }
      if (flag == false)
        System.out.println("no solution");
    }
    sc.close();
  }

}
