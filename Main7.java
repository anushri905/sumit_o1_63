class Box<T> {
  T value;

  void setValue(T value) {
      this.value = value;
  }

  T getValue() {
      return value;
  }
}

public class Main7 {
  public static <T> void print(T data) {
      System.out.println("Data: " + data);
  }

  public static void main(String[] args) {
      Box<String> stringBox = new Box<>();
      stringBox.setValue("Hello Generics");
      System.out.println(stringBox.getValue());

      print(123);
      print("Generic Method");
  }
}

