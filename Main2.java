class Person {
  String name;
  int age;

  // Constructor Overloading
  Person() {
      name = "Unknown";
      age = 0;
  }

  Person(String n, int a) {
      name = n;
      age = a;
  }

  void display() {
      System.out.println("Name: " + name + ", Age: " + age);
  }

  // Destructor (not guaranteed - finalize is deprecated in Java 9+)
  @Override
  protected void finalize() throws Throwable {
      System.out.println("Person object is destroyed");
  }
}

public class Main2 {
  public static void main(String[] args) {
      Person p1 = new Person();
      Person p2 = new Person("Alice", 30);
      p1.display();
      p2.display();
      p1 = null;
      p2 = null;
      System.gc(); // Request JVM to run GC
  }
}

