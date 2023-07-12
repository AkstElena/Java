package Homework.Homework06;

public class Program {

  public static void main(String[] args) {

    Cat cat1 = new Cat();
    cat1.id = 1000;
    cat1.name = "Barsic";
    cat1.owner = "Ivan";
    cat1.age = 7;
    cat1.breed = "Siamese";
    cat1.gender = true;

    Cat cat2 = new Cat();
    cat2.id = 1050;
    cat2.name = "Lea";
    cat2.owner = "Mark";
    cat2.age = 3;
    cat2.breed = "Sphynx";
    cat2.gender = false;

    Cat cat3 = new Cat(); // для понимания переопределения сравнения
    cat3.id = 1052;
    cat3.name = "Lea";
    cat3.owner = "Mark";
    cat3.age = 8;
    cat3.breed = "Sphynx";
    cat3.gender = false;

    System.out.println(cat1.toString());
    System.out.println(cat2.toString());

    System.out.println(cat1.equals(cat2));
    System.out.println(cat2.equals(cat3));

    System.out.println(cat1.getClass());

    System.out.println(cat1.getOwner());

  }

}
