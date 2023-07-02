package Seminar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class Seminar3 {

  public static void main(String[] args) {

    // createAndSortArray(10, 100);
    // listPlanet(20);
    // planetsCounter(20);
    booksCatalog(3);

  }

  static void createAndSortArray(int n, int maxValue) {
    // заполнить список n случайными числами, отсортировать список методом сорт и
    // вывести на экран
    ArrayList<Integer> myList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < n; i++) {
      myList.add(random.nextInt(maxValue));
    }
    System.out.println(myList);
    myList.sort(null);

    Iterator<Integer> iterator = myList.iterator(); // для того, чтобы посмотреть как работает итератор
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }

    // System.out.println(myList);

  }

  static void listPlanet(int n) {
    // необходимо заполнить список названиями планет Солнечной системы в
    // приозвольном порядке и с повторениями, вывести название каждой планеты и
    // количество его повторений в списке
    // мое решение
    String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

    ArrayList<String> myList = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < n; i++) {
      myList.add(planets[random.nextInt(planets.length)]);
    }

    System.out.println(myList);
    myList.sort(null);
    System.out.println(myList);

    int count = 0;
    String current = myList.get(0);
    for (String string : myList) {
      if (string == current) {
        count++;
      } else {
        System.out.printf("%s - %d\n", current, count);
        current = string;
        count = 1;
      }

    }
    System.out.printf("%s - %d\n", current, count);

  }

  static void planetsCounter(int n) {

    // решение на семинаре
    List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
    List<String> randPlanets = new ArrayList<String>(n);
    int[] counts = new int[listPlanets.size()];

    Random rand = new Random();

    for (int i = 0; i < n; i++) {
      randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
      System.out.print(randPlanets.get(i) + " ");
      counts[listPlanets.indexOf(randPlanets.get(i))]++;
    }

    System.out.println();

    // for (String planet : randPlanets) { // перенесли выше сразу в цикл
    // counts[listPlanets.indexOf(planet)]++;
    // }

    for (int i = 0; i < counts.length; i++) {
      System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
    }

  }

  static void booksCatalog(int size) {
    // каталог товаров книжного магазина сохранен в виде двумерного списка
    // List<ArrayList<String>> так что на нулевой позиции каждого внутреннего списка
    // пишется название жанра, а на остальных позицях название книг. Напишите метод
    // для заполнения данного структуры.
    List<String> geners = List.of("Fantasy", "Comedy", "Detectiv", "Horror");
    List<ArrayList<String>> catalog = new ArrayList<>(geners.size());
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < geners.size(); i++) {
      ArrayList<String> booksOfGenre = new ArrayList<>(size);
      booksOfGenre.add(geners.get(i));
      System.out.printf("Input %d titles of %s genre down here: \n", size, geners.get(i));
      for (int j = 0; j < size; j++) {
        booksOfGenre.add(sc.nextLine());
      }
      catalog.add(booksOfGenre);
    }

    sc.close();
    for (ArrayList<String> books : catalog) {
      for (String book : books) {
        System.out.print(book + " ");
      }
      System.out.println();
    }

  }

}
