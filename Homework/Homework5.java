package Homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Homework5 {

  /*
   * Реализуйте структуру телефонной книги с помощью HashMap.
   * Программа также должна учитывать, что во входной структуре будут
   * повторяющиеся имена с разными телефонами, их необходимо считать, как одного
   * человека с разными телефонами. Вывод должен быть отсортирован по убыванию
   * числа телефонов.
   */

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out
        .print("Menu:\n 1 Show phone book\n 2 Add contact\n 3 Delite contact\n 4 Exsit\n");
    System.out
        .print("Select menu item: ");
    Integer menuNumber = input.nextInt();
    switch (menuNumber) {
      case 1:
        System.out.println(showPhoneBook());
        break;
      case 2:
        addContact();
        break;
      case 3:
        deliteContact();
        break;
      case 4:
        System.out.println("Goodbye, have a nice day");
        break;
      default:
        System.out.println("Invalid number entered!");
        break;
    }
    input.close();
  }

  static Map<String, LinkedList<String>> showPhoneBook() {
    Map<String, LinkedList<String>> phoneBook = new LinkedHashMap<>();
    // LinkedHashMap сортирует по значению, TreeMap сортирует по ключу
    phoneBook.put("Elena", new LinkedList<>());
    phoneBook.get("Elena").add("89231586566");
    phoneBook.put("Mark", new LinkedList<>());
    phoneBook.get("Mark").add("89271586767");
    phoneBook.put("Anton", new LinkedList<>());
    phoneBook.get("Anton").add("89031586588");
    return (phoneBook);
  }

  static void addContact() {
    Scanner input = new Scanner(System.in);
    System.out.print("How many contacts to add: ");
    Integer quantity = input.nextInt();

    Map<String, LinkedList<String>> phoneBook = showPhoneBook();
    for (int i = 0; i < quantity; i++) {
      System.out.print("Input a name: ");
      String name = input.next();
      System.out.print("Input a number phone: ");
      String phoneNamber = input.next();

      if (phoneBook.containsKey(name)) {
        phoneBook.get(name).add(phoneNamber);
      } else {
        phoneBook.put(name, new LinkedList<>());
        phoneBook.get(name).add(phoneNamber);
      }
    }
    System.out.println(phoneBook);
    input.close();
  }

  static void deliteContact() {

    Map<String, LinkedList<String>> phoneBook = showPhoneBook();
    System.out.println(phoneBook);

    Scanner input = new Scanner(System.in);
    System.out.print("Input name contact for delite: ");
    String name = input.nextLine();

    if (phoneBook.keySet().contains(name)) {
      phoneBook.keySet().remove(name);
    } else {
      System.out.println(name + " not found");
    }
    System.out.println(phoneBook);
    input.close();
  }

}
