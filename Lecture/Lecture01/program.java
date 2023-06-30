package Lecture.Lecture01;

/**
 * program
 */
import java.util.Scanner;

public class program {
  public static void main(String[] args) {
    // System.out.println("bye world!!!");

    // float f = 123.45f;
    // double d = 123.4;
    // System.out.println(f + d);

    // boolean flag1 = 123 <= 234;
    // System.out.println(flag1); // true
    // boolean flag2 = 123 >= 234 || flag1;
    // System.out.println(flag2); // true
    // boolean flag3 = flag1 ^ flag2;
    // System.out.println(flag3); // false
    // }

    // var a = 123;
    // System.out.println(a); // 123
    // var d = 123.456;
    // System.out.println(d); // 123.456
    // System.out.println(getType(a)); // Integer
    // System.out.println(getType(d)); // Double
    // d = 1022;
    // System.out.println(d); // 1022
    // // d = "mistake";
    // // error: incompatible types:
    // // String cannot be converted to double
    // }

    // static String getType(Object o) {
    // return o.getClass().getSimpleName();

    // int n = 123;
    // n = --n - --n;
    // System.out.println(n);

    // int a = 5; // в двоичном 101
    // int b = 2; // в двоичном 010
    // System.out.println(a | b); // в двоичном 111, то есть 7
    // System.out.println(a & b); // в двоичном 000, то есть 0

    // String s = "qwer";
    // boolean b = s.length() >= 5 && s.charAt(4) == '1';
    // System.out.println(b);

    // int[][] arr = new int[3][5];
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.printf("%d ", arr[i][j]);
    // }
    // System.out.println();
    // // }
    // int i = 123;
    // double d = i;
    // System.out.println(i); // 123
    // System.out.println(d); // 123.0
    // d = 3.1415;
    // i = (int) d;
    // System.out.println(d); // 3.1415
    // System.out.println(i); // 3
    // d = 3.9415;
    // i = (int) d;
    // System.out.println(d); // 3.9415
    // System.out.println(i); // 3
    // byte b = Byte.parseByte("123");
    // System.out.println(b); // 123
    // b = Byte.parseByte("1234");
    // System.out.println(b); // NumberFormatException: Value out of range
    // Scanner iScanner = new Scanner(System.in); // получение строки от
    // пользователя
    // System.out.printf("name: ");
    // String name = iScanner.nextLine();
    // System.out.printf("Привет, %s!", name);
    // iScanner.close();

    // Scanner iScanner = new Scanner(System.in); // получение числа от пользователя
    // System.out.printf("int a: ");
    // int x = iScanner.nextInt();
    // System.out.printf("double a: ");
    // double y = iScanner.nextDouble();
    // System.out.printf("%d + %f = %f", x, y, x + y);
    // iScanner.close();

    // Scanner iScanner = new Scanner(System.in); // проверка данных на получение
    // соответстующего типа
    // System.out.printf("int a: ");
    // boolean flag = iScanner.hasNextInt();
    // System.out.println(flag);
    // int i = iScanner.nextInt();
    // System.out.println(i);
    // iScanner.close();

    // int a = 1, b = 2;
    // int c = a + b;
    // // String res = a + " + " + b + " = " + c;
    // // System.out.println(res);
    // String res = String.format("%d + %d = %d \n", a, b, c);
    // System.out.printf("%d + %d = %d \n", a, b, c);
    // System.out.println(res);

    sayHi(); // hi!
    System.out.println(sum(1, 3)); // 4
    System.out.println(factor(5)); // 120.0
  }

  static void sayHi() {
    System.out.println("hi!");
  }

  static int sum(int a, int b) {
    return a + b;
  }

  static double factor(int n) {
    if (n == 1)
      return 1;
    return n * factor(n - 1);
  }

}
