class Car {
  String color;
  int speed;

  void display() {
      System.out.println("Color: " + color + ", Speed: " + speed + " km/h");
  }
}

public class Main1 {
  public static void main(String[] args) {
      Car myCar = new Car();
      myCar.color = "Red";
      myCar.speed = 120;
      myCar.display();
  }
}
