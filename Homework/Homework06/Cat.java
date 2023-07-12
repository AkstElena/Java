package Homework.Homework06;

public class Cat {
  int id;
  String name;
  String owner;
  int age;
  String breed;
  boolean gender;

  @Override
  public String toString() {
    return String.format("id: %d; name: %s; owner: %s; age: %d;  breed: %s; gender: %s", id, name, owner, age, breed,
        gender);
  }

  @Override
  public boolean equals(Object obj) {
    Cat other = (Cat) obj;
    return name == other.name && owner == other.owner;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getOwner() {
    return owner;
  }

  public int getAge() {
    return age;
  }

  public String getBreed() {
    return breed;
  }

  public boolean isGender() {
    return gender;
  }

}
